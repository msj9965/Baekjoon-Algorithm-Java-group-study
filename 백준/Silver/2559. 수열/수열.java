import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] tem;
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        tem = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            tem[i]=Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = k-1;
        int max = Integer.MIN_VALUE;
        while (right<n){
            max = Math.max(sum(left,right),max);
            left++;
            right++;
        }
        bw.write(String.valueOf(max));
        bw.close();

    }
    public static int sum(int left, int right){
        int sum=0;
        for(int i = left;i<=right;i++){
            sum=sum+tem[i];
        }
        return sum;
    }
}
