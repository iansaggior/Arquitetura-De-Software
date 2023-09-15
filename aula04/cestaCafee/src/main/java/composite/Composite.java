/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ian.spereira
 */
public class Composite implements Component{
    List<Component> lista = new ArrayList<>();
    
    public void add(Component comp) {
        lista.add(comp);
    }
    public void del(Component comp) {
        lista.remove(comp);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component c: lista) {
        total += c.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + '}';
    }
    
    
    
}
