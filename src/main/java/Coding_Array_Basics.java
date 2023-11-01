import java.util.Arrays;

public class Coding_Array_Basics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
        int[] arr3 = new int[10];
        int[] arr4 = new int[20];
        int a = 0;
        int bigNum = arr[0];

        for (int count : arr) {
            System.out.println(count);
        }
        for (int count : arr){
            a+=count;
        }
        System.out.println(a);

        for (int count : arr) {
            if (count>bigNum) {
                bigNum = bigNum-bigNum;
                bigNum = count+bigNum;
            }
        }
        System.out.println(bigNum);

        System.out.println("");

        for (int i = 0; i< arr3.length; i++) {
            arr3[i] = arr2[i]+arr[i];
            System.out.println(arr3[i]);
        }

        System.out.println("");

        for (int i= 0; i< arr4.length; i++) {
            if (arr.length > i) {
                arr4[i] = arr4[i] + arr[i];
            } else if ((arr.length+ arr2.length) > i) {
                arr4[i] = arr4[i] + arr2[i-(arr.length)];
            }
            System.out.println(arr4[i]);
        }
    }
}
