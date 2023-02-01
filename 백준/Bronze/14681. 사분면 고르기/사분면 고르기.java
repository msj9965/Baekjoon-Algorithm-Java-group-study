import java.util.Scanner;
public class Main {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if(x>0&&y>0){
            int where;

            where=1;
            System.out.println(where);

        }
        else if(x>0&&y<0){
            int where;

            where=4;
            System.out.println(where);

        }
        else if(x<0&&y>0){
            int where;

            where=2;
            System.out.println(where);

        }
        else if(x<0&&y<0){
            int where;

            where=3;
            System.out.println(where);

        }

    }
}