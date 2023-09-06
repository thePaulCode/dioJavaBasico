package autodromo;

public class Autodromo {
    public static void main(String[] args) {
        
        Carro honda = new Carro();
        //honda.ligar();
        honda.setChassi("01091910");

        Moto titan = new Moto();
       // titan.ligar();
        titan.setChassi("10122012");
        System.out.println(titan.getChassi());

        // Polimorfismo
        // A classe mais genérica - master - mantém o método correspondente
        // sem saber o comportamento ( abstração + polimorfismo )
        Veiculo master = titan;

        master.ligar();

        
    }
}
