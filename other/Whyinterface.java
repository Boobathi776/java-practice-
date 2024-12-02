class Computer{
    public void code()
    {

    }
}

class Laptop extends Computer
{
    public void code()
   {
    System.out.println("this device is a laptop i can code in this laptop ");
   }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("this device is a desktop for fast working ");
    }
}
class Developer
{
    public void develop(Computer desc)    // here the 'computer' class reference received but  
    {                                     // the object is different from the main method 
        desc.code();                      // based on the object the code method gets called
    }
}
public class Whyinterface {
    public static void main(String args[])
    {
           Computer lap=new Laptop();      // this both device is have a common reference  class
           Computer desc=new Desktop();   

           Developer boobathi = new Developer();   // here we pass the object but the type is a computer but the 
           boobathi.develop(lap);                 // but the object is  different 
     }    
}

/** In this code we don't implement the code in the class 'Computer ' that's why we 
 * using interface to just create template for other classes without giving any implementation 
 * 
 * just see the --"Interface.java"
*/