
class mobile
{
    int price;
    static String name;   //static name
    
     public static void show(mobile obj)   //staic method
    {
        System.out.println(obj.price +" "+mobile.name);
    }
}
class static_key
{
public static void main(String[] args) {
    mobile obj=new mobile();
    obj.price=1500;
    mobile.name="samsung";
     String arr[]=new String[100];
     
          mobile.show(obj);
}
}
