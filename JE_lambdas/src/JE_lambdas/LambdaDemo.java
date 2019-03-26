package JE_lambdas;

public class LambdaDemo {
    private static int resPow = 1;
    private static int resSum = 0;
    private static int resDiv = 0;
    private static int resSub = 0;

    public static void main(String[] args) {

        Calculate operationSum, operationPow, operationDiv, operationSub;
        operationSum = (x, y) -> x + y;
        operationPow = (x, y) -> x * y;
        operationDiv = (x, y) -> x / y;
        operationSub = (x, y) -> x - y;

        resSum = operationSum.calculate(10, 20);
        resPow = operationPow.calculate(11, 11);
        resDiv = operationDiv.calculate(1332, 2);
        resSub = operationSub.calculate(29223, 3233);
        System.out.println("sum is " + resSum);
        System.out.println("pow is " + resPow);
        System.out.println("divine is " + resDiv + " number of Satan");
        System.out.println("substraction is " + resSub );


    }

    interface Calculate {
        int calculate(int x, int y);
    }
}
