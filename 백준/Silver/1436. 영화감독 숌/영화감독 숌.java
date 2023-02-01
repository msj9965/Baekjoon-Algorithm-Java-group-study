import java.io.*;

public class Main {
    public static void main(String[]ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count =0;
        int value=666;
        while(true){
        if(String.valueOf(value).contains("666")){
            count++;
            }
        if(count==N){
            break;
        }
        value++;
        }
        bw.write(String.valueOf(value));
        bw.close();
    }
}
