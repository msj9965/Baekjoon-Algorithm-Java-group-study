import java.util.*;
public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer[]=new int[4];
        for(int i =0;i<3;i++){
            int c= (B/(int)(Math.pow(10,i)))%10;

            answer[i]=A*c;

        }
        answer[3]=A*B;
        for(int j=0;j<4;j++){
            System.out.println(answer[j]);
        }

    }
}
