package exp3;
public class Main {
    public static void main(String[]args) {
        Calculator c = new Calculator();

        System.out.println("Addition:" + c.add(10,5));
        System.out.println("Substraction:" + c.substract(10,5));
        System.out.println("Multiplication:" + c.multiply(10,5));
        System.out.println("division:" + c.divide(10,5));
        try{
            System.out.println("division by zero:" + c.divide(10,0));
        } catch (ArithmeticException e){
            System.out.println("Division by zero: Exception");
        }
    }
}
    