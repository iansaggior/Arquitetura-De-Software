package main;

import java.util.List;

import list.*;

public class Main {
    public static void main(String[] args) {
        //Criadora f = new Fabrica();
        List list01 = Fabrica.metodoFabrica(Tipo.ARRAYLIST);
        List list02 = Fabrica.metodoFabrica(Tipo.LINKEDLIST);
        List list03 = Fabrica.metodoFabrica(Tipo.VECTOR);

        list01.add("item01AL");
        list01.add("item02AL");
        list01.add("item03AL");
        list01.add("item04AL");

        list02.add("item01Lkl");
        list02.add("item02lkl");
        list02.add("item03Lkl");
        list02.add("item04Lkl");

        list03.add("item01Vct");
        list03.add("item02Vct");
        list03.add("item03Vct");
        list03.add("item04Vct");

        for (Object item : list01) {
            System.out.println(item);
        }

        System.out.println();
        for (Object item : list02) {
            System.out.println(item);
        }
        
        System.out.println();
        for (Object item : list03) {
            System.out.println(item);
        }

    }
}
