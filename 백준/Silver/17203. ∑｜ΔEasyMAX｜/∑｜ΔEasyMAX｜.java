import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb =new StringBuilder();
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int Q=Integer.parseInt(st.nextToken());
        int []a= new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            a[i]= Integer.parseInt(st.nextToken());
        }
        int i =0;
        int r=0;
        int value=0;
        int num=0;
        for(int j=0; j<Q;j++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
           if(r-1<i) {
               sb.append(0).append("\n");
           }else {

               for (int k = i-1; k < r-1; k++) {
                  num=a[k+1]-a[k];
                  value = value + change(num);



               }
               sb.append(value).append("\n");
               value =0;
           }
           }
        bw.write(String.valueOf(sb));
        bw.close();

        }
        public static int change(int num){


        if(num<0){
            num=num*(-1);
            return num;

        }
        else {
            return num;
        }

    }
}

