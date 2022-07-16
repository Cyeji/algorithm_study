public class PR_81301_2 {
    public int solution(String s) {
        String answer = "";
        String findNumber = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                findNumber += s.charAt(i);
                int getNumber = findCount(findNumber);
                if(getNumber != -1){
                    answer += String.valueOf(getNumber);
                    findNumber = "";
                }
            }else{
                answer += s.charAt(i);
            }
        }
        return Integer.valueOf(answer);
    }

    public int findCount(String s){
        switch (s){
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            case "zero": return 0;
            default:
                return -1;
        }

    }

    public static void main(String[] args){
        PR_81301_2 p = new PR_81301_2();
        System.out.println(p.solution("one4seveneight"));
    }
}
