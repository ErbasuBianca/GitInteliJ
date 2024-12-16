package accese;

import com.skillbrain.AnimalDeCompanie;
import com.skillbrain.Mamifer;

public class Caine implements Mamifer, AnimalDeCompanie {

    protected int numarPicioare = 4;

    protected int getNumarPicioare(){
        return numarPicioare;
    }

    public void mananca() {
        System.out.println("Eu sunt un caine si imi place sa mananc oase");
    }

    public void sunet() {
        System.out.println("Ham ham");
    }


    public void reproducere() {
        System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
    }

    public void vaneaza() {
        System.out.println("Eu sunt un caine si nu pot vana");
    }
}
