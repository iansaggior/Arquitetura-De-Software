/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.*;
/**
 *
 * @author iansa
 */

public class Fabrica {
    public static List metodoFabrica(Tipo nome) 
    {
        if (nome.equals(Tipo.ARRAYLIST)) 
        {
            return new ArrayList<>();
        } 
        else if (nome.equals(Tipo.LINKEDLIST)) 
        {
            return new LinkedList<>();
        } 
        else if (nome.equals(Tipo.VECTOR)) 
        {
            return new Vector<>();
        }
        return null;
    }
    
}