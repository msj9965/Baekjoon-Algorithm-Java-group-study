import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static  int[] card;
    public static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        card = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            card[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num;
        for(int i =0;i<m;i++){
            num=Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(upper_count(num)-lower_count(num))).append(" ");
        }
        bw.flush();
        bw.close();
    }
    public static int upper_count(int num){
        int high = n;
        int low = 0;
        int mid;
        while(low<high){
            mid = (high+low)/2;
            if(card[mid]>num){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;


    }
    public static int lower_count(int num) {
        int high =n;
        int low = 0;
        int mid;
        while(low<high){
            mid = (high + low )/2;
            if(card[mid]>=num){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;



    }

    }