/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class MumTest {
/*    
    
    public char[] mySubstr(char[] a,int start,int len)
    {
        if(start+len>a.length || start<0 || len<0){return null;}
        
        char[] b=new char[len];
        
        for(int i=0;i<len;i++)
        {
            b[i]=a[i+start];
        }
        
        return b;
    }
    
    public void mySubstrTest()
    {
//{'a', 'b', 'c'}, 0, 4	null
//{'a', 'b', 'c'}, 0, 3	{'a', 'b', 'c'}
//{'a', 'b', 'c'}, 0, 2	{'a', 'b'}
//{'a', 'b', 'c'}, 0, 1	{'a'}
//{'a', 'b', 'c'}, 1, 3	null
//{'a', 'b', 'c'}, 1, 2	{'b', 'c'}
//{'a', 'b', 'c'}, 1, 1	{'b'}
//{'a', 'b', 'c'}, 2, 2	null
//{'a', 'b', 'c'}, 2, 1	{'c'}
//{'a', 'b', 'c'}, 3, 1	null
//{'a', 'b', 'c'}, 1, 0	{}
//{'a', 'b', 'c'}, -1, 2	null
//{'a', 'b', 'c'}, -1, -2	null
//{}, 0, 1	null
       
        char[] a ={'a','b','c'};
        this.println(this.mySubstr(a, 0, 4));
        this.println(this.mySubstr(a, 0, 3));
        this.println(this.mySubstr(a, 0, 2));
        this.println(this.mySubstr(a, 0, 1));
        this.println(this.mySubstr(a, 1, 3));
        this.println(this.mySubstr(a, 1, 2));
        this.println(this.mySubstr(a, 1, 1));
        this.println(this.mySubstr(a, 2, 2));
        this.println(this.mySubstr(a, 2, 1));
        this.println(this.mySubstr(a, 3, 1));
        this.println(this.mySubstr(a, 1, 0));
        this.println(this.mySubstr(a, -1, 2));
        char[] b=new char[]{};
        this.println(this.mySubstr(b, 0, 1));
    }
    
    public void println(char[] obj)
    {
        if(obj==null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(obj);
        }
    }
    
    
    int secondLargestInteger(int a[])
    {
        int max=-1;
        int second=-1;
        for(int i=0;i<a.length;i++)
        {
                if(a[i]>max)
                {
                    second=max; //-1 1  2  3
                    max=a[i];   //4  4  4  4
                }
                else if(a[i]<max && a[i]>second)
                {
                    second=a[i];
                }
        }
        System.out.println(second);
        return second;
    }
    public void secondLargestIntegerTest()
    {
        secondLargestInteger(new int[]{1, 2, 3, 4});
        secondLargestInteger(new int[]{4, 1, 2, 3});
        secondLargestInteger(new int[]{1, 1, 2, 2});
        secondLargestInteger(new int[]{1, 1});
        secondLargestInteger(new int[]{1});
        secondLargestInteger(new int[]{});
    }
            
    
    int oddMinusEven(int a[],int len)
    {
        int X=0;
        int Y=0;
        for(int i=0;i<len;i++)
        {
            if(a[i]%2==1)//odd
            {
                    X+=a[i];
            }
            else //even
            {
                    Y+=a[i];
            }
        }
        return X-Y;
    }
*/
    
    /*
    public static void main(String args[])
    {
        MumTest mt =new MumTest();
        mt.mySubstrTest();
    }
*/
    
//1. Write a function that accepts an array of non-negative integers and returns the second largest integer in the array. Return -1 if there is no second largest.
    /*
    public static int a1(int[ ] a)
    {
        if(a.length<2){return -1;}
        int max=-1,second=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                second=max;
                max=a[i];
            }
            else if(a[i]<max && a[i]>second)
            {
                second=a[i];
            }
        }
        return second;
    }
    
    public static void main(String[] args)
    {
        MumTest.a1(new int[]{1,2,3,4});
        MumTest.a1(new int[]{4,1,2,3});
        MumTest.a1(new int[]{1,1,2,2});
        MumTest.a1(new int[]{1,1});
        MumTest.a1(new int[]{1});
        MumTest.a1(new int[]{});
    }
    */
    
    /*
    static int a2(int[ ] a)
    {
        if(a.length<1){return 0;}
        
        int X=0,Y=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0) //even
            {
                Y+=a[i];
            }
            else
            {
                X+=a[i];
            }
        }
        return X-Y;
    }
    
    public static void main(String[] args)
    {
        a2(new int[]{1});
        a2(new int[]{1,2});
        a2(new int[]{1,2,3});
        a2(new int[]{1,2,3,4});
        a2(new int[]{3, 3, 4, 4});
        a2(new int[]{3, 2, 3, 4});
        a2(new int[]{4,1,3,2});
        a2(new int[]{1,1});
        a2(new int[]{});
    }
    */
    
    /*
    static char[] a3(char[] a, int start, int len)
    {
        if(len+start > a.length || start >= a.length || start<0){return null;}
        char[] chs = new char[len];
        
        for(int i=0;i<len;i++)
        {
            chs[i]=a[i+start];
        }
        return chs;
    }
    
    static void printChs(char[] chs)
    {
        if(chs==null){System.out.println("null");return;}
        for(int i=0;i<chs.length;i++)
        {
            System.out.print(chs[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        a3(new char[]{'a','b','c'},0,4);
        a3(new char[]{'a','b','c'},0,3);
        a3(new char[]{'a','b','c'},0,2);
        a3(new char[]{'a','b','c'},0,1);
        a3(new char[]{'a','b','c'},1,3);
        a3(new char[]{'a','b','c'},1,2);
        a3(new char[]{'a','b','c'},1,1);
        a3(new char[]{'a','b','c'},2,2);
        a3(new char[]{'a','b','c'},2,1);
        a3(new char[]{'a','b','c'},3,1);
        a3(new char[]{'a','b','c'},1,0);
        a3(new char[]{'a','b','c'},-1,2);
        a3(new char[]{'a','b','c'},-1,-2);
        a3(new char[]{},0,1);
    }
*/
}
