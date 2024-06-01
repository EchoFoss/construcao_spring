package com.reges.regesspring.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Setter
@Getter
public class Cliente extends Pessoa {

    private String cartaoFidelidade;

    public Cliente(int id, String nomeCompleto, String nomeResumido, Endereco end, String telefone, Calendar dataNascFund, String documento, String rgIe, String email, String cartaoFidelidade) {
        super(id,nomeCompleto, nomeResumido, end,telefone, dataNascFund, documento, rgIe,email);
        this.cartaoFidelidade = cartaoFidelidade;
    }
    
}