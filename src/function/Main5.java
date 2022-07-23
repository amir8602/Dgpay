package function;

public class Main5 {

    public static void main(String[] args) {
        int [] input = new int[]{16,17,6,2,5,3};
        int[] replace = replace(input);
        for (int i : replace) {
            System.out.println(i);
        }
    }

    public static int [] replace(int[] input){
        int [] replaceArray = new int[input.length];
        int max = 0;
        for (int i = 0; i <input.length-1; i++) {
            max = input[i+1];
            for (int j =i+1; j <input.length ; j++) {
                if (max<input[j]){
                    max=input[j];
                }
            }
            replaceArray[i]=max;
        }
        replaceArray[replaceArray.length-1]=-1;
        return replaceArray;
    }
}
