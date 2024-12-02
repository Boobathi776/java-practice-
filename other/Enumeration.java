enum Status
{
     Runnning, Pending, Waiting, Working 
}
public class Enumeration {
    public static void main(String[] args) {
        
        Status s=Status.Pending;   // its like normal declration alike 'int a = 10';
        System.out.println(s);
        System.err.println(s.ordinal());  // ordinal()  method is used to get the index value of 
                                          //the constant in the enum class "output = 1 " becoz all values start from 0
        
        Status[] ss = Status.values();  // values() method get all the constants from the enum class 
        for(Status n:ss)
        {
            System.out.println(n +":"+ n.ordinal());   // here we print all the enum constants
        }
    }
    
}
