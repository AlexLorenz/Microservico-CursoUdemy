package com.br.myfood.cadastro.entity;

import com.br.myfood.cadastro.dto.ClientDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table("tbCliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String password;

    public static Client create(ClientDTO clientDTO) {
        return new ModelMapper().map(clientDTO, Client.class);
    }
}
