package escola;

public class Aluno {

    private String nome;
    private int idade;

    private String sexo;

    private String endereco;
    private String profissao;

    // Construtor
    // Garantir que na inicialização do objeto
    // seja informado dados/atributos RELEVANTES para a criação
    public Aluno(String endereco, String profissao) {
        this.endereco = endereco;
        this.profissao = profissao;
    }
    
    public Aluno() {
    }

    // GENERATE GETTERS AND SETTERS
    // Source Action
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
