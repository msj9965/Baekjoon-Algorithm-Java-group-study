import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static class person{
        int h,w;
        public person(){

        }
        public person(int h, int w){
            this.h=h;
            this.w=w;

        }
    }
    public static void main(String [] ar)throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N =Integer.parseInt(br.readLine());
        ArrayList<person>list = new ArrayList<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int n1 =Integer.parseInt(st.nextToken());
            int n2 =Integer.parseInt(st.nextToken());
            list.add(new person(n1,n2));

        }
        for(int i=0;i<N;i++){
            int count =0;
            for(int j=0;j<N;j++){
                if(list.get(i).h<list.get(j).h&&list.get(i).w<list.get(j).w){
                count++;

                }
            }
            if(count==0){
                sb.append(1+" ");
            }
            else{
                sb.append(count+1+" ");
            }
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
}
