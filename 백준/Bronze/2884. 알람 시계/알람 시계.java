import java.util.Scanner;
public class Main {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int M_m=0;
        int H_m=0;
        if(M<45){
            if(H!=0) {
                M_m = M - 45;
                H_m = -1;
                System.out.println((H + H_m) + " " + (60 + M_m));
            }
            else{
                M_m = M - 45;
                H_m = -1;
                System.out.println((24+H_m)+" "+(60 + M_m));
            }
            }
        else{
            System.out.println(H+" "+(M-45));
        }

    }
}
