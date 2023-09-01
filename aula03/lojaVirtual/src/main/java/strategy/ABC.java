/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author ian.spereira
 */
    public class ABC implements CalcularFreteEmpresas 
    {
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
        else {
            frete = 40;
        }
        return frete;
    }
}
