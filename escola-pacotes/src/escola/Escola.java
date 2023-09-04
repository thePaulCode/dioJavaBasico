package escola;

public class Escola {
    public static void main(String[] args) {
        // criar um objeto
        Aluno stella = new Aluno("Olavo B", "Promotora");
        //Aluno isaac = new Aluno();

        // atribuicao de valores  - estruturas
        /*stella.nome = "Stella";
        stella.idade = 8;*/
        // GETTERS SETTERS
        stella.setNome("Stella");
        stella.setIdade(10);
        stella.setSexo("Feminino");

        // obter os valores dos atributos
        System.out.println("A aluna "+stella.getNome()+ " tem "+stella.getIdade()+ " anos de idade e é do sexo "+stella.getSexo()+".");
        System.out.println("Logadouro na Rua "+stella.getEndereco()+" e sua profissão é "+stella.getProfissao()+".");
    }
    
}
