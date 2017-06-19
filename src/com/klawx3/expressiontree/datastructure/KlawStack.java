package com.klawx3.expressiontree.datastructure;

import java.util.EmptyStackException;

/**
 * Created by Kenshi on 6/18/2017.
 */
public class KlawStack<T> {
    private KlawNode<T> topKlawNode;
    private long length;
    public KlawStack(){
        topKlawNode = null;
        length = 0;
    }
    public void push(T data){
        if(topKlawNode == null){ // primer elemento
            topKlawNode = new KlawNode<>(data,null);
        }else{
            KlawNode<T> node = new KlawNode<>(data, topKlawNode);
            topKlawNode = node;
        }
        length++;
    }
    public T pop() throws EmptyStackException{
        if(topKlawNode == null){
            throw new EmptyStackException();
        }
        T data = topKlawNode.data;
        topKlawNode = topKlawNode.nextKlawNode;
        length--;
        return data;
    }
    public long getLength(){
        return length;
    }

}
