class Increment
{

     public static int max(int x,int y)
        {
            int re;
          re=((x)>(y))? (x):(y);
          System.out.println(x);
          System.out.println(y);

          return re;
        }
    
        public static void main(String[] args) {
        int i,j,k;
        i=10;
        j=5;
        k=max(++i,j++);
        System.out.println(i+" "+j+" "+k);
         }
}