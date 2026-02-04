public class MakeArrayEqual{
    public static void main(String[] args) {
        int[] Array = {2,4,1,3};
        int n = Array.length;

        int max = Array[0];
        for (int i = 1; i < n; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time = time + (max - Array[i]);
        }
        System.out.println(time);
    }
}

       //to minimize time make all elements equal to the maximum element of the array
       //step1 find max element in array
        //step2 for every element calculate how much it needs to be increased to reach the maximum
        //step 3 sum all those differences

