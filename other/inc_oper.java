class inc_oper
{
    public static void main(String args[])
    {
        int i=10,j=5;
        int k;
        another obj=new another();
        k=obj.max(++i,j++);
        System.err.println(k);
      

    }
}

    class another
    {
         public  int max(int x,int y)
        {
            if(x>y)
            {
                return x;
            }
            else{
                return y;
            }
        }
    }
