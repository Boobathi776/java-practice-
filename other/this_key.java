class human{
String name;   // Instance variable

public void setname(String name)
{
    this.name=name;  //this keyword refers the instance variable
                    // if we put like name=name then it refers the same local variable that in the parameter not 
                    // the instance variable ,when we put this keyword it refer the current objects instance variable
}
}


class this_key
{
    public static void main(String args[])
    {
        human obj=new human();
        obj.setname("because i used this keyword in the setname method");
     System.out.println(obj.name);
    }
}