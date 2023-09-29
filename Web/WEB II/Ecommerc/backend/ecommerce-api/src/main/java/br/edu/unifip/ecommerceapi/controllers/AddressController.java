package br.edu.unifip.ecommerceapi.controllers;

import br.edu.unifip.ecommerceapi.dtos.AddressDTO;
import br.edu.unifip.ecommerceapi.models.Address;
import br.edu.unifip.ecommerceapi.repositories.AddressRepository;
import br.edu.unifip.ecommerceapi.services.AddresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("address")
public class AddressController {

    final AddresService addressService;

    public AddressController(AddresService addresService) {
        this.addressService = addresService;
    }

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    @Transactional
    public void createAddress(@RequestBody @Valid AddressDTO addressDTO) {
        addressRepository.save(new Address(addressDTO));
    }

    @GetMapping
    public ResponseEntity<Optional<Address>> getAddressByUserId(@PathVariable UUID Id) {
        Optional<Address> addressDTO = addressService.findById(Id);
        if (addressDTO != null) {
            return ResponseEntity.ok(addressDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAddressById(@PathVariable(value = "id") UUID id) {
        Optional<Address> addressOptional = addressService.findById(id);
        if (addressOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(addressOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAddress(@PathVariable(value = "id") UUID id) {
        Optional<Address> addressOptional = addressService.findById(id);
        if (addressOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        addressService.Delete(addressOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Address deleted successfully.");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateAddress(@PathVariable(value = "id") UUID id, @RequestBody Map<Object, Object> objectMap) {
        Optional<Address>addressOptional = addressService.findById(id);
        if (addressOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        addressService.partialUpdate(addressOptional.get(), objectMap);
        return ResponseEntity.status(HttpStatus.OK).body("Address updated successfully.");
    }

}
