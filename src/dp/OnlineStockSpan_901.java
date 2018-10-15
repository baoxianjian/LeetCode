/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Stack;

/**
 *
 * @author baoge
 */
public class OnlineStockSpan_901 {
    private Stack<Integer> prices;
    private Stack<Integer> spans;
    
    public OnlineStockSpan_901() {
        prices = new Stack<>();
        spans = new Stack<>();
    }
    
    public int next(int price) {
       int span = 1;
       while(!prices.isEmpty() && price > prices.peek())
       {
           span += spans.pop();
           prices.pop();
       }
       prices.add(price);
       spans.add(span);
       return span;
    }
}
