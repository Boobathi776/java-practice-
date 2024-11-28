class A
{
    int age;
    public void disp()
    {
        System.out.println(" in the class A's display method");
    }

    static class B{      //static class only availble within the inner class only
         
        public void config()
        {
            System.out.println("inside class B's config method");
        }
    }
}
public class Innerclass {
    public static void main(String args[])
    {

         A a = new A();
         a.disp();
        // A.B b = a.new B();   //use object 'a' to create object for class B 
        //if class B is a static class then use like below
         A.B b=new A.B();
         b.config();
    }
    
}
