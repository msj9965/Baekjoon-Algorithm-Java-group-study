import java.io.*;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> all = new LinkedList<>();
        int sum=0;
        for(int i=0;i<9;i++){
            int k=Integer.parseInt(br.readLine());
            all.add(k);
            sum=sum+ k;
        }
        Collections.sort(all);

        for(int i=0;i<8;i++){
            int n1 =all.get(i);

                for(int p=i+1;p<9;p++){
                    int n2= all.get(p);
                    if(sum-(n1+n2)==100){
                        all.remove(p);
                        all.remove(i);
                        break;
                    }

                }
                if(all.size()==7){
                    break;
                }

        }
        for(int i=0;i<all.size();i++){
            bw.write(all.get(i)+"\n");
        }
        bw.close();
    }
}
