public class Factorial {
   void factorial(int n,int a)
    {
        for(int i=n;i>0;i--)
        {
            a=a*i;
            // a=product;
        }
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Factorial t= new Factorial();
        // int product;
        int n=6;
        int a=1;
        t.factorial(n,a);
        
    }    
}