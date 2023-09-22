/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author ian.spereira
 */
public class Fabrica implements Criadora {    

    @Override
    public Carro metodoFabrica(Tipo modelo) 
    {
        if (modelo.equals(Tipo.FOX)) {
            return new Fox(123000, "Fox Urban");
        } else if (modelo.equals(Tipo.JETTA)) {
            return new Jetta(150000, "Jetta TSI");
        }
        return null;
    }

}
