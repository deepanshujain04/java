public class divisibility_3and5 {
    public static void main(String[] arg) {
        int a = 15;
        if (a % 5 == 0 && a % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}