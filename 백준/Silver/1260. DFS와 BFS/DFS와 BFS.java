
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int N, M, V;
    public static int [][]arr;
    public static boolean[] value;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        V= Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];
        value= new boolean[N+1];

        for(int i = 1;i<=M;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            arr[num1][num2] = 1;
            arr[num2][num1] = 1;

        }
        dfs(V);
        value= new boolean[N+1];
        sb.append("\n");
        bfs(V);
        bw.write(String.valueOf(sb));
        bw.close();


    }
    public static void dfs(int V){
        value[V]= true;

        sb.append(V).append(" ");

        for(int i = 1; i<=N; i++){
            if(arr[V][i]==1&&value[i]==false){
                dfs(i);
            }
        }

    }

    public static  void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.offer(V);
        value[V]=true;
        while(!q.isEmpty()){
            int num = q.poll();
            sb.append(num).append(" ");
            for(int i=1;i<=N;i++){
                if(arr[num][i]==1&&value[i]==false){
                    q.offer(i);
                    value[i]= true;
                }
            }
        }


    }

}