/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author xbao
 */
public class StringCircularShift {
    public static void main(String[] args)
    {
        StringCircularShift test = new StringCircularShift();
//        System.out.println(test.isColsedBreaks("{()}"));
//        System.out.println(test.isColsedBreaks("[)]"));
          System.out.println(test.getCircularRotation("}()[]{"));
          System.out.println(test.getCircularRotation("}([)]{"));
          System.out.println(test.getCircularRotation("()]["));
          System.out.println(test.getCircularRotation("][a(bc)"));
    }
//    }()[]{
//    ACTGACG
//    TGACGAC 
//    TGACGACTGACGAC     
//
//    ()[]{}()[]{}
//    
//    ()][
//    )][()][(
//    
//    }([)]{
//    ([)]{}([)]{}
//    
//    
//        ][A(BC)
//        [A(BC)][A(BC)]
    
    
    
    
//        
    //abc
    //bca
    //cab
    public boolean getCircularRotation(String s) {
        int len = s.length();
        String s0 = s;
        for(int i=0; i<len; i++){
            char c = s.charAt(0);
            s = s.substring(1)+c;
            if (isCircularRotation(s0, s) && isColsedBreaks(s+s)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isColsedBreaks(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        map.put(']', ' ');
        map.put('}', ' ');
        map.put(')', ' ');
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if(stack.empty()) {
                stack.add(chars[i]);
                continue;
            }
            char c = stack.peek();
            if (map.get(c) == null) {
                continue;
            }
            if(map.get(c) == chars[i]){
                stack.pop();
                continue;
            }
            if (map.containsKey(chars[i])) {
                stack.push(chars[i]);
            }
        }
        return stack.empty();
    }
    
    public boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (t + t).contains(s);
    }
}
