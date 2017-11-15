public class Calculator {
    public static int evaluate(String expression) {
            int result = 0;
            String []byPluses = expression.split("\\+");
            for (String multiplication : byPluses) {
                String []byMultiplication = multiplication.split("\\*");
                int multiplicationResult = 1;
                for (String operand : byMultiplication) {
                    multiplicationResult *= Integer.parseInt(operand);
                }
                result += multiplicationResult;
            }
            return result;
        }
    }

