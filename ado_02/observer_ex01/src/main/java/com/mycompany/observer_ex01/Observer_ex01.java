/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer_ex01;

import padrao.*;

/**
 *
 * @author Ian
 */
public class Observer_ex01 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gersao da Xaropada");
        
        Observador professor = new Observador("Professor", aluno);
        Observador diretor = new Observador("Diretor", aluno);
        Observador coordenador = new Observador("Coordenador", aluno);
        
        aluno.setP1(8.5);
        System.out.println();
        aluno.setP2(5.5);
        System.out.println();
        aluno.setP1(7.3);
        System.out.println();
        aluno.setP2(5.2);
    }
}
