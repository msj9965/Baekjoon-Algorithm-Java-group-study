import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m ;
    static int [][]arr;
    static boolean[][]value;
    static int[]dx={0,0,1,-1};
    static int[]dy={1,-1,0,0};

    public static void main(String[]arg)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        value = new boolean[n][m];
        for(int i = 0 ; i < n;i++){
            String s = br.readLine();
            for(int j = 0 ; j < m;j++){
                arr[i][j] = s.charAt(j) - '0';

            }
        }
        bfs(0,0);
        bw.write(String.valueOf(arr[n-1][m-1]));
        bw.close();

    }
    public static void bfs(int x, int y){
        Queue<int[]>q = new LinkedList<>();
        q.offer(new int[]{x,y});
        value[x][y]= true;

        while(q.isEmpty()==false){
            int[]loc_arr=q.poll();

            for(int i = 0 ; i < 4 ; i++){
                int loc_x = loc_arr[0]+dx[i];
                int loc_y = loc_arr[1]+dy[i];

                if(loc_x<0 || loc_x>=n || loc_y<0 || loc_y>=m){
                    continue;
                }
                if(value[loc_x][loc_y] || arr[loc_x][loc_y]==0){
                    continue;
                }
                arr[loc_x][loc_y] = arr[loc_arr[0]][loc_arr[1]]+1;
                value[loc_x][loc_y] = true;
                q.offer(new int[]{loc_x,loc_y});
            }
        }
    }
}
