public class PR_81301 {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] aplaphets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i< aplaphets.length; i++){
            s = s.replaceAll(aplaphets[i], numbers[i]);
        }

        return Integer.valueOf(s);
    }

    public static void main(String[] args){
        PR_81301 p = new PR_81301();
        System.out.println(p.solution("one4seveneight"));
    }
}
