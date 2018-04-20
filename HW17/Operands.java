
import java.util.function.DoubleBinaryOperator;

public class Operands {
    private double operand1;
    private double operand2;

    public Operands(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double executBinaryOperation(String operationName, DoubleBinaryOperator operation) {
        double answer = operation.applyAsDouble(operand1, operand2);
        System.out.println("Executing " + operationName + " on " + operand1
                + " and " + operand2 + " resulted in " + answer);
        return answer;
    }
}