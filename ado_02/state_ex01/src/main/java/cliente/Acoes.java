package cliente;

import state.*;

/**
 *
 * @author ian.spereira
 */

public class Acoes {
    private String descricao;
    private Estados estado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(estado);
    }

    public Acoes(String descricao) {
        this.descricao = descricao;
        this.estado = new Esperando(this);
    }

    public void chamarCorrer() {
        estado.correr();
    }

    public void chamarEsperar() {
        estado.esperar();
    }

    public void chamarPular() {
        estado.pular();
    }

    public void chamarAbaixar() {
        estado.abaixar();
    }

}
