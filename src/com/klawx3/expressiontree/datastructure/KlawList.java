package com.klawx3.expressiontree.datastructure;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * Created by Kenshi on 6/19/2017.
 */
public class KlawList<T> implements Iterator<T>,Iterable<T>{
    private long lenght;
    private KlawNode<T> startNode;
    private KlawNode<T> endNode;
    private long searchIndex;

    public KlawList(){
        lenght =searchIndex= 0;
        endNode = startNode = null;
    }

    public void addElement(T data){
        if(endNode == null){
            startNode = endNode = new KlawNode<>(data,null);
        }else{
            endNode.nextKlawNode = new KlawNode<>(data,null);
            endNode = endNode.nextKlawNode;
        }
        lenght++;
    }

    public T getElement(long index){
        if(lenght == 0){
            throw new NoSuchElementException();
        }
        if(index > lenght){
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        KlawNode<T> auxNode = null;
        for(auxNode = startNode; index > i ; auxNode = auxNode.nextKlawNode, i++){ }
        return auxNode.data;
    }

    public void removeElement(long index){
        if(lenght == 0){
            throw new NoSuchElementException();
        }
        if(index > lenght){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){ // optimize code
            KlawNode<T> sNode = startNode;
            startNode = startNode.nextKlawNode;
            lenght--;
            sNode = null;
            return;
        }
        int i = 0;
        KlawNode<T> auxNode = null;
        for(auxNode = startNode; index - 1 > i ; auxNode = auxNode.nextKlawNode, i++){ }
        KlawNode<T> lNode = auxNode.nextKlawNode;
        auxNode.nextKlawNode = auxNode.nextKlawNode.nextKlawNode;
        lNode = null;
        lenght--;
    }

    public long getLenght(){
        return lenght;
    }

    @Override
    public boolean hasNext() {
        return !((searchIndex ) == lenght);
    }

    @Override
    public T next() {
        if(hasNext()){
            return getElement(searchIndex++);
        } else {
            throw new NoSuchElementException();
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        searchIndex = 0;
        return this;
    }

    @Override
    public void remove() {
        removeElement(searchIndex);
    }

}
