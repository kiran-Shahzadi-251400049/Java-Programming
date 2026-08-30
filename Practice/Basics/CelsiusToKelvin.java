public class CelsiusToKelvin {

    public static void main(String[] args) {

        System.out.println("Celsius\t|\tFahrenheit");
        System.out.println("---------------------------");

        int celsius = 0;

        // WHILE LOOP: from 0 to 100
        while (celsius <= 100) {

            int fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(celsius + "\t|\t" + fahrenheit);

            celsius += 10;
        }
    }//main
}//class
