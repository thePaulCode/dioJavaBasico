public class ExemploForArray {
    public static void main(String[] args) {
        String [] alunos  = { "Paulo", "Ana", "Isaac", "Stella Artois"};

        /*
        for (int i=0; i < alunos.length; i++){
            System.out.println("O aluno no indece i=" + i + " é " + alunos[i]);
        }
        */

        // Usando for each
        // a cada iteração de alunos, o indice atual a variável aluno irá obter o valor do índice
        // aluno - variável de escopo (temporária)
        
        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
        
    }
}
