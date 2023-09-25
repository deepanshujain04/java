    import java.util.*;
    public class Reversed {
        public static void main(String args[]) {
            try (//Print reverse
            Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();//TAKING INPUT
                int rev =  0;
                while(n != 0) {
                    int digit = n % 10;//last digit 
                    rev = rev * 10 + digit;
                    n /= 10;//Decreasing no.
                }
                System.out.println(rev);
            }
        }
       
    }
