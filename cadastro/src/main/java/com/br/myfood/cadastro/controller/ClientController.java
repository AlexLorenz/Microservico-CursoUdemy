package com.br.myfood.cadastro.controller;

import com.br.myfood.cadastro.dto.ClientDTO;
import com.br.myfood.cadastro.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/insert")
    public ResponseEntity insertClient(@RequestBody ClientDTO clientDTO) {

        return ResponseEntity.ok(clientService.insertClient(clientDTO));
    }
}
