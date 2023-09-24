package list;

import java.util.*;

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
