package model;

import enums.FormaPagamento;
import java.time.LocalDate;

public class Transacao {
    private static Integer contadorContratos;
    private Integer nroContrato;
    private LocalDate dataTransacao;
    private Double valorReal;
    private Double valorImobiliaria;
    private Double commisaoFuncionario;
    private FormaPagamento formaPagamento;
    private Imovel imovel;
    private ClienteUsuario clienteUsuario;
    private Funcionario funcionario;

    //criar o construtor, getters e setters

    public static int gerarProximoNumeroContrato(){}
    public void setNroContrato(){}
    public void calcularRepasses(){}
    public void validarFormaPagamento(){}
}
