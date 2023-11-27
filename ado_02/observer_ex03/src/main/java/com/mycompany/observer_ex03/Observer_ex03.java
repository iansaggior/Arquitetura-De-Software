/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer_ex03;

import padrao.*;

/**
 *
 * @author Ian
 */
public class Observer_ex03 {

    public static void main(String[] args) {
        Subject agencia01 = new Agencia("Agencia mil bala");
        
        Observer assinante01 = new Assinante("Xaropada", agencia01);        
        Observer assinante02 = new Assinante("Rubinho", agencia01);
        Observer assinante03 = new Assinante("Cleitinho", agencia01);
        Observer assinante04 = new Assinante("Abner", agencia01);
        Observer assinante05 = new Assinante("Yago", agencia01);
        
        agencia01.adcionarVaga(Vaga.VAGA_01);
        agencia01.adcionarVaga(Vaga.VAGA_02);
        agencia01.adcionarVaga(Vaga.VAGA_03);
        agencia01.adcionarVaga(Vaga.VAGA_04);
        
    }
}
