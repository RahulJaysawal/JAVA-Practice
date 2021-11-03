import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
//      int[] arr = {5,25,75};
//        int[] arr = {0,0,3,4};
//        int[] arr = {2,7,11,15};
//        int[] arr = {1,2,3,4,4,9,56,90};
        int[] arr = {2,3,4};

        int target = 6;
//        twoSum(arr , target);
        System.out.println(Arrays.toString(twoSum(arr , target)));
    }
    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

              if (target == arr[j] + arr[i]) {
                  if (i<j){
                      return new int[]{i+1, j+1};
                  }
                  else{
                      return new int[]{j+1, i+1};

                  }
              }

            }
        }
        return arr;
    }
}