import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String ar [] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n,m;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        char[][]X =new char[n+1][m+1];
        int count =0;
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0 ; j<m;j++){
                X[i][j]= s.charAt(j);

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0 ; j<m;j++){
                if(X[i][j]=='-'){
                    if(X[i][j+1]!=X[i][j]){
                        count++;
                    }

                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(X[j][i]=='|'){
                    if(X[j+1][i]!=X[j][i]){
                        count++;
                    }

                }
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
