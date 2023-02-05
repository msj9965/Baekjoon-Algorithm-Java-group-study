import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Integer[]a=new Integer[n];
        Integer[]b=new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            a[i]= Integer.parseInt(st.nextToken());

        }
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            b[i]= Integer.parseInt(st.nextToken());

        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        int sum=0;
        for(int i =0;i<n;i++){
            sum=sum+a[i]*b[i];
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}