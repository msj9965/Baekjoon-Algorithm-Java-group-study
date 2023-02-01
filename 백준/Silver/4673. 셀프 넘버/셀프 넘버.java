import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {


    public static void main(String [] ar ) throws IOException {
        StringBuilder sb=new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    boolean []self = new boolean[10001];
        for(int i=1;i<10001;i++){
            int num= d(i);
            if(num<=10000){
                self[num]=true;
            }

        }
        for(int i=1;i<10001;i++){
            if(self[i]==false){
                sb.append(i).append("\n");

            }
        }
        bw.write(String.valueOf(sb));

        bw.close();


    }
    public static int d(int num){
        int n = num;
        int value=num;

        while(true){
            value= value+ n%10;
            n=n/10;
            if(n==0){
                return value;
            }

        }
    }
}
