import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static  int[] card;
    public static int low, high, mid;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        card = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            card[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num;
        for(int i = 0;i<m;i++){
            high = n-1;
            low = 0;
            mid = (high+low)/2;
            num = Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(search(num))).append(" ");

        }
        bw.flush();
        bw.close();
    }
    public static int search(int num){
        while (low<=high){
            mid = (high+low)/2;
            if(card[mid]==num){
                return 1;
            }
            else if(num < card[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;

    }
}