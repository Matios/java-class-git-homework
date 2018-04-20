import java.util.function.DoubleBinaryOperator;

public class Main{

    public static void main(String[] args){


        DoubleBinaryOperator addition =( double a , double b)->{ return a+b;};
        DoubleBinaryOperator multiplication=(double a, double b)->{ return a*b;};

        Operands first = new Operands(12,12);
        first.executBinaryOperation("Addition",addition);
        first.executBinaryOperation("Multiplication",multiplication);


    }
}