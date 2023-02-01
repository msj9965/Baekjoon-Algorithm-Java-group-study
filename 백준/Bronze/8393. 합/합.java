import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int result=0;
        for(int i=1; i<num+1;i++){
            result=i+result;
        }
        System.out.println(result);

    }
}
