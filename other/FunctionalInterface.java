
@java.lang.FunctionalInterface
interface A{
    public void show();

}
public class FunctionalInterface {
  public static void main(String[] args) {
             A a = new A() {
            public void show()
            {
                System.out.println(" we are in the show ");
            }
             };      
             a.show();
  }  
}
