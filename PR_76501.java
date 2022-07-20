import java.util.stream.IntStream;

public class PR_76501 {
    public int solution(int[] absolutes, boolean[] signs) {

        return IntStream.range(0,signs.length).map(a->{
            return signs[a] ? absolutes[a] : -absolutes[a];
        }).sum();
    }
    /*
    * 음양 더하기
    * 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
    * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
    * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
    * */
    public static void main(String[] args){
        PR_76501 p = new PR_76501();
        System.out.println(p.solution(new int[]{4,7,12},new boolean[]{true,false,true}));
    }
}
