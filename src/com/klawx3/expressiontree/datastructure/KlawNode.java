package com.klawx3.expressiontree.datastructure;

/**
 * Created by Kenshi on 6/19/2017.
 * An simple linked node
 */
public class KlawNode<T> {
    public T data;
    public KlawNode<T> nextKlawNode;
    public KlawNode(T data, KlawNode nextKlawNode){
        this.data = data;
        this.nextKlawNode = nextKlawNode;
    }
}