import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T= Integer.parseInt(br.readLine());
        for(int i=0; i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int []X= new int[N];
            int [][]sum = new int[N][N];
            int max = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<N;j++){
                X[j] = Integer.parseInt(st.nextToken());
                sum[j][j]=X[j];
                max= Math.max(max,sum[j][j]);
            }
            for(int j= 0 ; j<N-1;j++){
                for(int k=j+1; k<N;k++){
                    sum[j][k]= sum[j][k-1]+sum[k][k];
                    max = Math.max(max, sum[j][k]);

                }
            }
            sb.append(max).append("\n");



        }
        bw.write(String.valueOf(sb));
        bw.close();



    }


}
