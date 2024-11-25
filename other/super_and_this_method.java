class A  extends Object  // object class is the defaultly extends
{
 public A()   
 {
    super();        // the parent class A has defaultly call the object classes constructor 
    System.out.println("in constructor A");
 }

 public A(int n)
 {
    super();      // the super class defaultly in the constructor no need to implicit 
    System.out.println("in constructor int A");
 }

}


class B extends A
{
     public B()
     {
      //  super();              // this super() class call the parent classes constructor 

        this(5);               //here this() call the B classes parametered constructor 
        System.out.println("in constructor B");
     }

     public B(int n)
     {
        super(n);    // here it call the parent class A's parameterd constructor 

        System.out.println("in para constructor of B");
     }
}




class super_and_this_method
{
    public static void main(String args[])
    {
     
     B obj=new B();


        
    }
}