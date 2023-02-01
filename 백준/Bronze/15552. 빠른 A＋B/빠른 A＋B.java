import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main  (String[]ar) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n= Integer.parseInt(br.readLine());
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            result[i]=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            bw.write(result[i]+"\n");

        }
        bw.close();




    }
}
