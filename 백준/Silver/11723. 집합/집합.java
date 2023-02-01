import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static   LinkedList<Integer> set;
    public static int index;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        set = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String s= st.nextToken();
            if(s.equals("add")){
                int num=Integer.parseInt(st.nextToken());
                add(num);
            }
            else if(s.equals("remove")){
                int num=Integer.parseInt(st.nextToken());
                remove(num);
            }
            else if(s.equals("check")){
                int num=Integer.parseInt(st.nextToken());
                check(num);
                if(check(num)){
                    bw.write(1+"\n");
                }
                else{
                    bw.write(0+"\n");
                }
            }
            else if(s.equals("toggle")){
                int num=Integer.parseInt(st.nextToken());
                toggle(num);
            }
            else if(s.equals("all")){
                all();
            }
            else if(s.equals("empty")){
                empty();
            }

        }
        bw.flush();

        bw.close();

    }
    public static boolean check(int num){
        boolean exist=false;
        for(int i=0;i<set.size();i++){
            if(set.get(i)==num){
                exist=true;
                index = i;

            }

        }
        return exist;

    }
    public static void add(int num){
        if(!check(num)){
            set.add(num);

        }
    }
    public static void remove(int num){
        if(check(num)){
            set.remove(index);
        }
    }
    public static void toggle(int num){
        if(check(num)){
            remove(num);
        }
        else{
            add(num);
        }
    }
    public static void empty(){
        set.clear();
    }
    public static void all(){
        empty();
        for(int i=1;i<=20;i++){
            set.add(i);
        }
    }
}