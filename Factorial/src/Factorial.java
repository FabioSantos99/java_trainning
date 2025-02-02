public class Factorial {

    public int x;
    public static int factor = 1;

    public Factorial(int x) {
        super();
        this.x = x;
    }

    public int factorial() {
        for (int i = x; i >=1; i--) {
            factor = factor * i;
        }

        return factor;
    }

}
