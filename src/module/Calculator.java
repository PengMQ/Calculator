package module;

import java.util.ArrayList;
import java.util.Random;

public class Calculator {

    private Random random;

    public Calculator(Random random) {
        this.random = random;
    }

    public int add(ArrayList<Integer> numbers) {
        int result=0;
        for(int i : numbers) {
            result += i;
        }
        return result;
//        return 11;
    }

    public int multiply(ArrayList<Integer> numbers) {
        int result = 1;
        for(int i : numbers)
        {
            result *= i;
        }
        return result;
    }

    public int multiplyByRandom(int i) {
        return i * random.nextInt();
    }
}
