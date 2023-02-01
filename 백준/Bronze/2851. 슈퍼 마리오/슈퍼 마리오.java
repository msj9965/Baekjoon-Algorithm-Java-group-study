import java.io.*;

public class Main {
    public static void main (String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m[]= new int[10];

        for(int i=0;i<10;i++){
            do{m[i]= Integer.parseInt(br.readLine());}
            while(!(m[i]>0&&m[i]<=100));

        }
        int score1=0;
        int score2=0;
        int result=0;
        for(int i=0;i<10;i++){
            score2=score1;
            score1=score1+m[i];
            if(score1>=100){
                if(score1-100>100-score2){
                    result=score2;
                }
                else if(score1-100<100-score2){
                    result=score1;
                }
                else if(score1-100==100-score2){
                    result=score1;
                }
                break;
            }
            if((i==9)&&(score1<100)){
                result=score1;
                break;

            }
        }
        bw.write(result+"");
        bw.close();

    }
}
