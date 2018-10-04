package tree.solution;

import java.util.ArrayList;
import java.util.List;
import tree.utils.TreeNode;
import java.util.Queue;
import java.util.LinkedList;
import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/**
 *
 * @author baoge
 */
public class AverageofLevelsinBinaryTree_637 {
    
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        averageOfLevels2(bt.root);
    }
    
    public static List<Double> averageOfLevels(BinaryNode<Integer> root) {
        //这种方法表现不出层次
        Queue<BinaryNode<Integer>> que = new LinkedList<BinaryNode<Integer>>();
        BinaryNode<Integer> p = root;
        while(p != null)
        {
            System.out.print(p.val);
            if(p.left != null) {que.offer(p.left);}
            if(p.right != null) {que.offer(p.right);}
            p = que.poll();
        }
        return null;
    }
    
    public static List<Double> averageOfLevels2(BinaryNode<Integer> root) {
        Queue<BinaryNode<Integer>> que = new LinkedList<BinaryNode<Integer>>();
        List<Double> result = new ArrayList<Double>();
        que.add(root);
        while(!que.isEmpty())
        {
            int size = que.size();
            double val = 0;
            for(int i=0; i<size; i++)
            {
                BinaryNode<Integer> p = que.poll();
                val += p.val;
                if(p.left != null) {que.offer(p.left);}
                if(p.right != null) {que.offer(p.right);}
            }
            result.add(val/size);
        }
        return result;
    }
    
}
