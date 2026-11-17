package model;

import java.util.List;

public abstract class Cliente {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private List<String> telefones;
    private String email;
    private String sexo;
    private String estadoCivil;
    private String profissao;
}
