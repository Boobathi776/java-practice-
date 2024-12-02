enum  Laptop 
{
    Macbook(2000),Surface,Thinkpad(4000);  //these are the objects and we the values that we passed is price 
    private int price;    //the price is send as a parameter to the Laptop constructor
  private  Laptop()  // this constructor get called when the surface object with no parameter
   {
    price = 500;
   }
    private Laptop(int price) {    //the constructor are private not default public becoz the objects are in the 
        this.price=price;          // the same claas 
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class EnumObjects {
public static void main(String[] args) {
    Laptop lap  =Laptop.Macbook;

    // System.out.println(lap+" :"+lap.getPrice());
    for(Laptop lapt:lap.values())   // here we print all the enum constants
    {
    System.out.println(lapt+" :"+lapt.getPrice());

    }
}    
}
