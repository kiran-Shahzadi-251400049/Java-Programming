public class solvingExpressions {
    public static void main(String[] args) {

        double a = 5, b = 3, c = 2, d = 4;
        double r = 6;
        double G = 6.67, m1 = 10, m2 = 12;

        c = Math.sqrt((a * b - c) + (b + a) - (a / b));
        System.out.println("Expression 1 (c): " + c);

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Expression 2 (volume): " + volume);

        d = a * (Math.sqrt((2 * b + c) / (d * c)) / (Math.sqrt((2 * b - c) / (d * c)) - 1));
        System.out.println("Expression 3 (d): " + d);

        double Fg = (G * m1 * m2) / (Math.pow(r, 2) + Math.abs(r - 1));
        System.out.println("Expression 4 (Fg): " + Fg);

        double x = Math.abs(a - b) + Math.max(c, d) - Math.min(a, c);
        System.out.println("Expression 5 (x): " + x);
    }
}
