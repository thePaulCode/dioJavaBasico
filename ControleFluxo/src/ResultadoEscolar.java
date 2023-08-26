public class ResultadoEscolar {
    public static void main(String[] args) {

        double nota = 6.5;
        // Condicoes Ternarias
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Prova de Recuperação" : "Reprovado";
        System.out.println(resultado);
        /*
        if(nota >= 7)
        System.out.println("Aluno Aprovado");

        else if(nota >= 5 && nota < 7){
            System.out.println("Prova de Recuperação");
        }

        else
        System.out.println("Aluno Reprovado");
        */
    }
}
