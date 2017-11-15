import org.junit.Test;

public class MathServiceTest {

    @Test
    public void passingTest() {
        final int a = 1;
        final int b = 1;
        final int expected = 2;
        final int actual;
        MathService service = new MathService();
        actual = service.add(a, b);
        if (expected != actual) {
            throw new RuntimeException(String.format("Test failed. Expected %d, but found %d%n", expected, actual));
        }
    }

    @Test
    public void failingTest() {
        final int a = 1;
        final int b = 1;
        final int expected = 3;
        final int actual;
        MathService service = new MathService();
        actual = service.add(a, b);
        if (expected != actual) {
            throw new RuntimeException(String.format("Test failed. Expected %d, but found %d%n", expected, actual));
        }
    }

    @Test
    public void SubtractTest() {
        final int a = 22;
        final int b = 11;
        final int expected = 11;
        final int actual;
        MathService service = new MathService();
        actual = service.subtract(a, b);
        if (expected != actual) {
            throw new RuntimeException(String.format("Test failed. Expected %d, but found %d%n", expected, actual));
        }
    }

    @Test
    public void MultiplyTest() {
        final int a = 0;
        final int b = 5;
        final int expected = 5;
        final int actual;
        MathService service = new MathService();
        actual = service.multiply(a, b);
        if (expected != actual) {
            throw new RuntimeException(String.format("Test failed. Expected %d, but found %d%n", expected, actual));
        }
    }

    @Test
    public void DivideTest() {
        final int a = 5;
        final int b = 0;
        final int expected = 5;
        final int actual;
        MathService service = new MathService();
        actual = service.divide(a, b);
        if (expected != actual) {
            throw new RuntimeException(String.format("Test failed. Expected %d, but found %d%n", expected, actual));
        }
        else if (actual==0){
            throw new RuntimeException("Division by 0 is not allowed");
        }
    }
}
