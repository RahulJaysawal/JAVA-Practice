public class target {
    public static void main(String[] args) {
        int[] arr = {};

    }
    static int sum(int[] arr ,int target){
        for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]){
                    return i;
                }
        }
        return target;
    }
}
