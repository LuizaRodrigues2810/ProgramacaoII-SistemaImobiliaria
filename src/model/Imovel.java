package model;

import enums.CategoriaIMovel;
import enums.FinalidadeImovel;
import enums.SituacaoImovel;
import java.time.LocalDate;
import java.util.List;

public abstract class Imovel {
    protected CategoriaIMovel categoria;
    private FinalidadeImovel finalidade;
    private SituacaoImovel situacao;
    private LocalDate dataConstrucao;
    private LocalDate dataAnuncio;
    private Double area;
    private Endereco endereco;
    private Double valorSugerido;
    private List<ClienteProprietario> proprietarios;
}
