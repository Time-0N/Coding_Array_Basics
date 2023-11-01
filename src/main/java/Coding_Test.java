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
    public static void main(String[] args) {
        int valueA = 2;
        int valueB = 5;
        int valueC = -5;
        String smallToBig = "TestTest";


        int sum = sum(valueA,valueB);

        boolean even = isEven(valueA);

        int mult = multiply(valueA,valueB);

        String allBig = toUpper(smallToBig);

        boolean PositivNum = isPositiv(valueC);
    }
}
