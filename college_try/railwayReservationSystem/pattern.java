import java.util.*;
class pattern 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String val=in.nextLine();
        int len=val.length();
        char arr[][]=new char[len][len];
        char[] name=new char[len];
        

        System.out.println(name[-1]);
        int i=-1;
        while(i<-5)
        {
            arr[i][i]=name[i];
            i--;
            
        }
        
        int j=0;
        while(j<arr.length)
        {
            arr[j][j]=name[j];
            j++;
        }
  
    //    for(int a=0;a<arr.length;a++)
    //    {
    //     for(int b=0;b<arr.length;b++)
    //     {
    //         System.out.println(arr[a][b]);
    //     }
    //     System.out.println("\n");
    //    }
    }
}