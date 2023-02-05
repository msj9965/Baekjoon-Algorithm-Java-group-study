import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);
        int max =Integer.MIN_VALUE;
        int value=0;
        for(int i =0;i<n;i++){
            value=arr[i]*(n-i);
            max = Math.max(max,value);
        }
        bw.write(String.valueOf(max));
        bw.close();
    }
}