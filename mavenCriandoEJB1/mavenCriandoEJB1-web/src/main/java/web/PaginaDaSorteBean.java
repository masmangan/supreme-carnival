package web;

import javax.ejb.EJB;
import javax.enterprise.context.*;
import javax.inject.*;

@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB
    private negocio.SorteadorBeanLocal sorteadorBean;
    
    public int getNumero() {
        return sorteadorBean.getNumero();
    }
    
}
