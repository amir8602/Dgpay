package first;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String str = new String("akram badiri");
        char [] stringToChar = str.toCharArray();

        Integer count = 1;
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Integer> countOfChars = new ArrayList<Integer>();

        for (int i = 0; i <stringToChar.length-1 ; i++) {
            if(stringToChar[i] == ' '){
                continue;
            }
            chars.add(stringToChar[i]);
            for (int j = i+1; j <stringToChar.length ; j++) {
                if(stringToChar[i]==stringToChar[j]){
                    count++;
                    stringToChar[j]=' ';
                }
            }
            countOfChars.add(count);
            count=1;

        }
        System.out.println(countOfChars);
    }
}
