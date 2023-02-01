import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String ar [])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            int n,m;
            st = new StringTokenizer(br.readLine());
            n =Integer.parseInt(st.nextToken());
            m= Integer.parseInt(st.nextToken());
            boolean [][] list = new boolean[n+1][n+1];
            for(int j=0;j<m;j++){
               st = new StringTokenizer(br.readLine());
               int a= Integer.parseInt(st.nextToken());
               int b= Integer.parseInt(st.nextToken());
               list[a][b] = true;
               list[b][a] = true;
            }
            bw.write(n-1+"\n");

        }
        bw.close();

    }
}
