import java.util.*;
public class F2C {
    public static void main(String args[]) {
        try (// Conversion (Fahrenheit to Celsius)
        Scanner sc = new Scanner(System.in)) {
            int minf = sc.nextInt();//Minimum Fahrenheit value
            int maxf = sc.nextInt();//Maximum Fahrenheit value
            int step = sc.nextInt();//Step b|w them
            int tempf=minf;
            int c = 0;
            while(tempf<=maxf){
                c=(((tempf-32)*5)/9);
                System.out.println(tempf+"    "+c);
                tempf=tempf+step;
            }
        }
    }
}
