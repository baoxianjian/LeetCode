/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author baoge
 */
public class MyTest {
//������1��   
    //��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�   
//����һ���Ʋ�������������
    
    public static void main(String[] args) {
            MyTest mt=new MyTest();
            //mt.tuzi();
            //mt.sushu();
            //mt.dafodilCount();
            //mt.decomposeZhiYinShu();
            //mt.scoreGrade();
            //mt.getMaxCommonDivisorAndMinMultiple(6, 10);
            //mt.getStatisticCharSpaceNumberOther();
            //mt.aManyPlus();
            //mt.getPrefectNumber();
            //mt.countFallandRebound();
            //mt.test11();
            //mt.test13();
            //mt.test14();
            //mt.test16();
            //mt.test17();
            //mt.test19();
            //mt.test20();
            //mt.test21();
            //System.out.println(mt.test22(5));
            //mt.test23();
            //mt.test25();
            //mt.test27();
            //mt.test28();
            //mt.test29();
            //mt.test30();
            //mt.test32();
            // mt.test35();
            //mt.test36();
            //mt.test39();
            //mt.test41();
            //System.out.println(mt.myPow(3, 3));
             //System.out.println(mt.power(3, 3));
    }
    
            
    public void tuzi() {
        System.out.println("��1���µ����Ӷ���:    1");
        System.out.println("��2���µ����Ӷ���:    1");
        int f1 = 1, f2 = 1, f, M=24;
        for(int i=3; i<=M; i++) 
        {
           f = f2;
           f2 = f1 + f2;
           f1 = f;
           System.out.println("��" + i +"���µ����Ӷ���: "+f2);
        }
    }
  //������2��     
    //��Ŀ���ж�101-200֮���ж��ٸ���������������������� 
    public void sushu()
    {
        int count=0;
        boolean flag=false;
       for(int i=101;i<=200;i+=2) //˫�����Գ���2������ֻ�е���������2
       {
           flag=true;
           for(int j=2;j<=Math.sqrt(i);j++) //С�ڵ��ڣ�ƽ���������
           {
               if(i%j==0)
               {
                   flag=false;
                   break;
               }
           }
           if(flag)
           {
               count++;
               System.out.println(i);
           }
       }
       System.out.println(count);
    }

    //������3��   
    //��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
    public void dafodilCount()
    {
        int a=0,b=0,c=0;
        for(int i=100;i<999;i++)
        {
            a=i%10; //��λ
            b=i/10%10; //ʮλ
            c=i/100; //��λ

            if(a*a*a+b*b*b+c*c*c==i)
            {
                 System.out.println(i);
            }
        }
    }

    //������4��   
    //��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��   
    //�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�   
    //(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�   
    //(2)���n <> k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����   
    //(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����  
    public void decomposeZhiYinShu()
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int k=2;
        while(a/k!=0)
        {
            if(a%k==0)
            {
                a=a/k;
                System.out.println(k);
                continue;
            }
            else
            {
                k++;
            }
        }
    }


    //������5��   
    //��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
    public void scoreGrade()
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        char c= a>=90 ? 'A' : a>60 && a<=89 ? 'B' : 'C';
        System.out.println(c);
    }

 


    //������6��   
    //��Ŀ����������������m��n���������Լ������С��������   
    //��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��һ������Ϊ��һ��ѭ���Ĵ�����ȡ�õ�������Ϊ��һ��ѭ���Ľ�С���������ѭ��ֱ����С������ֵΪ0�����ؽϴ������������Ϊ���Լ������С������Ϊ����֮���������Լ����* /
    public void getMaxCommonDivisorAndMinMultiple(int m,int n)
    {
        //15 20
        //3*5 2*2*5
        //5
        //15*20/5=60
        int i=2;
        int maxCommonDivisor=0,minCommonMultiple=0;
        while(i<m && i<n)
        {
            if(m%i==0 && n%i==0)
            {
                maxCommonDivisor=i;
            }
            i++;
        }
        minCommonMultiple=m*n/maxCommonDivisor;
        System.out.println("���Լ����"+maxCommonDivisor);
        System.out.println("��С��������"+minCommonMultiple);
    }
    
    
//������7��   
//��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����   
    public void getStatisticCharSpaceNumberOther()
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] list=str.toCharArray();
        
        int spaceCount=0;
        int charCount=0;
        int numberCount=0;
        int otherCount=0;
        
        for(int i=0;i<list.length;i++)
        {
            int num=(int)list[i];
            
            //System.out.println(num);
            if(num==32)
            {
                spaceCount++;
            }
            else if(num>=48 && num<=57)
            {
                numberCount++;
            }
            else if((num>=65 && num<=90) || (num>=97 && num<=122))
            {
                charCount++;
            }
            else
            {
                otherCount++;
            }
        }
        System.out.println("���ָ�����"+numberCount);
        System.out.println("��ĸ������"+charCount);
        System.out.println("�ո������"+spaceCount);
        System.out.println("����������"+otherCount);
    }
    
    
//������8��   
//��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�   
    public void aManyPlus()
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        s=new Scanner(System.in);
        int count=s.nextInt();
        
        int b=0;
        int num=0;
        for(int i=0;i<count;i++)
        {
            b+=a*Math.pow(10, i);
            num+=b;
        }
        System.out.println(num);
    }
    

//������9��   
//��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.���     �ҳ�1000���ڵ�����������   
    public void getPrefectNumber()
    {
        //int a=30;
        for(int a=1;a<1000;a++)
        {
            int num=0;
            int i=1;
            while(i<=a/2)
            {
                if(a%i==0)
                {
                    num+=i;
                  //  System.out.println(i);
                }
                i++;
            }
            if(a==num)
            {
                System.out.println(a+"is a prefect number.");
            }
        }
    }
    
    
//������10��   
//��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�������     ��10�����ʱ�������������ף���10�η�����ߣ� 
    public void countFallandRebound()
    {
        //����100 ����50 ����50 ����25 ����25 ����12.5 ����12.5
        //�ڶ������� 100+(50+50) һ��ѭ��
        //�ڶ��η��� 100/2/2=25 ����ѭ�� 
        double height=100;//�Ѿ�����
        double all=100;
        for(int i=1;i<10;i++) //�Ѿ�����
        {
            all+=height; //����50 ����50
            height/=2;
        }
        System.out.println("�ܹ�����������"+all);
        System.out.println("��ʮ�η����߶ȣ�"+height/2);
    }
    
//������11��   
//��Ŀ����1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 
    public void test11()
    {
        int count=0;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                for(int k=1;k<5;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        System.out.println(i+""+j+""+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("�ܹ��У�"+count);
    }
    
//������12��   
//��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱��������Ӧ���Ž���������   

    
//������13��   
//��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�   
    public void test13()
    {
        for(int i=0;i<100000;i++)
        {
            if(Math.sqrt(i+100)%1==0 && Math.sqrt(i+100+168)%1==0)
            {
                System.out.println(i);
            }
        }
    }
    
//������14��  
//��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿   
    public void test14() 
    {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd��");
        //sdf.format(new Date("2116��12��25��"));
        try
        {
            Date d = sdf.parse("2016��1��25��");
            Date d2 = sdf.parse(d.getYear()+1900+"��1��1��");
            int day=(int)((d.getTime()-d2.getTime())/86400/1000);
            System.out.println(day+1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }
    
    
//    ������15��
//    ��Ŀ��������������x,y,z���������������С���������
    
    
    
//������16��
//��Ŀ�����9*9�ھ���   
    public void test16()
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    
//������17��   
//��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
//����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�   
    public void test17()
    {
        ///x1=2*(2+x2)
        
        int x=1;
        for(int i=1;i<10;i++)
        {
            x=2*(1+x);
        }
        System.out.println(x);
        
        int y=1534;
        for(int j=0;j<10;j++)
        {
            System.out.print("��"+(j+1)+"����"+y+"�����ӣ�");
            y=y/2-1;
            System.out.println("����һ���Ҷ��һ����ʣ��"+y+"�����ӣ�");//����10���������ٳ�ʱ����ֻʣ��һ�������� û��
        } 
       
    }
    
    
//������18��   
//��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������   




    
//������19��   
//��Ŀ����ӡ������ͼ�������Σ�  1 3 5 7 5 3 1
//   *   
//  ***   
// *****   
//*******   
// *****   
//  ***   
//   *   
    public void test19()
    {
        int max=20;
        String space=" ";
        for(int i=1;i<=max;i++)
        {
            //3�ո�1*
            //2�ո�3*
            //1�ո�5*
            //0�ն�7*
            for(int j=1;j<=max-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=max-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            //7 5 3 1
            
            for(int k=1;k<=(max*2-1)-2*i;k++)
            {
               System.out.print("*");
            }
            System.out.println();
        }




        
    }

    
    
//������20��   
//��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
    public void test20()
    {
        int x=1,x2=1;
        int y=1;
        double sum=0;
     
        for(int i=0;i<20;i++)
        {
            x=x+y; //2 3   
            y=x2; //1 2
            
            
          System.out.print(sum+"+"+x+"/"+y+"+=");  
          //x/y 2/1    3/2
            sum+=(double)x/y;
          System.out.println(sum);
          
            x2=x; //2
        }
        System.out.println(sum);
    }
    
    
//������21��   
//��Ŀ����1+2!+3!+...+20!�ĺ�   
    public void test21()
    {
//1*1                   1
//1*1*2			1*2
//1*1*2*3		2*3
//1*1*2*3*4		6*4
//1*1*2*3*4*5		24*5

        long sum=0;
        long t=1;
        for(int i=1;i<=20;i++)
        {
            t=t*i;
            sum+=t;
        }
        System.out.println(sum);
    }
    
    
//������22��   
//��Ŀ�����õݹ鷽����5!��
    public int test22(int num)
    {
        if(num==1){return num;}
        return num*test22(--num);
    }
    
    
//������23��   
//��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ
//�ʵ�4������������˵�ȵ�3���˴�2�ꡣ�ʵ������ˣ���˵�ȵ�2�˴����ꡣ
//�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ
//���ʵ�����˶��   
    public void test23()
    {
        int x=10;
        for(int i=1;i<5;i++)
        {
            x=x+2;
        }
        System.out.println(x);
    }
    
//������24��   
//��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�   
//ʹ���˳������������18λ
    
    
//������25��   
//��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��  
    public void test25()
    {
        int num=0;
        do
        {
            System.out.println("������һ��5λ����");
            Scanner s =new Scanner(System.in);
            num=s.nextInt();
            
        }while(num<=10000 || num>=99999);
        
        String s=String.valueOf(num);
        char[] chs=s.toCharArray();
        boolean flag=true;
        for(int i=0;i<chs.length/2;i++)
        {
            if(chs[i]!=chs[chs.length-i-1])
            {
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        
    }
    
    
    
//������26��   
//��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ���������   �жϵڶ�����ĸ��

    
    
    
//������27��   
//��Ŀ����100֮�ڵ�����   
//ʹ�ó�sqrt(n)�ķ������������������2��3
    public void test27()
    {       
        int count=1;
        boolean flag;

        System.out.print(2 + " ");   

        for(int i=3;i<=100;i+=2) //3 5 7 9 1���� 2�����ų���
        {
            flag=true;
           
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count++;
                System.out.print(i+ " ");  
            }
        }
        System.out.println("�ܹ�������"+count);
    }

//������28��   
//��Ŀ����10������������ 
    public void test28()
    {
        int[] list={5,13,4,0,1,8,3,9};
        int temp=0;
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length-1;j++)
            {
                if(list[j]>list[j+1])
                {
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i]);
        }
    }
    
//������29��   
//��Ŀ����һ��3*3����Խ���Ԫ��֮��     
//00  01  02  03
//10  11  12  13
//20  21  22  23
//30  31  32  33
    public void test29()
    {
        Scanner s =  new Scanner(System.in);
        int[][] triangle=new int[3][3];
        
        for(int i=0;i<triangle.length;i++)
        {
            for(int j=0;j<triangle[i].length;j++)
            {
                triangle[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<triangle.length;i++)
        {
            sum+=triangle[i][i];
            //sum+=triangle[i][triangle.length-1-i];//ֻ�����Խ���
        }
        System.out.println(sum);
    }
    
//������30��
//��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�    
    public void test30()
    {
        int[] a = new int[]{1, 2, 6, 14, 25, 36, 37,55};
        int[] b = new int[a.length+1];
        
        int num=0;
        int index=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        
        for(int i=0;i<a.length-1;i++)
        {
            if(num>=a[i] && num<=a[i+1])
            {
                index=++i;
                break;
            }
        }
        
        for(int i=0;i<index;i++)
        {
            b[i]=a[i];
        }
        b[index]=num;
        for(int i=index+1;i<b.length;i++)
        {
            b[i]=a[i-1];
        }
        
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
    
//������31��
//��Ŀ����һ�������������
    
    
    
//������32��   
//��Ŀ��ȡһ������a���Ҷ˿�ʼ��4��7λ�� 
    public void test32()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("������7λ���ϵ�����");
        Long num=s.nextLong();
        char[] list = num.toString().toCharArray();
        if(list.length<7)
        {
            System.out.println("�������");
        }
        //1234567
        for(int i=list.length-4;i>=list.length-7;i--)
        {
            System.out.print(list[i]+" ");
        }
    }
  
//    
//������33��  
//��Ŀ����ӡ����������Σ�Ҫ���ӡ��10������ͼ��      
//            1   
//          1    1   
//        1    2    1   
//      1    3    3    1   
//    1    4    6    4    1   
//1    5    10    10    5    1   
//��������
    
    
    
    
    
//������34��   
//��Ŀ������3����a,b,c������С˳�������   
    

    
    
//������35��   
//��Ŀ���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣 
    public void test35()
    {
        int N=10;
        int[] list=new int[10];
        Scanner s =new Scanner(System.in);
        
        System.out.println("������"+N+"������");
        for(int i=0;i<N;i++)
        {
            list[i]=s.nextInt();
        }
        
        //1 2 3
        int max=list[0],maxIdx=0;
        int min=list[0],minIdx=0;
        for(int i=1;i<N;i++)
        {
            if(list[i]>=max)
            {
                max=list[i];
                maxIdx=i;
            }
            if(list[i]<=min)
            {
                min=list[i];
                minIdx=i;
            }  
        }
        
        int temp=0;
        temp=list[0];
        list[0]=max;
        list[maxIdx]=temp;
        
        temp=list[list.length-1];
        list[list.length-1]=min;
        list[minIdx]=temp;
        
         System.out.println("���ֵΪ"+max);
         System.out.println("��СֵΪ"+min);
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
    }
    
    public void colorReplace() throws IOException {  
        File dir = new File("c:/haha");  
        File[] files = dir.listFiles();  
         
        for(int x=0;x<files.length;x++){  
            //����һ��RGB�����飬��ΪͼƬ��RGBģʽ�������� 0-255����ʾ�� �����ɫ����(255,255,255) 
            int[] rgb = new int[3];
            int[] rgb_right = new int[3];
            int[] rgb_down = new int[3];
            /*
             * ��������ͼƬ�Ļ����� 
             */  
            BufferedImage bi = null;  
            try {  
                /*
                 * ��ImageIO��ͼƬ���뵽������ 
                 */  
                bi = ImageIO.read(files[x]);  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            /*
             * �õ�ͼƬ�ĳ��� 
             */  
            int width = bi.getWidth();  
            int height = bi.getHeight();  
            int minx = bi.getMinX();  
            int miny = bi.getMinY();  
            System.out.println("���ڴ���"+files[x].getName());  
            /*
             * �����Ǳ���ͼƬ�����أ���ΪҪ����ͼƬ�ı�ɫ������Ҫ��ָ�������ϵ���ɫ����Ŀ����ɫ 
             * ���� ��һ������ѭ�����������Ϳ��ϵ�ÿ������ 
             */  
            for (int i = minx; i < width; i++) {  
                for (int j = miny; j < height; j++) {  
                    // System.out.print(bi.getRGB(jw, ih));  
                    /*
                     * �õ�ָ�����أ�i,j)�ϵ�RGBֵ�� 
                     */  
                    int pixel = bi.getRGB(i, j);  
                    /*
                    * �ֱ����λ�����õ� r g b�ϵ�ֵ 
                    */  
                    rgb[0] = (pixel & 0xff0000) >> 16;  
                    rgb[1] = (pixel & 0xff00) >> 8;  
                    rgb[2] = (pixel & 0xff); 

                    
                    
 
                    /*
                     * ���л�ɫ��������������Ҫ�����׻��ɰ׵ף���ô���ж�ͼƬ��rgbֵ�Ƿ�����ɫ��Χ������ 
                     */  
                    int[] p1={0,0,0};
                    
                    
                        if(rgb[0]>190&&rgb[0]<235 && 
                                rgb[1]>190&&rgb[1]<235 &&
                                rgb[2]>190&&rgb[2]<235 ){  
                            
                            if(Math.abs(rgb[0]-rgb[2])<15)
                            {
   //double d=this.getDistance(rgb, p1);
   //System.out.println(d);
   
   /*
                                 * �������ж�ͨ������Ѹ����ػ��ɰ�ɫ 
                                 */  
                                bi.setRGB(i, j, 0xffffff);
                            }
                        }
                        
                        
                        
                        
                        
                    if(i>1100 && j>1800)
                    {
                    if(rgb[0]>150&&rgb[0]<240 && 
                                rgb[1]>150&&rgb[1]<240 &&
                                rgb[2]>150&&rgb[2]<240 ){  
                            if(Math.abs(rgb[0]-rgb[2])<15)
                            {
                                /*
                                 * �������ж�ͨ������Ѹ����ػ��ɰ�ɫ 
                                 */  
                                bi.setRGB(i, j, 0xffffff);
                            }
                        }
                    }
                      
                }  
            }  
            System.out.println("\t������ϣ�"+files[x].getName());  
            System.out.println();  
            /*
             * ��������󱣴浽���ļ��� 
             */  
            FileOutputStream ops = new FileOutputStream(new File("c:/haha/"+x+"2.png"));  
            ImageIO.write(bi,"png", ops);  
            ops.flush();  
            ops.close();  
            }  
    }  
    
    
//������36��   
//��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����   

    public void test36()
    {

        int N=10;
        int[] list=new int[10];
        Scanner s =new Scanner(System.in);
        
        /*
        System.out.println("������"+N+"������");
        for(int i=0;i<N;i++)
        {
            list[i]=s.nextInt();
        }
        
        System.out.println("�����������Ϊ��");
        for(int i=0;i<N;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        */
        
        list=new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println("������Ҫ����ƶ���λ��");
        int m=s.nextInt();
        int[] temp=new int[m];
        
        //1 2 3 4 5 6 7 8 9 0 
        //8 9 0 1 2 3 4 5 6 7
        for(int i=0;i<m;i++)
        {
            temp[i]=list[list.length-m+i];
        }
        
        for(int i=list.length-1-m;i>=0;i--)
        {
            list[i+m]=list[i];
        }
        
        for(int i=0;i<m;i++)
        {
            list[i]=temp[i];
        }
       
        
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
    }
    
//������37��   
//��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ�� 
  
    
//    
//������38��   
//��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�   
    
    
    
//������39��   
//��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú���1/1+1/3+...+1/n(����ָ�뺯��)   
    public void test39()
    {
        System.out.println("������һ����");
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        double sum=0;
        if(n%2==0)
        {
            for(int i=2;i<=n;i+=2)
            {
                sum+=(double)1/i;
            }
        }
        else
        {
            for(int i=1;i<=n;i+=2)
            {
                sum+=(double)1/i;
            }
        }
        System.out.println(sum);
    }
    
    
//������40��   
//��Ŀ���ַ�������   
    
    

//������41��   
//��Ŀ����̲����һ�����ӣ���ֻ�������֡�
//��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
//�ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ�
//���������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
    public void test41()
    {
        //4=6-(6-1)/5-1
        //4+1=6-5/5
        //5=4/5+1/5
        //5(4+1)=4*6+1
        //20+5-1=24
        //20+4=24 
        //x2=x1-(x1-1)/5-1 x1%5=1
        //x2+1=x1-x1/5+1/5
        //x2+1=4/5*x1+1/5
        //x2+1=(4x1+1)/5
        //5(x2+1)=4x1+1
        //5x2+5-1=4x1
        //(5x2+4)/4=x1
        //x1=6 x2=4
        /*
        */
        this.test41_2();
    }

    public void test41_2 () { 
        int i,m,j=0,k,count; 
        for(i=4;i<10000;i+=4) 
           { count=0; 
             m=i; 
             for(k=0;k<5;k++) 
             { 
                 j=i/4*5+1; 
                 i=j;
                 System.out.println(j);
                 if(j%4==0)
                 {
                    count++;
                 }
                 else
                 {
                     break;
                 } 
               } 
            i=m; 
        if(count==4) 
        {System.out.println("ԭ������ "+j+" ��"); 
        break;} 
        } 
    }




    public double myPow(double x,int n)
    {
        //xΪż��ʱ
        //pow(x,16) = pow(x,8)*pow(x,8) ������x��ƽ��*pow(x,8)
        //pow(x,8)
        //pow(x,4)
        //pow(x,2)
        //pow(x,1)
        //pow(x,0)
        
        
        //pow(x,27) =pow(x,13)*pow(x,13)*x
        //pow(x,13)
        //pow(x,6)
        //pow(x,3)
        //pow(x,1)
        //pow(x,0)
        
        
        if(n==0){return 1;}
        /*
        if(n%2==0)
        {
            return myPow(x,n/2)*myPow(x,n/2);
        }
        else
        {
            return x*myPow(x,n/2)*myPow(x,n/2);
        } 
        */
        //�Ż���
        double v=myPow(x,n/2);
        if(n%2==0)
        {
            return v*v;
        }
        else
        {
            return x*v*v;
                    
        }
    }





} 
    







    
    
   
