import java.io.*;

public class Main {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        for(int i=0;i<c;i++){

           int k = Integer.parseInt(br.readLine());
           int n = Integer.parseInt(br.readLine());
            arr = new int[k+1][n+1];
            bw.append(String.valueOf(howmany(k,n))).append("\n");

        }
        bw.flush();
        bw.close();



    }
    public static int howmany(int k, int n){
        if(k==0){
            return n;
        }
        else{
            int sum = 0;
            for(int i = 1;i<n+1;i++){
                sum= sum + howmany(k-1,i);
            }
            arr[k][n]=sum;
            return arr[k][n];
        }
    }
}