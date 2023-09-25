import java.util.Scanner;

public class SumofOdd {
    public static void main(String args[]) {
        try (//Sum of odd placed and even placed digits
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();//TAKING INPUT
            int pos = 1;
            int o = 0;//FOR ODD NO
            int e = 0;//FROR EVEN NO
            while(n > 0){
                int x = n%10;//TAKING LAST NO.
                n = n/10;//DECREASING ACTUAL NO.
                if(pos%2 == 1){
                    o += x;
                }
                else{
                    e += x;
                }
                pos++;
            }
            System.out.println(o);
            System.out.println(e);
        }
    }
}
