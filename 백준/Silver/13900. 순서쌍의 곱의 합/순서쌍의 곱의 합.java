import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        long []num= new long[N];
        st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N;i++){
            num[i]=Long.parseLong(st.nextToken());

        }
        long [] sum = new long[N];
        for (int i = 1; i < N; i++) {
            sum[i] += sum[i - 1] + num[i];
        }
        long answer =0;
        for (int i = 0; i < N - 1; i++) {
            answer += (sum[N - 1] - sum[i]) * num[i];
        }



        bw.write(String.valueOf(answer));
        bw.close();
    }
}
