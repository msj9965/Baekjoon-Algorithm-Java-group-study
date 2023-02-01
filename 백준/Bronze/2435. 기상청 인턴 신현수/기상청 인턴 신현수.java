import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String ar[])throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N,K;
        st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        K= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] T= new int[N];
        int [][]sum = new int[N][N];
        for(int i =0;i<N;i++){
            T[i]= Integer.parseInt(st.nextToken());
            sum[i][i] = T[i];

        }
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++) {
                sum[i][j]=sum[i][j-1]+sum[j][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i+K<=N;i++){
            max= Math.max(max,sum[i][i+K-1]);

        }
        bw.write(String.valueOf(max));
        bw.close();


    }
}
