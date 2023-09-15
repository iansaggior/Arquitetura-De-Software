/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package strategy;

/**
 *
 * @author ian.spereira
 */
public enum ListaEmpresas implements CalcularFreteEmpresas {
    
    ABC {
        @Override
        public double calcularFrete(double peso) 
        {
            double frete = 0;
            if (peso <= 5) 
            {
                frete = 23.1;                
            } 
            else if (peso <= 10) 
            {
                frete = 30;
            } 
            else 
            {
                frete = 40;
            }
            return frete;
        }
       },
    CBA {
        @Override
        public double calcularFrete(double peso) 
        {
            double frete = 0;
            if (peso <= 5)
            {
                frete = 12.6;    
            } 
            else if (peso <=10) 
            {
                frete = 22.6;
            } 
            else 
            {
                frete = 32.6;
            }
            return frete;
        }
    },
    XPTO {
        @Override
        public double calcularFrete(double peso) 
        {
            double frete = 0;
            if (peso <= 5) 
            {
                frete = 12;
            } 
            else if (peso <= 10) 
            {
                frete = 15.2;
            } 
            else 
            {
                frete = 21.2;
            }
            return frete;        
        }
        
    };
    
}
