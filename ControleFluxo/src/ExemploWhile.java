import java.util.concurrent.ThreadLocalRandom;

/**
 * ExemploWhile
 */
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
         double valorDoce = valorAleatorio();

         if(valorDoce > mesada)
         valorDoce = mesada;

         System.out.println("Valor do doce R$ "+valorDoce+" adicionado ao carrinho.");

         mesada = mesada - valorDoce;

    }

    System.out.println("Isaac e Stella gastaram toda a mesada em doces.");
    System.out.println("Saldo mesada R$ "+mesada);

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }


}