import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int []A;
    public  static void main(String[]ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A= new int[n];
        for(int i =0 ; i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int num;
        int count=0;
        while(end<n){
            num=sum(start,end);
            if(num<m){
                end++;
            }
            else if(num>m){
                start++;
            }
            else if(num==m){
                start++;
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();



    }
    public static int sum(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+A[i];
        }
        return sum;
    }
}
