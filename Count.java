    import java.util.*;
    
    public class Count {
        public static void main(String args[]) {
            try (//Count Digits
            Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();//ACTUAL NO.
                int x = sc.nextInt();//NO. TO COUNT FREQUENCY
                int flag=0;
                int rem = 0;
                while(n>0){
                    rem = n%10;
                    n = n / 10;
                    if(rem==x){
                        flag++;
                    }
                }
                System.out.println(flag);
            }
        }
    }
