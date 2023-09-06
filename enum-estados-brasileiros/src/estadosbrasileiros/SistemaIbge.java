package estadosbrasileiros;

public class SistemaIbge {

    public static void main(String[] args) {
        
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            //System.out.println(e.getSigla()+"-"+e.getNome());
        }

        EstadoBrasileiro listarEstados = EstadoBrasileiro.PARANA;
        System.out.println(listarEstados.getNome());
        System.out.println(listarEstados.getSigla());
        System.out.println(listarEstados.getNomeMaiusculo());
        System.out.println(listarEstados.getIbge());


    }
    
}
