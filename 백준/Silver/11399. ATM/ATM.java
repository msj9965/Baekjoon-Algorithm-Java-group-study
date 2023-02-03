import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        LinkedList<Integer>list= new LinkedList<>();
        for(int i = 0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));

        }
        Collections.sort(list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            for(int j =0;j<=i;j++){
                sum=sum+list.get(j);
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}