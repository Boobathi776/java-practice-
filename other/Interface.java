interface Computer{
    public void code();   // this method should be implemented by the inherited classes
}

class Laptop implements  Computer
{
    public void code()
   {
    System.out.println("this device is a laptop i can code in this laptop ");
   }
}

class Desktop implements  Computer
{
    public void code()
    {
        System.out.println("this device is a desktop for fast working ");
    }
}
class Developer
{
    public void develop(Computer desc)    // here the 'computer' interface reference received but  
    {                                     // the object is different from the main method 
        desc.code();                      // based on the object the code method gets called
    }
}
public class Interface {
    public static void main(String args[])
    {
           Computer lap=new Laptop();      // this both device is have a common reference interface
           Computer desc=new Desktop();   

           Developer boobathi = new Developer();   // here we pass the object but the type is a computer but the 
           boobathi.develop(lap);                 // but the object is  different 
     }    
}
