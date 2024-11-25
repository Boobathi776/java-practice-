class mobile
{
    int price;
    static String name;

    static   //static method called when the class stored into the class loader in the JVM
    {        // this block called only once the class is loaded into to the class loader in the jvm
        name="boobathi";
        System.out.println("inside static block");
    }

    public mobile()  //its called whenever the object called
    {
        price=1550;
        System.out.println("inside constructor");
        
    }
}

class static_block
{
    public static void main(String a[])
    {
        mobile obj=new mobile();
        obj.price=2000;
        System.out.println(obj.price);
        
    }
}