import java.util.Scanner;
public class Main {
    public static int change(int year){
        return year-543;
    }

    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        int [] white= new int[6];
        int [] answer= {1,1,2,2,2,8};
        int [] feedback= new int[6];
        for(int i=0;i<answer.length;i++){
            white[i]=sc.nextInt();
        }
        for(int i=0;i<answer.length;i++){
            feedback[i]=answer[i]-white[i];
            System.out.print(feedback[i]+" ");
        }


    }
}