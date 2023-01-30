import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[]arr;
    public static boolean[] value;
    public static int n,m;

    public static StringBuilder sb= new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[n];
        value=new boolean[n];
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
                arr[d]=i+1;
                dfs(i+1,d+1);
                value[i]=false;
            }
        }
    }




}




