import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[]ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[]arr1 = new int[n1];
        int[]arr2 = new int[n2];
        st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i<n1;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i<n2;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        int[] result = new int[n1+n2];
        System.arraycopy(arr1, 0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        Arrays.sort(result);


        bw.write(Arrays.toString(result).replaceAll("\\[","").replaceAll("\\]","")
                .replaceAll("\\,",""));
        bw.close();
    }
}
