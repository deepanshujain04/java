
public class Nod {

    public static void main(String[] args) {
        int a=4;
      int sum=0;
      int b =a;
      int nod =0;
      while(b>0){
        nod++;
        b=b/10;
      }
      System.out.println(nod);
      b=a;

      while (b>0){
        int dig =b%10;
        sum =sum+dig*dig*dig*dig;
        b/=10;
      }
      System.out.println(sum);
      if(sum==a){
        System.out.println("armstrong number");

      }else{
        System.out.println("not a armstrong number");
      }

    }
    
}