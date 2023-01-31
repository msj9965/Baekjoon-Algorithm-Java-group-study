import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer>list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));

        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            bw.write(list.get(i)+"\n");
        }
        bw.close();


    }
}