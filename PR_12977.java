public class PR_12977 {
    public int solution(int[] nums) {
        int answer = -1;

        return answer;
    }
    /*
    * 소수 만들기
    * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
    * 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
    * nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
    * */
    public static void main(String[] args){
        PR_12977 p = new PR_12977();
        System.out.println(p.solution(new int[]{1,2,3,4}));
    }
}
