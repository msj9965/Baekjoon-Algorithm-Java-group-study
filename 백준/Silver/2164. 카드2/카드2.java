import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i =1;i<=n;i++){
            q.offer(i);
        }
        while(q.size()!=1){
            q.remove();
            q.offer(q.poll());

        }
        bw.write(String.valueOf(q.poll()));
        bw.close();
    }
}
