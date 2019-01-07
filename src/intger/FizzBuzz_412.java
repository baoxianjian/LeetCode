/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XBao
 */
public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5!=0){list.add("Fizz");}
            else if(i%5==0 && i%3!=0) {list.add("Buzz");}
            else if(i%3==0 && i%5==0) {list.add("FizzBuzz");}
            else {list.add(String.valueOf(i));}
        }
        return list;
    }
    
    public static void main(String[] args) {
        new FizzBuzz_412().fizzBuzz(15).stream().forEach(n->System.out.print(n+" "));
    }
}
