package br.edu.unifip.ecommerceapi.services;

import br.edu.unifip.ecommerceapi.models.Address;
import br.edu.unifip.ecommerceapi.repositories.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AddresService {

    final AddressRepository addressRepository;

    public AddresService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Optional<Address> findById(Long id){
        return addressRepository.findById(id);
    }

    @Transactional
    public void Delete(Address address) {
        addressRepository.delete(address);
    }

    public Address partialUpdate(Address address, Map<Object, Object> objectMap) {
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findRequiredField(Address.class, (String) key);
            field.setAccessible(true);

            try {
                value = BigDecimal.valueOf((double) value);
            }
            catch(ClassCastException ignored) { }
            ReflectionUtils.setField(field, address, value);
        });
        return addressRepository.save(address);
    }
}
