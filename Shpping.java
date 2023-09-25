import java.util.*;
public class Shpping
{
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t>0){
            int suma=0;
            int sumh=0;
            int m= sc.nextInt();
            int n= sc.nextInt();
            for(int i=1;i<=m;i=i+2){
                 suma= suma+i;
                if(suma>=m)
                    break;
                
}
            for(int j=2;j<=n;j=j+2){
                 sumh=sumh+j;
                if(sumh>=n)
                    break;

}
if(suma>sumh)
   System.out.println("Aayush");
else
   System.out.println("Harshit");
   t--;

}
        }
}
}