public class Coding_Test {

    public static int sum(int valueA,int valueB) {
        return valueA+valueB;
    }
    public static boolean isEven(int valueA) {
        if ((valueA%2)>0) {
            return false;
        } else {
            return true;
        }
    }
    public static int multiply(int valueA,int valueB) {
        return valueA*valueB;
    }
    public static String toUpper(String smallToBig) {
        return smallToBig.toUpperCase();
    }
    public static boolean isPositiv(int valueC) {
        return 0<valueC;
    }
    public static int[] linkArray(int[] arr1,int[] arr2) {
        int[] arr3 = new int[(arr1.length+ arr2.length)];
        for (int i= 0; i< arr3.length; i++) {
            if (arr1.length > i) {
                arr3[i] = arr3[i] + arr1[i];
            } else if ((arr1.length+ arr2.length) > i) {
                arr3[i] = arr3[i] + arr2[i-(arr1.length)];
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        int valueA = 2;
        int valueB = 5;
        int valueC = -5;
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {12,14,16,18};
        String smallToBig = "TestTest";


        int sum = sum(valueA,valueB);

        boolean even = isEven(valueA);

        int mult = multiply(valueA,valueB);

        String allBig = toUpper(smallToBig);

        boolean PositivNum = isPositiv(valueC);

        int[] arr3 = coupleArray(arr1,arr2);
    }
}
