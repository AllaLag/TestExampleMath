import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CalculatorTest {
    private String expression;
    private int a, b, expected;
    private static Calculator service = new Calculator();

    public CalculatorTest(String expression, final int a, final int b, final int expected) {
        this.expression = expression;
        this.a = a;
        this.b = b;
        this.expected = expected;

    }

    @Test()
    public void testEvaluate() {
        Assert.assertEquals(expected,Calculator.evaluate(expression));
    }

    @Parameterized.Parameters(name = "expression = {1}")
    public static Collection<Object[]> inputs() {
        return Arrays.asList(new Object[][]{
                {"1+5",1,5,6},
                {"6-2",6,2,4},
                {"2*2",2,2,0},
                {"5/5",5,5,1}
        });
    }
}
