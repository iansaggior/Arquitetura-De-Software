/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package strategy;

/**
 *
 * @author ian.spereira
 */

public enum Ordenacao {
    BUBBLE{
        @Override
        public MetodoOrdenacao escolher() {
            Bubble bubble = new Bubble();
            return bubble;            
        }
        
    },
    INSERTION{
        @Override
        public MetodoOrdenacao escolher() {
            Insertion insertion = new Insertion();
            return insertion;
        }
    },
    SELECTION{
        @Override
        public MetodoOrdenacao escolher() {
            Selection selection = new Selection();
            return selection;
        }
    };
    
    public abstract MetodoOrdenacao escolher();
}
