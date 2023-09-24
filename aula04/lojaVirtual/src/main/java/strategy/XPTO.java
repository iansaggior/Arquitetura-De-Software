/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author ian.spereira
 */
public class XPTO implements CalcularFreteEmpresas {
    @Override
    public double calcularFrete(double peso) 
    {
        double frete = 0;
        if (peso <= 9) 
        {
            frete = 12;
        } 
        else if (peso <= 30) 
        {
            frete = 27;
        } 
        else 
        {
            frete = 41.50;
        }
        return frete;
    } 
}
