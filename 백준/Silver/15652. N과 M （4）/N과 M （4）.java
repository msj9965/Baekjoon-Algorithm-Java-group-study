import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[]arr;
    public static int n,m;

    public static StringBuilder sb= new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[n];
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
            if(true){

                arr[d]=i+1;
                dfs(i,d+1);
            }
        }
    }




}



