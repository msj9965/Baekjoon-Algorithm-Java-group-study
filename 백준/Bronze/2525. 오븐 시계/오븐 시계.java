import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        int H= sc.nextInt();
        int M= sc.nextInt();
        int time = sc.nextInt();
        if(time+M>59){
            if((time+M)/60+H>23){
                H=((time+M)/60+H)%24;
            }
            else{
                H=(time+M)/60+H;
            }
            M=(time+M)%60;

        }
        else{
            M=M+time;

        }
        System.out.println(H+" "+M);
    }
}
