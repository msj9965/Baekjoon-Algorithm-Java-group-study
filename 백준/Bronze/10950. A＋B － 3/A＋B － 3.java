import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int num[][]=new int[index][2];
        int result[]= new int[index];
        for(int i=0;i<index;i++){
            for(int j=0;j<2;j++){
                num[i][j]= sc.nextInt();

            }
            result[i]=num[i][0]+num[i][1];


        }
        for(int i=0;i<index;i++){
            System.out.println(result[i]);
        }

    }
}
