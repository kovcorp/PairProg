package calculator;

public class CalculatorRunner {

    public static void main(String [] args)
    {
        System.out.println("--==[<=-=> CALCULATOR RUNNER <=-=>]==-");
        Calculator calc = new Calculator();
        System.out.println("calc.divideNumbers(15,3) " + calc.divideNumbers(15,3));
        System.out.println("calc.addTwoNumbers(15,3) " + calc.addTwoNumbers(15,3));
        System.out.println("calc.multipleNumbers(15,3) " + calc.multipleNumbers(15,3));
        System.out.println("calc.multipleNumbers(15,3) " + calc.multipleNumbers(15,3));
    }
}
