package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        SumOfSquares sumOfSquares = new SumOfSquares();
        System.out.println(sumOfSquares.getMinSquares(6));
        System.out.println(sumOfSquares.getMinSquares(15));
        System.out.println(sumOfSquares.getMinSquares(16));
        System.out.println(sumOfSquares.getMinSquares(17));
        System.out.println(sumOfSquares.getMinSquares(18));
        System.out.println(sumOfSquares.getMinSquares(19));

    }
}
