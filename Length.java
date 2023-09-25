import java.util.Scanner;
public class Length {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            int length =str.length();
            System.out.println(length);
        }
    }
    
}