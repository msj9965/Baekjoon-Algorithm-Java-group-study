import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[]arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());

        }
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        Arrays.sort(arr);
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
                if(arr[j]>=x){
                    break;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }

}