import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PR_86051 {
    public int solution(int[] numbers) {
        List<Integer> numberList = IntStream.of(numbers).boxed().collect(Collectors.toList());
        return IntStream.rangeClosed(0,9).map(value -> {
            return !numberList.contains(value) ? value : 0;
        }).sum();
    }
    /*
    * 없는 숫자 더하기
    * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
    * */
    public static void main(String[] args){
        PR_86051 p = new PR_86051();
        System.out.println(p.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
