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
//【程序1】   
    //题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
//这是一个菲波拉契数列问题
    
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
        System.out.println("第1个月的兔子对数:    1");
        System.out.println("第2个月的兔子对数:    1");
        int f1 = 1, f2 = 1, f, M=24;
        for(int i=3; i<=M; i++) 
        {
           f = f2;
           f2 = f1 + f2;
           f1 = f;
           System.out.println("第" + i +"个月的兔子对数: "+f2);
        }
    }
  //【程序2】     
    //题目：判断101-200之间有多少个素数，并输出所有素数。 
    public void sushu()
    {
        int count=0;
        boolean flag=false;
       for(int i=101;i<=200;i+=2) //双数可以除以2，所以只有单数，步进2
       {
           flag=true;
           for(int j=2;j<=Math.sqrt(i);j++) //小于等于（平方的情况）
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

    //【程序3】   
    //题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
    public void dafodilCount()
    {
        int a=0,b=0,c=0;
        for(int i=100;i<999;i++)
        {
            a=i%10; //个位
            b=i/10%10; //十位
            c=i/100; //百位

            if(a*a*a+b*b*b+c*c*c==i)
            {
                 System.out.println(i);
            }
        }
    }

    //【程序4】   
    //题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。   
    //程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：   
    //(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。   
    //(2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。   
    //(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。  
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


    //【程序5】   
    //题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    public void scoreGrade()
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        char c= a>=90 ? 'A' : a>60 && a<=89 ? 'B' : 'C';
        System.out.println(c);
    }

 


    //【程序6】   
    //题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
    //在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。* /
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
        System.out.println("最大公约数："+maxCommonDivisor);
        System.out.println("最小公倍数："+minCommonMultiple);
    }
    
    
//【程序7】   
//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。   
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
        System.out.println("数字个数："+numberCount);
        System.out.println("字母个数："+charCount);
        System.out.println("空格个数："+spaceCount);
        System.out.println("其他个数："+otherCount);
    }
    
    
//【程序8】   
//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。   
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
    

//【程序9】   
//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。   
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
    
    
//【程序10】   
//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在     第10次落地时，共经过多少米？第10次反弹多高？ 
    public void countFallandRebound()
    {
        //落下100 反弹50 落下50 反弹25 落下25 反弹12.5 落下12.5
        //第二次落下 100+(50+50) 一次循环
        //第二次反弹 100/2/2=25 二次循环 
        double height=100;//已经落下
        double all=100;
        for(int i=1;i<10;i++) //已经落下
        {
            all+=height; //弹起50 落下50
            height/=2;
        }
        System.out.println("总共经过米数："+all);
        System.out.println("第十次反弹高度："+height/2);
    }
    
//【程序11】   
//题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
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
        System.out.println("总共有："+count);
    }
    
//【程序12】   
//题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？   

    
//【程序13】   
//题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？   
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
    
//【程序14】  
//题目：输入某年某月某日，判断这一天是这一年的第几天？   
    public void test14() 
    {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        //sdf.format(new Date("2116年12月25日"));
        try
        {
            Date d = sdf.parse("2016年1月25日");
            Date d2 = sdf.parse(d.getYear()+1900+"年1月1日");
            int day=(int)((d.getTime()-d2.getTime())/86400/1000);
            System.out.println(day+1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }
    
    
//    【程序15】
//    题目：输入三个整数x,y,z，请把这三个数由小到大输出。
    
    
    
//【程序16】
//题目：输出9*9口诀。   
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
    
//【程序17】   
//题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
//第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
//到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。   
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
            System.out.print("第"+(j+1)+"天有"+y+"个桃子，");
            y=y/2-1;
            System.out.println("吃了一半且多吃一个后剩下"+y+"个桃子，");//到第10天早上想再吃时，见只剩下一个桃子了 没吃
        } 
       
    }
    
    
//【程序18】   
//题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。   




    
//【程序19】   
//题目：打印出如下图案（菱形）  1 3 5 7 5 3 1
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
            //3空格1*
            //2空格3*
            //1空格5*
            //0空额7*
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

    
    
//【程序20】   
//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
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
    
    
//【程序21】   
//题目：求1+2!+3!+...+20!的和   
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
    
    
//【程序22】   
//题目：利用递归方法求5!。
    public int test22(int num)
    {
        if(num==1){return num;}
        return num*test22(--num);
    }
    
    
//【程序23】   
//题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
//问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。
//问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。
//请问第五个人多大？   
    public void test23()
    {
        int x=10;
        for(int i=1;i<5;i++)
        {
            x=x+2;
        }
        System.out.println(x);
    }
    
//【程序24】   
//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。   
//使用了长整型最多输入18位
    
    
//【程序25】   
//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。  
    public void test25()
    {
        int num=0;
        do
        {
            System.out.println("请输入一个5位数字");
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
    
    
    
//【程序26】   
//题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。

    
    
    
//【程序27】   
//题目：求100之内的素数   
//使用除sqrt(n)的方法求出的素数不包括2和3
    public void test27()
    {       
        int count=1;
        boolean flag;

        System.out.print(2 + " ");   

        for(int i=3;i<=100;i+=2) //3 5 7 9 1不是 2单独放出来
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
        System.out.println("总共个数："+count);
    }

//【程序28】   
//题目：对10个数进行排序 
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
    
//【程序29】   
//题目：求一个3*3矩阵对角线元素之和     
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
            //sum+=triangle[i][triangle.length-1-i];//只需正对角线
        }
        System.out.println(sum);
    }
    
//【程序30】
//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。    
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
    
//【程序31】
//题目：将一个数组逆序输出
    
    
    
//【程序32】   
//题目：取一个整数a从右端开始的4～7位。 
    public void test32()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入7位以上的数字");
        Long num=s.nextLong();
        char[] list = num.toString().toCharArray();
        if(list.length<7)
        {
            System.out.println("输入错误！");
        }
        //1234567
        for(int i=list.length-4;i>=list.length-7;i--)
        {
            System.out.print(list[i]+" ");
        }
    }
  
//    
//【程序33】  
//题目：打印出杨辉三角形（要求打印出10行如下图）      
//            1   
//          1    1   
//        1    2    1   
//      1    3    3    1   
//    1    4    6    4    1   
//1    5    10    10    5    1   
//…………
    
    
    
    
    
//【程序34】   
//题目：输入3个数a,b,c，按大小顺序输出。   
    

    
    
//【程序35】   
//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。 
    public void test35()
    {
        int N=10;
        int[] list=new int[10];
        Scanner s =new Scanner(System.in);
        
        System.out.println("请输入"+N+"个数字");
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
        
         System.out.println("最大值为"+max);
         System.out.println("最小值为"+min);
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
    }
    
    public void colorReplace() throws IOException {  
        File dir = new File("c:/haha");  
        File[] files = dir.listFiles();  
         
        for(int x=0;x<files.length;x++){  
            //定义一个RGB的数组，因为图片的RGB模式是由三个 0-255来表示的 比如白色就是(255,255,255) 
            int[] rgb = new int[3];
            int[] rgb_right = new int[3];
            int[] rgb_down = new int[3];
            /*
             * 用来处理图片的缓冲流 
             */  
            BufferedImage bi = null;  
            try {  
                /*
                 * 用ImageIO将图片读入到缓冲中 
                 */  
                bi = ImageIO.read(files[x]);  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            /*
             * 得到图片的长宽 
             */  
            int width = bi.getWidth();  
            int height = bi.getHeight();  
            int minx = bi.getMinX();  
            int miny = bi.getMinY();  
            System.out.println("正在处理："+files[x].getName());  
            /*
             * 这里是遍历图片的像素，因为要处理图片的背色，所以要把指定像素上的颜色换成目标颜色 
             * 这里 是一个二层循环，遍历长和宽上的每个像素 
             */  
            for (int i = minx; i < width; i++) {  
                for (int j = miny; j < height; j++) {  
                    // System.out.print(bi.getRGB(jw, ih));  
                    /*
                     * 得到指定像素（i,j)上的RGB值， 
                     */  
                    int pixel = bi.getRGB(i, j);  
                    /*
                    * 分别进行位操作得到 r g b上的值 
                    */  
                    rgb[0] = (pixel & 0xff0000) >> 16;  
                    rgb[1] = (pixel & 0xff00) >> 8;  
                    rgb[2] = (pixel & 0xff); 

                    
                    
 
                    /*
                     * 进行换色操作，我这里是要把蓝底换成白底，那么就判断图片中rgb值是否在蓝色范围的像素 
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
                                 * 这里是判断通过，则把该像素换成白色 
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
                                 * 这里是判断通过，则把该像素换成白色 
                                 */  
                                bi.setRGB(i, j, 0xffffff);
                            }
                        }
                    }
                      
                }  
            }  
            System.out.println("\t处理完毕："+files[x].getName());  
            System.out.println();  
            /*
             * 将缓冲对象保存到新文件中 
             */  
            FileOutputStream ops = new FileOutputStream(new File("c:/haha/"+x+"2.png"));  
            ImageIO.write(bi,"png", ops);  
            ops.flush();  
            ops.close();  
            }  
    }  
    
    
//【程序36】   
//题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数   

    public void test36()
    {

        int N=10;
        int[] list=new int[10];
        Scanner s =new Scanner(System.in);
        
        /*
        System.out.println("请输入"+N+"个数字");
        for(int i=0;i<N;i++)
        {
            list[i]=s.nextInt();
        }
        
        System.out.println("您输入的数组为：");
        for(int i=0;i<N;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        */
        
        list=new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println("请输入要向后移动的位数");
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
    
//【程序37】   
//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。 
  
    
//    
//【程序38】   
//题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。   
    
    
    
//【程序39】   
//题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)   
    public void test39()
    {
        System.out.println("请输入一个数");
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
    
    
//【程序40】   
//题目：字符串排序。   
    
    

//【程序41】   
//题目：海滩上有一堆桃子，五只猴子来分。
//第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
//第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，
//第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
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
        {System.out.println("原有桃子 "+j+" 个"); 
        break;} 
        } 
    }




    public double myPow(double x,int n)
    {
        //x为偶数时
        //pow(x,16) = pow(x,8)*pow(x,8) 而不是x的平方*pow(x,8)
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
        //优化后
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
    







    
    
   
