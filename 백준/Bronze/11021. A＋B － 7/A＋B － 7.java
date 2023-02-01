import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class Main {
    public static void main (String [] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
       StringBuilder[] sb = new StringBuilder[n];
        int result[]=new int[n];

        for(int i=0; i<n;i++){
            st= new StringTokenizer(br.readLine());
            result[i]= Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            sb[i]=new StringBuilder("");
            sb[i].append("Case #");
            sb[i].append(i+1);
            sb[i].append(": ");
            sb[i].append(result[i]);
            bw.write(sb[i]+"\n");
        }
        bw.close();
    }
}
