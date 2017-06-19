package com.klawx3.expressiontree;

import com.klawx3.expressiontree.datastructure.KlawList;
import com.klawx3.expressiontree.datastructure.KlawStack;

public class Main {

    public static void main(String[] args) {
        /*KlawStack<Integer> stack = new KlawStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //System.out.println(stack.getLength());
        while(stack.getLength() > 0){
            System.out.println(stack.pop());
        }
        */

        KlawList<String> lista = new KlawList<>();
        lista.addElement("Holi ^^");
        lista.addElement("Como ");
        lista.addElement("Estas ??");

        for(String wea : lista){
            System.out.println(wea);
        }
        for(String wea : lista){
            System.out.println(wea);
        }


    }
}
