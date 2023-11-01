import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Coding_Test_Test {


    @Test
    public void isPositiv_when5_thenReturnTrue() {
        //GIVEN
        int valueC = 5;

        //WHEN
        boolean shouldBeTrue = Coding_Test.isPositiv(valueC);

        //THEN
        assertTrue(shouldBeTrue);
    }

    @Test
    public void isPositiv_whenMinus5_thenReturnFalse() {
        //GIVEN
        int valueC = -5;

        //WHEN
        boolean shouldBeFalse = Coding_Test.isPositiv(valueC);

        //THEN
        assertFalse(shouldBeFalse);
    }

    @Test
    public void toUpperTest_whenStringIsLowercase_thenReturnUppercase() {
        //GIVEN
        String smallToBig = "TestTest";

        //WHEN
        String actucal = Coding_Test.toUpper(smallToBig);

        //THEN
        assertEquals("TESTTEST", actucal);
    }

    @Test
    public void multiplyTest_when5times2_thenReturn10() {
        //GIVEN
        int valueA = 2;
        int valueB = 5;

        //WHEN
        int actual = Coding_Test.multiply(valueA,valueB);

        //THEN
        assertEquals(10, actual);

    }

    @Test
    public void isEvenTest_when1_thenReturnFalse() {
        //GIVEN
        int valueA = 1;

        //WHEN
        boolean shouldBeFalse = Coding_Test.isEven(valueA);

        //THEN
        assertFalse(shouldBeFalse);
    }

    @Test
    public void isEvenTest_when2_thenReturnTrue() {
        //GIVEN
        int valueA = 2;

        //WHEN
        boolean shouldBeTrue = Coding_Test.isEven(valueA);

        //THEN
        assertTrue(shouldBeTrue);
    }

    @Test
    public void sumTest_when5plus2_thenReturn7() {
        //GIVEN
        int valueA = 2;
        int valueB = 5;

        //WHEN
        int actucal = Coding_Test.sum(valueA, valueB);

        //THEN
        assertEquals(7, actucal);
    }
}
