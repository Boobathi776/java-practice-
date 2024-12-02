/** In this file we can get know about how to use enum in if else conditions and 
 * switch cases to do certain things
 */
enum Status
{
    Runnning, Pending, Waiting, Working 
}
public class Enumcondition {
    public static void main(String[] args) {
        Status s=Status.Pending;   // its like normal declration alike 'int a = 10';
        if(s==Status.Pending)       // this is how the enum is compared using if conditon
             System.out.println("the app is running smoothly");

        switch (s) {
            case Runnning:
                System.out.println("app is running ");
                break;
                case Pending:
                System.out.println("app is stoped ");
                break;

                case Waiting:
                System.out.println("app is waiting to resume ");
                break;

                default:     
                System.out.println("app is good ");
                break; 
        }

    }
    
}
