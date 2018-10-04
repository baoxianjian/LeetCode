package tree.utils;

//����������

public class Node<T>                             //���������࣬Tָ������Ԫ������
{
    public T val;                               //�����򣬱�������Ԫ��
    public Node<T> next;                         //��ַ�����ú�̽��

    public Node(T val, Node<T> next)            //�����㣬valָ������Ԫ�أ�nextָ����̽��
    {
        this.val = val;
        this.next = next;
    }
    public Node()
    {
        this(null, null);
    }

    //4��Node����������·�����
    public String toString()                     //���ؽ��Ԫ��ֵ��Ӧ���ַ���
    {
        return this.val.toString();
    }    
    public boolean equals(Object obj)            //�Ƚ��������ֵ�Ƿ���ȣ�����Object���equals(obj)����
    {
        return obj==this || obj instanceof Node && this.val.equals(((Node<T>)obj).val);
    }    
}

/*��������
1��  ��һ����û���������췽��ʱ��Java�ṩĬ�Ϲ��췽��������
    public Node()                                  //�ṩĬ�Ϲ��췽��
    {
        super();                                   //Ĭ�ϵ������
    }
          ��һ���������˹��췽��ʱ��Java�����ṩĬ�Ϲ��췽����
���磬��Node��������Node(T val, Node<T> next)���췽��ʱ��Java�����ṩĬ�Ϲ��췽��Node()��
���Node����ҪNode()���췽���������Լ�������

2��  Java��������û��Ĭ��ֵ�����磬Node������������¹��췽��
    public Node(T val)
    {
        this(val, null);
    }
    �����ܽ�Node(T val, Node<T> next)���췽������Ϊ������ʽ��
    public Node(T val, Node<T> next=null)
    
3��Java���ṩĬ�Ͽ������췽����
  Node�಻��Ҫ�������췽�������������췽�����£�����p���õĽ�㣬
    public Node(Node<T> p)            //�������췽��
    {
        this(p.val, p.next); 
    }
�൱��
    public Node(Node<T> p)
    {
        this.val = p.val;
        this.next = p.next;        //��p�����Ϊ��ǰ����ĺ�̽�㣬���岻����
    }
    
5�������������£��ȽϽ��ֵ��С
public class Node<T> implements Comparable<Node<T>>   //����������
{
    public int compareTo(Node<T> p)                  //�Ƚ���ȣ��Ƚϴ�С
    {
        return this.val.compareTo(p.val);
    }
}
��������Ӧ��Ҫ��Ƚ�T�����С������Ҫ��ȽϽ���С��
*/
