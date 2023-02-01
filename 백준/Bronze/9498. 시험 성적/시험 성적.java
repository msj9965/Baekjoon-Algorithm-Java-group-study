import java.util.Scanner;
public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String Grade;
        switch(score/10){
            case 10:
            case 9: Grade="A";
                    break;
            case 8: Grade="B";
                    break;
            case 7: Grade = "C";
                    break;
            case 6: Grade = "D";
                    break;
            default: Grade="F";
        }
        System.out.println(Grade);
    }
}
