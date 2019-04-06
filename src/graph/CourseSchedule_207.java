package graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author xbao
 */
public class CourseSchedule_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        
        for(int i=0; i<prerequisites.length; i++) {
            if(graph.containsKey(prerequisites[i][1]))
            {
                graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
            else
            {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(prerequisites[i][0]);
                graph.put(prerequisites[i][1], tmp);
            }
            
            indegrees[prerequisites[i][0]]++;

        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++) {
            if(indegrees[i] == 0) {
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty())
        {
            int course = queue.poll();
            List<Integer> tmp = graph.get(course);
            if(tmp != null) {
            // tmp.forEach((k)->{
            //     if( --indegrees[k] == 0)
            //     {
            //         queue.add(k);
            //     }
            // });
                
             int size = tmp.size();   
             for(int i=0;i<size; i++){
                if( --indegrees[tmp.get(i)] == 0)
                {
                    queue.add(tmp.get(i));
                }
             }
            }
        }
        
        for(int i=0; i<indegrees.length; i++) {
            if(indegrees[i]!=0) return false;
        }
        return true; 
    }
    
    public static void main(String[] args)
    {
        new CourseSchedule_207().canFinish(6, new int[][]{
            {2,0},
            {2,1},
            {4,1},
            {4,3},
            {5,2},
            {5,4}
        });


        
    }
}
