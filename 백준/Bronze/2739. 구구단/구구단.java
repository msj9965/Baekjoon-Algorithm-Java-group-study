import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(su+" * "+i+" = "+i*su);
        }
    }
}
