import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String ar[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int [][]G = new int[N][N];
        for(int i= 0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                G[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        Queue<Reach> reachQueue = new LinkedList<>();
        boolean visited[][] = new boolean[N][N];

        reachQueue.add(new Reach(0, 0));
        boolean canFinish = false;
        while (!reachQueue.isEmpty()) {
            Reach reachTemp = reachQueue.poll();
            if (visited[reachTemp.cols][reachTemp.rows]) {
                continue;
            }
            int jumpPower = G[reachTemp.cols][reachTemp.rows];
            if (jumpPower == -1) {
                canFinish = true;
                break;
            }

            visited[reachTemp.cols][reachTemp.rows] = true;
            if (reachTemp.cols + jumpPower < N) {
                reachQueue.add(new Reach(reachTemp.cols + jumpPower, reachTemp.rows));
            }

            if (reachTemp.rows + jumpPower < N) {
                reachQueue.add(new Reach(reachTemp.cols, reachTemp.rows + jumpPower));
            }
        }
        if(canFinish){
            bw.write("HaruHaru");
        }
        else{
            bw.write("Hing");
        }
        bw.close();

    }

}
class Reach {
    int cols;
    int rows;

    public Reach(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }
}

