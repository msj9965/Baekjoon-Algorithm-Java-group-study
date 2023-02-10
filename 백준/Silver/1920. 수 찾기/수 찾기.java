import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int low, high, mid;
    public static int[]A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        A= new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());

        }
        int m = Integer.parseInt(br.readLine());
        int num;

        st= new StringTokenizer(br.readLine());
        Arrays.sort(A);
        for(int i = 0;i<m;i++){
            low = 0;
            high= n-1;
            mid = (high+low)/2;
            num=Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(bin_search(num))).append("\n");
        }
        bw.flush();
        bw.close();

    }
    public static int bin_search(int num){
        while(low <= high) {
            mid = (low + high) / 2;

            if(num == A[mid]) {
                return 1;
            } else if(num < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;

    }
}