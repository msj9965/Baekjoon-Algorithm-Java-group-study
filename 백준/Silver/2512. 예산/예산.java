import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[]city;
    public static int n,m,total;

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        city = new int[n];
        st = new StringTokenizer(br.readLine());
        total=0;

        for(int i = 0;i<n;i++){
            city[i]=Integer.parseInt(st.nextToken());
            total=city[i]+total;

        }
        m = Integer.parseInt(br.readLine());
        Arrays.sort(city);
        bw.write(String.valueOf(bin_search()));
        bw.close();




    }
    public static int bin_search(){
        if(total<=m){
            return city[n-1];
        }
        int start = 0;
        int end = m;
        int mid;
        int total_c;
        while (start <= end) {
            total_c=0;
            mid = (start+end)/2;
            for(int i =0;i<n;i++){
                if(mid<city[i]){
                    total_c=total_c+mid;
                }
                else {
                    total_c= total_c+city[i];
                }

            }
            if(total_c<m){
                start=mid+1;
            }
            else if (total_c>m){
                end = mid-1;
            }
            else{
                return mid;
            }


        }
        return end;
    }
}