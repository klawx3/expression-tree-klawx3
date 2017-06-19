package com.klawx3.expressiontree;

import com.klawx3.expressiontree.exceptions.ExpressionException;
import org.jetbrains.annotations.Contract;

/**
 * Created by Kenshi on 6/19/2017.
 */
public class ExpressionTree {
    private String expression;
    public ExpressionTree(String expression){
        this.expression = expression;
    }
    public long getExpressionValue() throws ExpressionException{
        return 0;
    }

    private boolean isAnOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
