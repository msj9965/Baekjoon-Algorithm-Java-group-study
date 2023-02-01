import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer>list=new LinkedList<>();
        st=new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));

        }
        Collections.sort(list);
        bw.write(String.valueOf(list.get(k-1)));
        bw.close();
    }
}