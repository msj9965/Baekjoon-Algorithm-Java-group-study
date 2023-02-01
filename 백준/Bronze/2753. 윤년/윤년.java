import java.util.Scanner;
public class Main {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        int yoon;
        if(year%4==0&&year%100!=0){
            yoon=1;
        }
        else if(year%400==0){
            yoon=1;
        }
        else {
            yoon=0;
        }
        System.out.println(yoon);
    }
}
