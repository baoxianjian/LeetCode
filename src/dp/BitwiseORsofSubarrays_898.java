package dp;

import java.util.HashSet;
import java.util.Set;

/*
当前的一个数与前面的一组数取并集得到新的一组数
 */

/**
 *
 * @author XBao
 */
public class BitwiseORsofSubarrays_898 {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> all = new HashSet<>();
        Set<Integer> last = new HashSet<>();
        
        for(Integer a : A){
            Set<Integer> next = new HashSet<>();
            next.add(a);
            for(Integer b : last){
                next.add(a | b);
            }
            last = next;
            all.addAll(next);
        }
//        System.out.println(all);
        return all.size();
    }
//    public int subarrayBitwiseORs(String[] A) {
//        Set<String> ans = new HashSet<>();
//        Set<String> cur = new HashSet<>();
//        for(String a : A) {
//            Set<String> nxt = new HashSet<>();
//            nxt.add(a);  //1, 2, 3
//            for(String b : cur)
//                nxt.add("("+a+","+b+")"); //1,2
//            ans.addAll(nxt); //1, 2, (1,2)
//            cur = nxt; //1, (1,2)
//            System.out.println(cur);
//        }
//        
//        return ans.size();
//    }
    
    public static void main(String[] args)
    {
         System.out.println(new BitwiseORsofSubarrays_898().subarrayBitwiseORs(new int[]{1, 1, 2}));
    }
    
}
