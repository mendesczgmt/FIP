package br.edu.unifip.ecommerceapi.services;

import br.edu.unifip.ecommerceapi.dtos.AddressDTO;
import br.edu.unifip.ecommerceapi.models.Address;
import br.edu.unifip.ecommerceapi.repositories.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddresService {

    final AddressRepository addressRepository;

    public AddresService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Optional<Address> findById(UUID id) {
        return addressRepository.findById(id);
    }

    public AddressDTO createAddress(AddressDTO addressDTO) {

        Address address = convertToEntity(addressDTO);

        return convertToDTO(addressRepository.save(address));
    }



    private AddressDTO convertToDTO(Address address) {
        return new AddressDTO(address.getId(),address.getLogradouro(), address.getCidade(), address.getBairro(), address.getUf());
    }

    private Address convertToEntity(AddressDTO addressDTO) {
        Address address = new Address(addressDTO);
        address.setLogradouro(addressDTO.logradouro());
        address.setCidade(addressDTO.cidade());
        address.setBairro(addressDTO.bairro());
        address.setUf(addressDTO.uf());
        return address;
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
