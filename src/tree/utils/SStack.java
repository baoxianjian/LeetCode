package tree.utils;

//4.1.1   ջ������������

//ջ�ӿڣ�����ջ�����������ͣ����Ͳ���T��ʾ����Ԫ�ص���������
public interface SStack<T>             //ջ�ӿڣ�ջ������������
{
    boolean isEmpty();                 //�ж�ջ�Ƿ�Ϊ��
    void push(T x);                    //Ԫ��x��ջ
    T pop();                           //��ջ������ջ��Ԫ��
    T get();                           //ȡջ��Ԫ�أ�δ��ջ
}