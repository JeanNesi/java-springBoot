package com.satc.satcloja.health;

import com.satc.satcloja.model.Cliente;
import com.satc.satcloja.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ClienteController {

    @Autowired
    public ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String clienteService() {
        Cliente cliente = new Cliente();
        cliente.setCpf("04589624751");
        cliente.setRg("5478956");
        cliente.setNome("Jean");
        cliente.setEmail("jean@gmail.com");
        cliente.setEndereco("Rua tal");
        cliente.setTelefone("99899854585");

        clienteRepository.save(cliente);

        return "Comando executado: " + cliente.getId();
    }
}
