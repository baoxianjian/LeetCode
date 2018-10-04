package tree.utils;

public class BinaryNode<T>                       //二叉树的二叉链表结点类，泛型T指定结点的元素类型
{
    public T val;                               //数据域，存储数据元素
    public BinaryNode<T> left, right;            //链域，分别指向左、右孩子结点

    //构造结点，参数分别指定元素和左、右孩子结点
    public BinaryNode(T val, BinaryNode<T> left, BinaryNode<T> right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(T val)                    //构造指定值的叶子结点
    {
        this(val, null, null);
    }
    public BinaryNode()
    {
        this(null, null, null);
    }

    //可声明以下方法
    public String toString()
    {
        return this.val.toString();
    }
    public boolean equals(Object obj)            //比较两个结点值是否相等，覆盖Object类的equals(obj)方法
    {
        return obj==this || obj instanceof BinaryNode && this.val.equals(((BinaryNode<T>)obj).val);
    }    
    public boolean isLeaf()                      //判断是否叶子结点
    {
        return this.left==null && this.right==null;
    }
    
    
    
    
}
