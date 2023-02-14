import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[]ar)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb= new StringBuilder();
        int n =Integer.parseInt(br.readLine());
        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            sb.append(arr[i]).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.close();

    }
}
