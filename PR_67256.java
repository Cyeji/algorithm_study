public class PR_67256 {
    private static final String L = "L";
    private static final String R = "R";
    int[][] keyPad = {{0,0},{0,1},{0,2}
            ,{1,0},{1,1},{1,2}
            ,{2,0},{2,1},{2,2}
            ,{3,0},{3,1},{3,2}};

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left = keyPad[9];
        int[] right = keyPad[11];
        for(int number : numbers){
            if(number == 0) number = 11;
            if(number == 1 || number == 4 || number == 7){
                answer += L;
                left = keyPad[number-1];
            }else if(number == 3 || number == 6 || number == 9){
                answer += R;
                right = keyPad[number-1];
            }else{
                int[] num = keyPad[number-1];
                int leftCompare = Math.abs(num[0]-left[0]) + Math.abs(num[1] - left[1]);
                int rightCompare = Math.abs(num[0]-right[0]) + Math.abs(num[1] - right[1]);
                if(leftCompare>rightCompare){
                    answer += R;
                    right = keyPad[number-1];
                }else if(leftCompare<rightCompare){
                    answer += L;
                    left = keyPad[number-1];
                }else{
                    if(hand.equals("right")){
                        answer += R;
                        right = keyPad[number-1];
                    }else{
                        answer += L;
                        left = keyPad[number-1];
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        PR_67256 p = new PR_67256();
        System.out.println(p.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"));
    }
}
