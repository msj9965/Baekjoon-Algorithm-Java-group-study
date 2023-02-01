import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int total=sc.nextInt();
        int kind= sc.nextInt();
        int price=0;
        int product[][]= new int[kind][2];
        for(int i=0;i<kind;i++){
            product[i][0]=sc.nextInt();
            product[i][1]=sc.nextInt();
        }
        for(int i=0;i<kind;i++){
            price= price + product[i][0]*product[i][1];
        }
        if(price==total){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
