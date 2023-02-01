import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][]reach;
    public static int w,h;
    public static boolean[][]value;
    public static class location{
        public int x,y;
        public location(){

        }
        public location(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0&&h==0){
                break;
            }
            ArrayList<location> where = new ArrayList<>();
            reach = new int[w][h];
            value = new boolean[w][h];
            for(int i=0;i<h;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++){
                    reach[j][i]= Integer.parseInt(st.nextToken());
                    where.add(new location(j,i));

                }
            }
            int count =0;
            for(int i=0;i<where.size();i++){
                if(reach[where.get(i).x][where.get(i).y]==1&&value[where.get(i).x][where.get(i).y]==false){
                    bfs(where.get(i));
                    count++;
                }

            }
            bw.write(count+"\n");



        }
        bw.close();

    }
    public static void bfs(location start){
        Queue<location> q = new LinkedList<>();
        q.offer(start);
        value[start.x][start.y]=true;
        while(!q.isEmpty()){
            location ex = q.poll();
            if(ex.x+1<w){
                if(reach[ex.x+1][ex.y]==1&&value[ex.x+1][ex.y]==false) {
                    q.offer(new location(ex.x + 1, ex.y));
                    value[ex.x+1][ex.y]=true;
                }

            }
            if(ex.y+1<h){
                if(reach[ex.x][ex.y+1]==1&&value[ex.x][ex.y+1]==false) {
                    q.offer(new location(ex.x , ex.y+1));
                    value[ex.x][ex.y+1]=true;
                }


            }
            if(ex.x+1<w&&ex.y+1<h){
                if(reach[ex.x+1][ex.y+1]==1&&value[ex.x+1][ex.y+1]==false) {
                    q.offer(new location(ex.x + 1, ex.y+1));
                    value[ex.x+1][ex.y+1]=true;
                }

            }
            if(ex.x-1>=0){
                if(reach[ex.x-1][ex.y]==1&&value[ex.x-1][ex.y]==false) {
                    q.offer(new location(ex.x - 1, ex.y));
                    value[ex.x-1][ex.y]=true;
                }

            }
            if(ex.y-1>=0){
                if(reach[ex.x][ex.y-1]==1&&value[ex.x][ex.y-1]==false) {
                    q.offer(new location(ex.x , ex.y-1));
                    value[ex.x][ex.y-1]=true;
                }


            }
            if(ex.x-1>=0&&ex.y-1>=0){
                if(reach[ex.x-1][ex.y-1]==1&&value[ex.x-1][ex.y-1]==false) {
                    q.offer(new location(ex.x - 1, ex.y-1));
                    value[ex.x-1][ex.y-1]=true;
                }

            }
            if(ex.x-1>=0&&ex.y+1<h){
                if(reach[ex.x-1][ex.y+1]==1&&value[ex.x-1][ex.y+1]==false) {
                    q.offer(new location(ex.x - 1, ex.y+1));
                    value[ex.x-1][ex.y+1]=true;
                }

            }
            if(ex.x+1<w&&ex.y-1>=0){
                if(reach[ex.x+1][ex.y-1]==1&&value[ex.x+1][ex.y-1]==false) {
                    q.offer(new location(ex.x + 1, ex.y-1));
                    value[ex.x+1][ex.y-1]=true;
                }

            }

        }

    }
}