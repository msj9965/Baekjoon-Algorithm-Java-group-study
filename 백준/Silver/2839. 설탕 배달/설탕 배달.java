import java.io.*;

public class Main {
    public static int n3,n5,want;
    public static void main(String[] arg)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        n3=n/3;
        n5=n/5;
        want=-1;

        bw.write(String.valueOf(cal(n)));
        bw.close();


    }
    public static int cal(int n){
        for(int i=n5;i>=0;i--){
            for(int j=0;j<=n3;j++){
                if(5*i+3*j==n){
                    want=i+j;
                    return want;
                }
            }
        }
        return want;
    }
}
