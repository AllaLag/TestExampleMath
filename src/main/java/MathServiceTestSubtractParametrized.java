import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MathServiceTestSubtractParametrized {
    private static final MathService service = new MathService();
    private int a, b, expected;

    public MathServiceTestSubtractParametrized(final int a, final int b, final int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(expected, service.subtract(a, b));
    }

    @Parameterized.Parameters(name = "a={0};b = {1}")
    public static Collection<Object[]> inputs() {
        return Arrays.asList(new Object[][]{
                {1, 1, 3},
                {1, 1, 0},
                {0, 5, -5}
        });
    }
}
