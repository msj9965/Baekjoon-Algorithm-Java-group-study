import java.io.*;

public class Main {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for(int i=1;i<=count;i++){
            for(int j =1;j<=i;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();


    }
}
