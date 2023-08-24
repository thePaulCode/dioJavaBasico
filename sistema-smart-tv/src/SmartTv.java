public class SmartTv {
    // Definindo estado inicial
    // Atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Metodos
    public void ligar(){
        ligada = true;
    }

     public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


}
