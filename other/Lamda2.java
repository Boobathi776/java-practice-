interface A
{
  public void not(int a,int b);
}
class Lamda2
{
public static void main(String[] args) {
    int a=5,b=5;
    A obj=(c,d)->{ System.out.println(c+d);};   // lamda expression with more than one parameter
    obj.not(a,b);
}
}



