import module.Calculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static junit.framework.Assert.assertEquals;

public class CalculatorTests {
    @Test
    public void OnePlusOneEqualsTwo() {
        Calculator calculator = new Calculator(new Random());
        ArrayList numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        assertEquals(2, calculator.add(numbers));
    }

    @Test
    public void TwoPlusOneEqualsThree() {
        Calculator calculator = new Calculator(new Random());
        ArrayList numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        assertEquals(3, calculator.add(numbers));
    }

    @Test
    public void SixPlusOnePlusFourEqualsEleven() {
        Calculator calculator = new Calculator(new Random());
        ArrayList numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(1);
        numbers.add(4);
        assertEquals(11, calculator.add(numbers));
    }

    @Test
    public void OneTimesOneEqualsOne() {
        Calculator calculator = new Calculator(new Random());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int first = 1;
        numbers.add(first);
        int second = 1;
        numbers.add(second);

        int expected = 1;
        assertEquals(expected, calculator.multiply(numbers));
    }

    @Test
    public void ThreeTimesSevenEqualsTwentyOne() {
        Calculator calculator = new Calculator(new Random());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        assertEquals(21, calculator.multiply(numbers));
    }

    @Test
    public void FourTimesRandomNumberOfFourEqualsSixteen() {
        RandomStub random = new RandomStub();
        Calculator calculator = new Calculator(random);

        assertEquals(16, calculator.multiplyByRandom(4));
    }
}
