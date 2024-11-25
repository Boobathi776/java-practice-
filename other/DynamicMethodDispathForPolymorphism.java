class A{
    public  void show()
    {
        System.out.println("naan A kulla irukken");
    }
}
class B extends A{
     public  void show()
    {
        System.out.println("naan B kulla irukken");
    }
}
class C extends A{
     public  void show()
    {
        System.out.println("naan C kulla irukken");
    }
}

public class DynamicMethodDispathForPolymorphism
{
    public static void main(String args[])
    {
       A obj=new B();  //here the datatype a A class but the object is created at the heap is for class B
       obj.show();
       
       obj=new A();  // normal declaration
       obj.show();

       obj=new B();
       obj.show();

       obj=new C();
       obj.show();
                    // so same object has different behaviour so which method is going to be called is not predictable 
    }
    
}