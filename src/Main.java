import java.util.Arrays;

public class Main{

    public static void rearrange(int[] arr){

        int n = arr.length;

        int[] newArr = new int[n];
        int index = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                newArr[index++] = j;
            }
        }

        for (int i : arr) {
            if (i % 2 != 0) {
                newArr[index++] = i;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,4,2,57,89,0,0,45};

        rearrange(arr);
    }
}