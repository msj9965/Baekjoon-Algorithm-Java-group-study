import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static class person implements Comparable<person> {
        public String name;
        public int day, month, year;
        public person(){

        }
        public person(String name,int day,int month, int year ){
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public int compareTo(person o) {
            if(o.year>=this.year){
                if(o.year==this.year){
                    if(o.month>=this.month){
                        if(o.month==this.month){
                            if(o.day>=this.day){
                                return 1;
                            }
                            else{
                                return 0;
                            }
                        }
                        else {
                            return 1;
                        }
                    }
                    else{
                        return 0;
                    }
                }
                else{
                    return 1;
                }
            }
            else {
                return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        LinkedList<person>list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            list.add(new person(name, day, month, year));


        }
        int max=0;
        int min=0;
        for(int i =0;i<list.size();i++){
            int num1=list.get(i).compareTo(list.get(max));
            if (num1 == 1) {
                max = i;

            }
            int num2 = list.get(i).compareTo(list.get(min));
            if(num2 == 0){
                min = i;
            }
        }
        bw.append(list.get(min).name).append("\n").append(list.get(max).name);
        bw.flush();
        bw.close();




    }

}