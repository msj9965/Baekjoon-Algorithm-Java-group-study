import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n,m;
        st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        long []T = new long[n];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            T[i]=Integer.parseInt(st.nextToken());
        }
        long max = Integer.MIN_VALUE;
        long value=0;
        for(int i=0; i+m-1<n;i++){
            for(int j=0;j<m;j++){
                value=value+T[i+j];
            }
            max=Math.max(max,value);
            value =0;
        }



        bw.write(String.valueOf(max));
        bw.close();


    }
}
