class Solution {
        Solution(){

        }
        public int solution(int a, int b, int n) {
            int c ;
            int answer = 0;

            while(true){
                if(n>=a){
                    n = n-a+b;
                    answer = answer+b;
                }
                else{
                    break;
                }

            }
            return answer;
        }
    }