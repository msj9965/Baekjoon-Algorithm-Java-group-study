import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(cal(X)));
        bw.close();

    }
    public static int cal(int X){
        String num =Integer.toBinaryString(X);
        int count =0;
        for(int i=0;i<num.length();i++){
            if(((X>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
}