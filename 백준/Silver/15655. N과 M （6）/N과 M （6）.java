import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[]arr;
    public static boolean[]value;
    public static int n,m;
    public static int[]list;

    public static StringBuilder sb= new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[n];
        list=new int[n];
        value=new boolean[n];
        st= new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            list[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        dfs(0,0);


        bw.write(String.valueOf(sb));
        bw.close();

    }






    public static void dfs(int w,int d) {
        if(d==m){
            for(int i=0;i<m;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;

        }
        for(int i=w;i<n;i++){
            if(!value[i]){
                value[i]=true;
                arr[d]=list[i];
                dfs(i,d+1);
                value[i]=false;
            }
        }
    }




}




