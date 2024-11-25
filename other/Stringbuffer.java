class Stringbuffer
{
    public static void main(String[] args) {
        
        StringBuffer name=new StringBuffer("hi how are you ");
        // StringBuffer anname=new StringBuffer("hi how are you ");
        // String name="boobathi";
        // String name="boobathi";
        name.append("nothing");
        System.out.println(name);
        System.out.println(name.length());
        System.err.println(name.reverse());
        System.err.println(name.insert(0,"welcome "));
       
       

    }
}