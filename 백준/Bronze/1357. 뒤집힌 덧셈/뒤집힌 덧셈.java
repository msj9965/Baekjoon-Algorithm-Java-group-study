import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static StringBuilder sb1,sb2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb1= new StringBuilder(st.nextToken());
        sb2= new StringBuilder(st.nextToken());
        bw.write(String.valueOf(rev()));

        bw.close();

    }
    public static int rev(){
        sb1.reverse();
        sb2.reverse();
        int answer =Integer.parseInt(String.valueOf(sb1))+Integer.parseInt(String.valueOf(sb2));
        StringBuilder sb3 = new StringBuilder(String.valueOf(answer));
        sb3.reverse();
        int asw=Integer.parseInt(String.valueOf(sb3));
        return asw;

    }
}