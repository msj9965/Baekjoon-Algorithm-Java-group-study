import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][]arr;
    public static boolean[] value;
    public static int N,line;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        for(int i =1;i<=line;i++){
            st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            arr[num1][num2]=1;
            arr[num2][num1]=1;

        }
        value = new boolean[N+1];

        bw.write(String.valueOf(bfs()));
        bw.close();


    }
    static int bfs(){
        int count = 0;
        Queue<Integer> q= new LinkedList<>();
        q.offer(1);
        value[1]=true;
        while(!q.isEmpty()){
            int num= q.poll();
            for(int i=1;i<=N;i++){
                if(arr[num][i]==1&&value[i]==false){
                    q.offer(i);
                    value[i]=true;
                    count++;
                }
            }
        }
        return count;
    }
}