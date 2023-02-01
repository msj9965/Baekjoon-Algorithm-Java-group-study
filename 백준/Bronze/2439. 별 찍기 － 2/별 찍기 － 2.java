import java.io.*;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        StringBuilder [] sb= new StringBuilder[count];

        for(int i=0;i<count;i++){
            sb[i]=new StringBuilder("");

            for(int j=0;j<count-i;j++){
                sb[i].append(" ");

            }
            for(int k=count;k>=count-i;k--){
                sb[i].append("*");
            }
            sb[i].deleteCharAt(0);
            bw.write(sb[i]+"\n");

        }



        bw.close();


    }
}

