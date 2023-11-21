package br.edu.unifip.ecommerceapi.controllers;

import br.edu.unifip.ecommerceapi.dtos.AddressDTO;
import br.edu.unifip.ecommerceapi.models.Address;
import br.edu.unifip.ecommerceapi.repositories.AddressRepository;
import br.edu.unifip.ecommerceapi.services.AddresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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


    final AddresService addresService;

    public AddressController(AddresService addresService) {
        this.addresService = addresService;
    }

    @Autowired
    private AddressRepository repository;


    @PostMapping
    @Transactional
    public void cadastrarEndereco(@RequestBody @Valid AddressDTO address){
        repository.save(new Address(address));
    }

    @GetMapping
    public Page<AddressDTO> listarEnderecos(Pageable paginacao) {
        return repository.findAll(paginacao).map(AddressDTO::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getEnderecoById(@PathVariable(value = "id") Long id) {
        Optional<Address> adressOptional = addresService.findById(id);
        if (adressOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(adressOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEndereco(@PathVariable(value = "id") Long id) {
        Optional<Address> enderecoOptional = addresService.findById(id);
        if (enderecoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        addresService.Delete(enderecoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Address deleted successfully.");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateEndereco(@PathVariable(value = "id") Long id, @RequestBody Map<Object, Object> objectMap) {
        Optional<Address> adressOptional = addresService.findById(id);
        if (adressOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found.");
        }
        addresService.partialUpdate(adressOptional.get(), objectMap);
        return ResponseEntity.status(HttpStatus.OK).body("Address updated successfully.");
    }

}
