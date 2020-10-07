package badcode;

import java.util.List;

public class Gerente {
    public String checar( Projeto p ) {
        // verifica prazo do projeto
        if (p.d < 90) {
            // verifica se projeto ainda está em andamento
            if (!p.isEntregue()) {
                // projeto ainda em andamento e com prazo curto para entrega
                return "Projeto está apertado" ;
            } else {
                return "Projeto entregue";}
        } else {
            List<Cliente> clients = p.getClientes();
            for (Cliente c : clients) {
                c.avisaAtraso(p.d);
            }
            return "Projeto atrasado";
        }
    }
}