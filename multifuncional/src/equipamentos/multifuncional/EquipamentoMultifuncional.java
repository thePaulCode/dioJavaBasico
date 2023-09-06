package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via multifuncional");
    }
    
}
