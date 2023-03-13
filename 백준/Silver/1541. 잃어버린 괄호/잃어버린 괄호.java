import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s = br.readLine();
        int exist=s.indexOf("-");
        int total = 0;
        if(exist!=-1) {
            String s1 = s.substring(0, exist);
            String s2 = s.substring(exist+1);
            st = new StringTokenizer(s1,"+|-");
            while(st.hasMoreTokens()){
                total = total + Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(s2, "+|-");
            while(st.hasMoreTokens()){
                total = total - Integer.parseInt(st.nextToken());
            }


        }
        else {
            st = new StringTokenizer(s, "+");
            while (st.hasMoreTokens()) {
                total = total+Integer.parseInt(st.nextToken());

            }
        }
        bw.write(String.valueOf(total));
        bw.close();

    }
}
