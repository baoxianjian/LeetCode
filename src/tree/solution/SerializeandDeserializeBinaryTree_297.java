package tree.solution;

import tree.utils.BinaryNode;
import tree.utils.BinaryTree;
import tree.utils.BinaryNode;

/**
 *
 * @author xbao
 */
public class SerializeandDeserializeBinaryTree_297 {
    private StringBuilder sb = new StringBuilder();
    private String[] dataArray = null;
    private int idx = 0;
    
    // Encodes a tree to a single string.
    public String serialize(BinaryNode<Integer> root) {
        write(root);
        if(root == null) return "";
        serialize(root.left);
        serialize(root.right);
        return this.sb.toString();
    }

    public void write(BinaryNode<Integer> root) {
        if(root == null){
           sb.append('#');
        } else {
           sb.append(root.val);
        }
        sb.append(',');
    }
    
    // Decodes your encoded data to tree.
    public BinaryNode<Integer> deserialize(String data) {
        if(data.equals("") || data == null) return null;
        dataArray = data.split(",");
        return helper();
    }
    
    public BinaryNode<Integer> helper() {
        BinaryNode<Integer> node = read();
        if(node == null) return null;
        node.left = helper();
        node.right = helper();
        return node;
    }
    
    public BinaryNode<Integer> read() {
        String str = dataArray[idx++];
        if(str.equals("#")) {return null;}
        return new BinaryNode(Integer.parseInt(str));
    }
    
    
    
    public static void main(String[] args)
    {
//        BinaryTree<Integer> bt = new BinaryTree<Integer>();
//        bt.insertRoot(1);
//        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
//        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
//        BinaryNode<Integer> c = bt.insertChild(b, 4, true);
//        BinaryNode<Integer> d = bt.insertChild(b, 5, false);
//        
//        SerializeandDeserializeBinaryTree_297 test = new SerializeandDeserializeBinaryTree_297();
//        String output = test.serialize(null);
//        System.out.println(output);
//        BinaryNode<Integer> root = test.deserialize(output);
//        System.out.println("xxx");
        
        
//        ascii_deletion_distance("thought", "sloughs");
        
    }
    
    
//    public static int ascii_deletion_distance(String str1, String str2) {
//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        
//        for(int i=0;i<chars1.length;i++)
//        {
//            if(!str2.contains(chars1[i]+"")){
//                str1 = str1.replace(chars1[i]+"", "");
//            }
//        }
//        for(int i=0;i<chars2.length;i++)
//        {
//            if(!str1.contains(chars2[i]+"")){
//                str2 = str2.replace(chars2[i]+"", "");
//            }
//        }
//        System.out.println(str1);
//        System.out.println(str2);
//        return 0;
//    }
//    bracket_match
//    four_letter_words
//    almost_palindromes
}
