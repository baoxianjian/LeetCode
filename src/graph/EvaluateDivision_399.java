package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 http://zxi.mytechroad.com/blog/graph/leetcode-399-evaluate-division/
 */

/**
 *
 * @author xbao
 */
class EvaluateDivision_399 {  
    Map<String, HashMap<String, Double>> g = new HashMap<>();
    Set<String> visited = new HashSet<String>();
    
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        //有向图初始化，把诸如a/b、 b/c 求值并连接起来，包括反向b/a这种预先求值，在query的时候，直接（或间接）可以给出
        for(int i=0; i<equations.length; i++) {
            String x = equations[i][0];
            String y = equations[i][1];
            double k = values[i];
            
            //效率高
            if(!g.containsKey(x)) {
                HashMap<String, Double> tmp = new HashMap<String, Double>();
                tmp.put(y, k);
                g.put(x, tmp);
            } else {
                g.get(x).put(y, k);
            }
            if(!g.containsKey(y)) {
                HashMap<String, Double> tmp = new HashMap<String, Double>();
                tmp.put(x, 1.0/k);
                g.put(y, tmp);
            } else{
                g.get(y).put(x, 1.0/k);
            }
            
            //效率低            
//            g.computeIfAbsent(x, (a)->new HashMap<String, Double>()).put(y, k);
//            g.computeIfAbsent(y, (a)->new HashMap<String, Double>()).put(x, 1.0 / k);
        }
        
        
        //对每个query进行求解
        double[] ans = new double[queries.length];
        for(int i=0; i<queries.length; i++) {
            String x = queries[i][0];
            String y = queries[i][1];
            if (!g.containsKey(x) || !g.containsKey(x)) {
                ans[i] = -1.0d;
            } else {
                //每个query互不干扰
                visited.clear();
                ans[i] = divide(x, y);
                //ans[i] = divide2(x, y, new HashSet<String>());
            }
        }
        return ans;
    }
    //a/c
//    a
//        b
//            c
//        b*c
//    a*b*c
                
    private double divide(String x, String y) {
        //base case：找目标
        if(x.equals(y)) return 1d;
        visited.add(x);
        for(String n : g.get(x).keySet()) {
            if(visited.contains(n)) continue;
            visited.add(n);
            //深度遍历路径
            double d = this.divide(n, y);
            //求解就是所有出度路径之积
            if(d>0) return d * g.get(x).get(n);
        }
        
        return -1.0d;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
  private double divide2(String x, String y, Set<String> visited) {
    if (x.equals(y)) return 1.0;
    visited.add(x);
    if (!g.containsKey(x)) return -1.0;
    for (String n : g.get(x).keySet()) {
      if (visited.contains(n)) continue;
      //visited.add(n);
      double d = divide2(n, y, visited);
      if (d > 0) return d * g.get(x).get(n);
    }
    return -1.0;
  }


    public static void main(String[] args)
    {
        String[][] equations = new String[][]{{"a", "b"}, {"b", "c"}};
        double[] values = new double[]{1.5,2.5};
        String[][] queries = new String[][]{ {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
        EvaluateDivision_399 test = new EvaluateDivision_399();
        double[] ans = test.calcEquation(equations, values, queries);
        Arrays.stream(ans).forEach(System.out::println);
//        double k = 3;
//        System.out.println(k/2.5d);
        
    }








}

