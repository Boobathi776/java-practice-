interface A
{
    public void display();

}

public class LamdaExp {
    public static void main(String[] args)
    {
        //  A obj=new A() {
        //      public void display() {                                 // this is the normal way of create object for 
        //          System.out.println("i am the display method ");     //funtional interface(only have one abstract method)
        //      }
        //  };

       A obj = ()->{System.out.println("Welcome to my world");};
       obj.display();
    }
}
