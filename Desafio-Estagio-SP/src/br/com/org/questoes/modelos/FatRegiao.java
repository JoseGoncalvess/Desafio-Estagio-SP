package br.com.org.questoes.modelos;

public enum FatRegiao {
    SAO_PAULO("SP",67836.43,"São Paulo"),
    RIO_DE_JANEIRO("RJ",36678.66,"Rio De Janeiro"),
    MINAS_GERAIS("MG",29229.88,"Minas Gerais"),
    ESPIRITO_SANTO("ES",27165.48,"Espirito Santo"),
    OUTROS("OUTROS",19849.53,"OUTROS ESTADOS");


    private String sigla;
    private double valorFaturado;
    private  String nome;

   private FatRegiao(String sigla, double valor,String nome) {
        this.sigla = sigla;
        this.valorFaturado = valor;
        this.nome = nome;
    }

    public double getValorFaturado() {
        return valorFaturado;
    }

    private void setValorFaturado(double valorFaturado) {
        this.valorFaturado = valorFaturado;
    }

    public String getSigla() {
        return sigla;
    }

    private void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
