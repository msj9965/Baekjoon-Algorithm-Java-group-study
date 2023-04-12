import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] month = new int[]{0,31, 28,31,30, 31,30,31, 31,30,31,30,31};
        String[]date = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int total_date = 0;
        if(m>1) {
            for (int i = 1; i < m; i++) {
                total_date = total_date + month[i];
            }
        }
        total_date= total_date+d-1;
        String answer=date[total_date%7];
        bw.write(answer);
        bw.close();

    }
}
