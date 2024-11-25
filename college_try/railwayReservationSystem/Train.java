import java.util.*;
class Train
{
        public static void pudThir()
        {

        }

        public static int thanThir()
        {
            Scanner in = new Scanner(System.in);
            int pseats=thanPud();
            int tseats=0;
            int remain=pseats+tseats;
            int seats;
            if(remain>0)
            {
                System.out.print("how many seats you want : ");
                int  taseats=in.nextInt();
                if(taseats<=remain)
                {
                    seats=remain-taseats;
                    System.out.println("Remaining seats from thanjavur to thiruvayar :"+seats);
                    return seats;
                }
                else
                {

                    System.out.println("Not enough seats available.");
                    return remain;
                }
            }
            else
            {
                return 0;
            }
             
        }
        
        public static int thanPud()
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Remaining seats from Thanjavur to Pudhukottai: ");
        int bookedSeats = thanThir();  
        int totalSeats = 10;
        int remain = totalSeats - bookedSeats;
        int seats = 0;

        if(remain > 0)
        {
            System.out.print("How many seats you want: ");
            int pudhSeats = in.nextInt();

            if(remain >= pudhSeats)
            { 
                seats = remain - pudhSeats;
                System.err.println("Remaining available seats from Thanjavur to Pudhukottai: " + seats);
                return seats;
            }
            else
            {
                System.out.println("Not enough seats available.");
                return remain;
            }
        }
        else
        {
            System.out.println("No more seats available");
            return 0;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.err.println("Welcome to ticket reservation system");
        do
        { 
        //System.err.print("Enter user name : ");
        //String name=in.nextLine();
            System.err.println("Available stations: \n 1.Thanjavur(than) to Pudhukottai(pud) \n 2.Thanjavur(than) to Thiruvayar(thir) \n 3.Pudhukottai(pud) to Thiruvayar(thir)");
            System.out.print("/n From : ");
            String from=in.nextLine();
            System.err.print("/n To : ");
            String to=in.nextLine();
            if(from.equals("than") && to.equals("pud"))
            {
                int seats = thanPud();
                System.out.println(seats);
            }
            else if(from.equals("than")&&to.equals("thir"))
            {
                int seats=thanThir();
                System.out.println(seats);
            }
            else
            {
                System.out.println("Invalid destination selection");
            }
            System.out.println("For book more seats say yes or no : ");
            String val=in.nextLine();
            if(val.equals("no"))
            {
                break;
            }
        }while(true);
    }
}