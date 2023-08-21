public class Operdores {

   public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    System.out.println(nomeCompleto);
    String concatenacao = "?";
    System.out.println(concatenacao);

    concatenacao = 1+1+"1";
    System.out.println(concatenacao);

    // Quando o identificado uma String, para-se a contagem com + 
    // Então é feita a concatenacao
    // Por sua vez, quando é deixado em evidência, primeiro realiza-se a soma, depois a concatenacao 
    // "1"+(1+1+1) => saída // 13

   }

    
    
}
