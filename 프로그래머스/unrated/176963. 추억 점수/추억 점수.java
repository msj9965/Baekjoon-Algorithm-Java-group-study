import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            Map<String,Integer> map = new HashMap<>();
            for(int i =0;i<name.length;i++){
                map.put(name[i], yearning[i]);
            }
            int index = 0;
            for(int i =0;i<photo.length;i++){
                int sum = 0;
                for(int k =0;k<photo[i].length;k++){
                    if(Arrays.asList(name).contains(photo[i][k])){
                        sum = sum+map.get(photo[i][k]);
                    }

                }
                answer[index] = sum;
                index++;
            }
            return answer;
        }
    }