package com.reges.regesspring.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
public abstract class Pessoa {

    private int id;
    private String nomeCompleto; //razao social
    private String nomeResumido; //fantasia
    private String email;
    private Endereco endereco;
    private String telefone;
    private Calendar dataNascFund;//data de nascimento e fundação
    private String documento; //cnpj ou cpf
    private String rgIe; //inscricao estadual ou rg

    public Pessoa(int id, String nomeCompleto, String nomeResumido, Endereco endereco, String telefone, Calendar dataNascFund, String documento, String rgIe, String email) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeResumido = nomeResumido;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascFund = dataNascFund;
        this.documento = documento;
        this.rgIe = rgIe;
        this.email = email;
    }




}