package com.reges.regesspring.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    
    private int id;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;
    private int idCliente;


    public Endereco(
            int id,
            String logradouro,
            String bairro,
            String numero,
            String cidade,
            String uf,
            String cep,
            String complemento,
            int idCliente
    ) {

        this.id = id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.complemento = complemento;
        this.idCliente = idCliente;
    }
}