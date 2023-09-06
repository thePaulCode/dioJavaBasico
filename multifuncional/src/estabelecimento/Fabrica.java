package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        // papel das interfaces é atribuir os papeis das classes
        // quando uma classe possui mais de um papel
        // iphone - implementa interfaces (ipod, phone, navegador internet)

        //EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        //Impressora impressora = em;
       // Digitalizadora digitalizadora = em;
        Xerox copiadora = new Xerox();

        //impressora.imprimir();
        //digitalizadora.digitalizar();
        copiadora.copiar();
        
    }
    
}
