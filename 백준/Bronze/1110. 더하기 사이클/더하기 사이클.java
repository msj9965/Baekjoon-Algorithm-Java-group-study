import java.io.*;

public class Main {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num= Integer.parseInt(br.readLine());
        int copy=num;
        int cycle=0;
        do {
            cycle++;
            num=((num%10)*10)+(((num/10)+(num%10))%10);
        }while (num!=copy);
            bw.write(String.valueOf(cycle));
            bw.close();
            }
}
