import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        System.out.print("Enter a String : ");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
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