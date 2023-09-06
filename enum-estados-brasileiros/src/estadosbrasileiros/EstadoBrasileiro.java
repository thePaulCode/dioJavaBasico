package estadosbrasileiros;

public enum EstadoBrasileiro {

    SAO_PAULO ("São Paulo", "SP", 11),
    RIO_JANEIRO ("Rio de Janeiro", "RJ", 21),
    PARANA ("Paran\u00E1", "PR", 43),
    SANTA_CATARINA ("Santa Catarina", "SC", 45);

    private String nome;
    private String sigla;
    private int ibge;

    // construtor

    private EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    

}
