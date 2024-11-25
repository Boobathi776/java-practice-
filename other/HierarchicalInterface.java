import java.util.*;
interface A
{
     public void getdata();
     public void putdata();
}

class D1 implements A
{   int num;
    public void getdata()
    {
    Scanner in=new Scanner(System.in);
    System.err.print("Enter the limit : ");
     num=in.nextInt();
    }

    public void putdata()
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

class D2 implements A
{   int num;
    public void getdata()
    {
    Scanner in=new Scanner(System.in);
    System.err.print("Enter the limit : ");
     num=in.nextInt();
    }

    public void putdata()
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=num-i+1;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

class D3 implements A
{   int num;
    String str;
    public void getdata()
    {
    Scanner in=new Scanner(System.in);
    System.err.print("Enter the String : ");
     str=in.next();
     num=str.length();
    }

    public void putdata()
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}

class D4 implements A
{   int num;
    String str;
    public void getdata()
    {
    Scanner in=new Scanner(System.in);
    System.err.print("Enter the String : ");
    str=in.next();
     num=str.length();
    }

    public void putdata()
    {
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=num-i-1;k++)
            {
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}



public class HierarchicalInterface {
    public static void main(String args[])
    {
        D1 d1=new D1();
        d1.getdata();
        d1.putdata();
        D2 d2=new D2();
        d2.getdata();
        d2.putdata();
        D3 d3 =new D3();
        d3.getdata();
        d3.putdata();
        D4 d4=new D4();
        d4.getdata();
        d4.putdata();

    }
    
}
