public class Hallow {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<5;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++)
            {
                if(k==1||k==5-1||i==1||i==5-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
    
}