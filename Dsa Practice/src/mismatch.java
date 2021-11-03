import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,4};
        // int[] arr = {1,1};
        int[] arr = {2,2};
        match(arr);
        System.out.println(Arrays.toString(match(arr)));

    }
    static int[] match(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return new int[] {j , j+1};
                }
            }
        }
        return arr;
    }
}
