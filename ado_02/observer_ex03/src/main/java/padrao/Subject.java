/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package padrao;

/**
 *
 * @author Ian
 */
public interface Subject {
    public void adcionarObvd(Observer observer);
    public void adcionarVaga(Vaga vaga);
    public void notificar();
}
