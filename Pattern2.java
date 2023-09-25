public class Pattern2{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for(int k =5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j =i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int a =2;a<=i;a++)
            {
                System.out.print(a);    
            }
            System.out.println();
        }
    }    
}