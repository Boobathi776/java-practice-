class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{   @Override    // this annotaion makes compiler know that this show() methos override A class's show() method
    public void show()
    {
        System.err.println("In B show");
    }
}
public class Annotations {
    public static void main(String[] args) {
        B b=new B();
        b.show();    
    }
    
}
