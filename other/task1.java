import java.util.*;
class task1
{
    public static void main(String a[])
    {     
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String name=in.nextLine();
        System.out.println(name.length());
        StringBuffer sb=new StringBuffer(name);
        char arr[]=new char[sb.length()];
        System.out.println(sb);
        for(int i=0;i<sb.length();i++)
        {
            arr[i]=name.charAt(i);
        }
        
        int n=arr.length/2;
    
       for(int j=n;j<sb.length();j++)
        {
            System.out.println(arr[j]);
        }
        
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }

    }
}