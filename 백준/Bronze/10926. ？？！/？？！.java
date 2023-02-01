import java.util.Scanner;
public class Main {
    public static String change(String s){
        return s+"??!";

    }
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(change(s));


    }
}