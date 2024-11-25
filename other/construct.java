class construct
{
    public static void main(String[] args) {
        New obj=new New();
        New obj1=new New("boobathi");
    }
}

class New
{
    String name;
    public  New()    //default constructor
    {
      System.out.println("inside the constructor");
    }

    public New(String name)     // parameterized constructor
    {
        this.name=name;
        System.err.println("parameter passed by "+name);
    }
}