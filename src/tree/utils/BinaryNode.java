package tree.utils;

public class BinaryNode<T>                       //�������Ķ����������࣬����Tָ������Ԫ������
{
    public T val;                               //�����򣬴洢����Ԫ��
    public BinaryNode<T> left, right;            //���򣬷ֱ�ָ�����Һ��ӽ��

    //�����㣬�����ֱ�ָ��Ԫ�غ����Һ��ӽ��
    public BinaryNode(T val, BinaryNode<T> left, BinaryNode<T> right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(T val)                    //����ָ��ֵ��Ҷ�ӽ��
    {
        this(val, null, null);
    }
    public BinaryNode()
    {
        this(null, null, null);
    }

    //���������·���
    public String toString()
    {
        return this.val.toString();
    }
    public boolean equals(Object obj)            //�Ƚ��������ֵ�Ƿ���ȣ�����Object���equals(obj)����
    {
        return obj==this || obj instanceof BinaryNode && this.val.equals(((BinaryNode<T>)obj).val);
    }    
    public boolean isLeaf()                      //�ж��Ƿ�Ҷ�ӽ��
    {
        return this.left==null && this.right==null;
    }
    
    
    
    
}
