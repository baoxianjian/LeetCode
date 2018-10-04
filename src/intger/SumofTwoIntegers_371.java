package intger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class SumofTwoIntegers_371 {
    
    public static void main(String[] args)
    {
        System.out.println(getSum(2,3));
    }
    
    public static int getSum(int a, int b) {
	if (a == 0) return b;
	if (b == 0) return a;

        //a: 2  0010
        //b: 3  0011
        //      0101
	while (b != 0) {
            //������Ϊ1��λ����Ϊ1˵��Ҫ��λ��
            int carry = a & b; //0010   0000
            //��������λ��
            a = a ^ b;      //0001   0101
            //��λ,�´����ʱ�ᱻ����
            b = carry << 1; //0100   0000
	}
	
	return a;
}
}
