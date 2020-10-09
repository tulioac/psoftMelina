package badcode;

import java.util.List;

public class Projeto {

    private int diasAtrasado;

    public boolean isEntregue() {
        return false;
    }
    public List<Cliente> getClientes() {
        return null;
    }

    public int getDiasAtrasado() {
        return this.diasAtrasado;
    }

    public String checarSituacao() {
        // verifica prazo do projeto
        if (this.getDiasAtrasado() < 90) {
            // verifica se projeto ainda está em andamento
            if (!this.isEntregue()) // projeto ainda em andamento e com prazo curto para entrega
                return "Projeto está apertado";

            return "Projeto entregue";
        } else {
            List<Cliente> clientes = this.getClientes();

            for (Cliente cliente : clientes) {
                cliente.avisaAtraso(this.getDiasAtrasado());
            }

            return "Projeto atrasado";
        }
    }
}
