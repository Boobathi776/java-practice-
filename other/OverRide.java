class Calc
{
    public  int add(int n1,int n2)
    {
        return n1 + n2 ;
    } 
}

class AdvCalc extends Calc
{
   public int add(int n1,int n2)   // this method over ride the add method that in the Calc class
   {
    return n1+n2+1;
    }
}

class OverRide
{
    public static void main(String args[])
    {
        AdvCalc obj=new AdvCalc();
        int r=obj.add(10, 5);
        System.out.println(r);
    }
}