class Calc
{
    public void add()
    {
        System.out.println("its a add method");
    }
}
class AdvCalc extends Calc
{
    public void mul()
    {
        System.out.println("inside the mul in advance calc class");

    }
}
class SceiCalc extends AdvCalc
{
     public void power()
     {
        System.out.println("inside power method ");
     }
}

class Inheritance
{
    public static void main(String[] args) {
        
        SceiCalc obj=new SceiCalc();
        obj.add();
        obj.mul();
        obj.power();
        

    }
}