import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        sums(arr);
        System.out.println(Arrays.toString(sums(arr)));

    }
    static int[] sums(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}
