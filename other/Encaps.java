import java.util.*;
class human
{
    private String name;   // these values only accessible only inside this class only 
    private int age;      //   this will be accessible by pulbic method 

    public void setname(String na)  // this method is used to set the value to the private variable
    {
         name=na;
    }
     public void setage(int ag)
    {
         age=ag;
    }
    public String getname()   // this method is used to get the private value from the main 
    {
        return name;
    }
     public int  getage()
    {
        return age;
    }
}


class Encaps
{
    public static void main(String[] args) {

      Scanner in=new Scanner(System.in);
        human obj=new human();
        obj.setname(in.nextLine());    // the private variable can be accessible by methods 
        obj.setage(in.nextInt());
        System.err.println(obj.getage() + " :" + obj.getname());
    }
}