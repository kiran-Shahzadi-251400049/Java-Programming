public class LegalSizePaperDimensions {
    public static void main(String[] args) {

        // Constant for centimeters per inch
        final double CM_PER_INCH = 2.54;

        // Constants for legal-size paper dimensions (in inches)
        final double WIDTH_IN_INCHES = 8.5;
        final double LENGTH_IN_INCHES = 14.0;

        // Convert to centimeters
        double widthInCm = WIDTH_IN_INCHES * CM_PER_INCH;
        double lengthInCm = LENGTH_IN_INCHES * CM_PER_INCH;

        // Calculate perimeter (2 × (width + length))
        double perimeter = 2 * (widthInCm + lengthInCm);

        // Calculate diagonal 
        double diagonal = Math.sqrt((widthInCm * widthInCm) + (lengthInCm * lengthInCm));

        // Display results
        System.out.println("Legal-Size Paper Dimensions (in centimeters):");
        System.out.println("Width: " + widthInCm + " cm");
        System.out.println("Length: " + lengthInCm + " cm");
        System.out.println("Perimeter: " + perimeter + " cm");
        System.out.println("Diagonal: " + diagonal + " cm");
    }//main
}//class
