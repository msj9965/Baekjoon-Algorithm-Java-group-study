import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String size=br.readLine();
        StringTokenizer st1=new StringTokenizer(size);
        int N= Integer.parseInt(st1.nextToken());
        int M= Integer.parseInt(st1.nextToken());

        int [][] value = new int[N][M];
        for(int i=0;i<N;i++){

            st1= new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                value[i][j]=Integer.parseInt(st1.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        for(int w=0;w<K;w++){
            int i,j,x,y;

            st1= new StringTokenizer(br.readLine());
            i=Integer.parseInt(st1.nextToken());
            j=Integer.parseInt(st1.nextToken());
            x=Integer.parseInt(st1.nextToken());
            y=Integer.parseInt(st1.nextToken());
            int result=0;
            for(int a=i;a<=x;a++){
                for(int b= j;b<=y;b++){
                   result= result+value[a-1][b-1];

                }
            }
            bw.write(result+"\n");
        }


        bw.close();
    }

}
