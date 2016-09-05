package negocio;

import java.util.Random;
import javax.ejb.Stateless;

@Stateless
public class SorteadorBean implements SorteadorBeanLocal {

    @Override
    public int getNumero() {
        Random r = new Random();
        return r.nextInt(10);
    }
}
