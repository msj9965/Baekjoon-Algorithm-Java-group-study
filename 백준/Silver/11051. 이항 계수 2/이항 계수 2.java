import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]ar)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int [][]arr = new int[n+1][k+1];
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=Math.min(i,k);j++){
                if(i==0 || j==i||j==0){
                    arr[i][j]=1;
                }
                else {
                    arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%10007;
                }
            }
        }
        bw.write(String.valueOf(arr[n][k]%10007));
        bw.close();


    }
}
