import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String ar[])throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int [] x = new int[n];
        int [] sum = new int[n];
        st= new StringTokenizer(br.readLine());

        for(int i = 0;i<n;i++){
            x[i]=Integer.parseInt(st.nextToken());

        }
        sum[0]=x[0];
        for(int i=0;i<n-1;i++){
            sum[i+1]= sum[i]+x[i+1];
        }
        long value =0;
        for(int i=0;i<n-1;i++){
                value=value+x[i]*(sum[n-1]-sum[i]);

        }
        bw.write(String.valueOf(value));
        bw.close();
    }
}
