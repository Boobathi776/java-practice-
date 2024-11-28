/** in this file we are gonna see the anonymous inner class  and also thE abstract class's abstract methods 
 * implementation without creating new class for implementing it 
 */
abstract class A
{
    public abstract  void show();
    public abstract  void config();

    
}
public class AnonymousInner {
    public static void main(String[] args) {
        A obj=new A() {
            public void show()
        {
            System.out.println("we are in the another class but we didn't creat new class");
        }

        public void config()
        {
            System.err.println("inside the config method");
        }
        };
        obj.show();
        obj.config();
    }
    
}
