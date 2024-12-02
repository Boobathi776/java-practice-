
import java.util.Scanner;

class Chatpattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.err.println("Enter the limit : ");
        int n=in.nextInt();
        int c=65;
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            if(i%2!=0)
            {    
                if(j%2!=0)
                System.out.print((char)c+ " ");
                else
                System.out.print((char)(c+32) + " ");
                
            }
            else
            {
                if(j%2!=0)
                  System.out.print((char)(c+32)+ " ");
                else
                  System.out.print((char)c + " ");
            }
            
            c++;
          }
          System.err.println();
        }
        
    }
}