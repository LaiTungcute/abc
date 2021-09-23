import java.util.Scanner;

public class tung {
    public static void sapxep(int []a, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void xuat(int []a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int tong(int []a, int n){
        int s = 0;
        for(int i=0;i<n;i++){
            if(a[i]>10) s+=a[i];
        }
        return s;
    }

    public static int check(int []a, int n){
        int t=0;
        int s=0;
        for(int i=n-1;i>=05;i--){
            while(s<=60){
                s+=a[i];
                t++;
            }
        }
//        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sapxep(a,n);
        xuat(a,n);
        System.out.println();
        System.out.println(tong(a,n));
        System.out.println(check(a,n));
    }
}
