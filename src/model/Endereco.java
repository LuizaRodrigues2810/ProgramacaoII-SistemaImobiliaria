package model;

public class Endereco {
    private final String logradouro;
    private final String numero;
    private final String complemento;
    private final String bairro;
    private final String cidade;
    private final String estado;
    private final String cep;


    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade,
                    String estado, String cep) {
        if (logradouro == null || logradouro.isBlank() ||
                numero == null || numero.isBlank() ||
                bairro == null || bairro.isBlank() ||
                cidade == null || cidade.isBlank() ||
                estado == null || estado.isBlank() ||
                cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("Campos obrigatórios do endereço não podem estar vazios!");
        }


        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;


    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }


    @Override
    public String toString() {
        String texto = logradouro + ", " + numero;

        if (complemento != null && !complemento.isBlank()) {
            texto += ", " + complemento;
        }

        texto += ", " + bairro + ", " + cidade + " - " + estado + ", " + "CEP: " + cep;

        return texto;

    }


}
