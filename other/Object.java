class Laptop
{
    String modelname;
    int price;

    public String toString()
    {
       // return "i am in the Laptop class method name toString";
        return modelname + ":" + price; 
    }

    public boolean equals(Laptop that)
    {
            if(that.modelname.equals(this.modelname) && that.price==this.price)
            
                return true;
            else
                return false;
            
    }
}
class Object
{
    public static void main(String args[])
    {
        Laptop obj1=new Laptop();
        obj1.modelname="acer";
        obj1.price=44_000;

        Laptop obj2=new Laptop();
        obj2.modelname="acer";
        obj2.price=44_000;
        boolean result=obj1.equals(obj2);
        System.out.println(obj1.toString());
        System.out.println(result);
    }
}