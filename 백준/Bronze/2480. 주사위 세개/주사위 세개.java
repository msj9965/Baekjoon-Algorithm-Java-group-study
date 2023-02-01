import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        int dice[]= new int[3];
        for(int i=0;i<3;i++){
            dice[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i!=j){
                    if(dice[i]==dice[j]){
                        count++;
                    }
                }

                }

        }
        switch(count/2){
            case 0 : int max = 0;
            int max_num=0;
            int num=0;
            while(true) {
                if (num > 2) {
                break;
                }

                else{
                    if (dice[num] > max) {
                        max_num = num;
                        max = dice[num];
                    }
                        num++;

                    }

                }



            System.out.println(max*100);
            break;
            case 1 : int same = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i!=j){
                        if(dice[i]==dice[j]){
                            same=dice[i];

                        }

                    }

                }
            }
            System.out.println(1000+(same*100));
            break;
            case 3: System.out.println(10000+dice[1]*1000);
                    break;
            default: break;
        }
    }
}
