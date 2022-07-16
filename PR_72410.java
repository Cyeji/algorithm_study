public class PR_72410 {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase() //1
                .replaceAll("[^-_.0-9a-z]","") //2
                .replaceAll("[.]{2,}",".") //3
                .replaceAll("^[.]|[.]$", ""); //4
        // 5
        if(answer.equals("")){
            answer += "a";
        }
        // 6
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }
        // 7
        if(answer.length()<=2){
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        PR_72410 p = new PR_72410();
        System.out.println(p.solution("abcdefghijklmn.p"));
    }
}
