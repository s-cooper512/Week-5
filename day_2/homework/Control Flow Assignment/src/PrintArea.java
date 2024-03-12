public class PrintArea {

    public static void main(String[] args) {
        System.out.println(calcArea(12));
        System.out.println(calcArea(2, 4));
        System.out.println(calcArea(1.2224));
    }

    public static int calcArea (int input) {
        return (input * input);
    }

    public static int calcArea (int input1, int input2) {
        return (input1 * input2);
    }

    public static double calcArea (double input) {
        return(Math.pow((Math.PI * input), 2));
    }
}
