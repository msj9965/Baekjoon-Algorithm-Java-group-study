import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static char[][]board;
    public static int N;
    public static int M;
    public static void main(String []ar ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                board[i][j]=s.charAt(j);
            }
        }
        int min=chess(0,0);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int value = chess(i,j);
                if(value<min){
                    min=value;
                }
            }
        }
        bw.write(String.valueOf(min));
        bw.close();
    }
    public static int chess(int h,int w){
        int count =0;
        if(N-h>=8&&M-w>=8){
            if(board[h][w]=='B'){
                char[]line1={'B','W','B','W','B','W','B','W'};
                char[]line2={'W','B','W','B','W','B','W','B'};
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(i%2==0){
                            if(board[h+i][w+j]!=line1[j]){
                                count++;
                            }
                        }
                        else if(i%2!=0){
                            if(board[h+i][w+j]!=line2[j]){
                                count++;
                            }
                        }
                    }
                }
                count=Math.min(count,64-count);

                return count;

            }
            else if(board[h][w]=='W'){
                char[]line1={'W','B','W','B','W','B','W','B'};
                char[]line2={'B','W','B','W','B','W','B','W'};
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(i%2==0){
                            if(board[h+i][w+j]!=line1[j]){
                                count++;
                            }
                        }
                        else if(i%2!=0){
                            if(board[h+i][w+j]!=line2[j]){
                                count++;
                            }
                        }
                    }
                }
                count=Math.min(count,64-count);
                return count;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        else{
            return Integer.MAX_VALUE;
        }

    }
}
