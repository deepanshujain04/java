import java.util.*;

public class Main1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();//Dividend
            int b = sc.nextInt();//Divisor
            int rem;
            while(a%b!=0){
                rem = a % b;
                a = b;
                b = rem;
            }
            System.out.println(b);
        }
    }
}