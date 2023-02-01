import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n,m;
    public static boolean su;
    public static int[][] rel;
    public static boolean[]value;
    public static int calnum1,calnum2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n =Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        calnum1 = Integer.parseInt(st.nextToken());
        calnum2 = Integer.parseInt(st.nextToken());
        m=Integer.parseInt(br.readLine());
        rel=new int[n+1][n+1];
        value = new boolean[n+1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            rel[num1][num2]=1;
            rel[num2][num1]=1;

        }

        bw.write(String.valueOf(bfs(calnum1)));
        bw.close();

    }
    static int bfs(int start){
        int count =0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int ex = q.poll();
                value[ex] = true;
                if(ex==calnum2){
                    return count;
                }
                for (int j = 1; j <= n; j++) {
                    if (rel[ex][j] == 1) {
                        if (!value[j]) {
                            q.add(j);
                        }
                    }
                }
            }
            count++;
        }
       return count= -1;
    }


    }
