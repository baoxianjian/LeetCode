package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author baoxianjian
 */
public class Solution {    
    
    public static void main(String[] args)
    {
        Solution test = new Solution();
//test solution 1
        System.out.println(test.isStringCircularShift("}()[]{"));
        System.out.println(test.isStringCircularShift("}([)]{"));
        System.out.println(test.isStringCircularShift("()]["));
        System.out.println(test.isStringCircularShift("][a(bc)"));

//test solution 2
        System.out.println(test.numberLength(342));
        System.out.println(test.numberLength(115));
//        for(int i=0;i<=1000;i++){
//            System.out.println(test.numberLength(i));
//        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   //Solution 1 
    public boolean isStringCircularShift(String s) {
        int len = s.length();
        String s0 = s;
        for(int i=0; i<len; i++) {
            s = s.substring(1)+s.charAt(0);
            if(isCircularRotation(s0, s) && isClosedBreaks(s+s)){
                return true;
            }
        }
        return false;
    }
    
    private boolean isClosedBreaks(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put(')', ' ');
        map.put(']', ' ');
        map.put('}', ' ');
        
        for(int i=0; i<chars.length; i++) {
            if(stack.empty()) {
                stack.add(chars[i]);
                continue;
            } 
            char c = stack.peek();
            if(map.get(c) == chars[i]) {
                stack.pop();
                continue;
            }
            if(map.containsKey(chars[i])){
                stack.add(chars[i]);
            }
        }
        return stack.empty();
    }
    
    private boolean isCircularRotation(String s1, String s2){
        return (s1.length()==s2.length()) && (s2+s2).contains(s1);
    }
    
    
    
    
    
    
    
    
//Solution 2    
public int numberLength(int money) {
        String str = numberToString(money);
        return str.replace(" ","").replace("-", "").length();
    }
    
    public String numberToString(int money)
    {
        if(money < 0 || money  > 1000) {
            return "";
        }
        if(money == 1000) {
            return "one thousand";
        }
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        
        String result = "";
        int hundred = money / 100;
        
        if(hundred > 0) {
            result+=map.get(hundred)+" hundred";
        }
        
        int ten = money % 100;
        if(ten >= 11 && ten <=19) {
            result+= (result.length() > 0 ? " and " : "") + map.get(ten);
            return result;
        }
        ten = ten / 10 * 10;
        if(ten > 0) {
            result+=(result.length() > 0 ? " and " : "") + map.get(ten);
        }
        
        int one = money % 10;
        if(one > 0) {
            result += (ten > 0 ? "-" : "") + map.get(one);
        }
        return result;
    }
    
    
}
