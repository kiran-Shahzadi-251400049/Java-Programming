public class thetaGamma {
    public static void main(String[] args) {

        double G = 6.67, m1 = 5, m2 = 8, r = 4;
        double g = 9.8, R = 6371000, h = 1000;
        double a = 6, b = 4, theta = 45, gamma = 30;

        double thetaRad = Math.toRadians(theta);
        double gammaRad = Math.toRadians(gamma);

        double Fg = (G * m1 * m2) / Math.pow(r, 2);
        System.out.println("Fg = " + Fg);

        double gh = g * (Math.pow(R, 2) / Math.pow(R + h, 2));
        System.out.println("gh = " + gh);

        double Y = (a + b) / Math.tan(thetaRad);
        System.out.println("Y = " + Y);

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gammaRad));
        System.out.println("c = " + c);

        double rValue = a * (1 / Math.tan(thetaRad));
        System.out.println("r = " + rValue);
    }
}
