package com.klawx3.expressiontree;

import com.klawx3.expressiontree.datastructure.KlawList;
import com.klawx3.expressiontree.datastructure.KlawStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        lista.forEach(System.out::println);

        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Como ")){
                iterator.remove();
            }
        }
        System.out.println("-after wea-");
        lista.forEach(System.out::println);

    }
}
