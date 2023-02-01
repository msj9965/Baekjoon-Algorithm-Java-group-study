import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int year = when(E,S,M);
        bw.write(String.valueOf(year));
        bw.flush();
        bw.close();
    }

    public static int when(int E, int S, int M) {
        int e = 1;
        int s = 1;
        int m = 1;
        int year = 1;
        while (true) {
            if (e == E && s == S && m == M) {
                break;

            } else {
                e++;
                s++;
                m++;
                if (e > 15) {
                    e = 1;
                }
                if (s > 28) {
                    s = 1;
                }
                if (m > 19) {
                    m=1;
                }
                year++;
            }
            }

        return year;
    }

}
