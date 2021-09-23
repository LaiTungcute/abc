import java.util.Scanner;

public class Hihi {

   public static double Z(int n, int m){
       double s = m + 1/n;
       if(m+1/n<0 || n==0) return -1;
       return Math.sqrt(m+1/n);
   }

   public static double G(int n, double x){
       double s = 20*Math.exp(Math.abs(1-2*n));
       double tu=x;
       for(int i=1;i<=n;i++){
           s+= tu/(2*i+1);
           tu*=x;
       }
       return s;
   }

    public static void main(String[] args) {
        int n;
        double x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextDouble();
        System.out.println(Z(n,2*n));
        System.out.println(G(n,x));
    }
}