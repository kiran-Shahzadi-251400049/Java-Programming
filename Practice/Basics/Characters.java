public class Characters {

    public static void main(String[] args) {

        // a) Output all uppercase letters
        System.out.println("a) All Uppercase Letters:");
        char ch = 'A';
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }

        // b) Output all lowercase letters
        System.out.println("\n\nb) All Lowercase Letters:");
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }

        // c) Output all uppercase letters between J and X
        System.out.println("\n\nc) Uppercase Letters from J to X:");
        ch = 'J';
        while (ch <= 'X') {
            System.out.print(ch + " ");
            ch++;
        }

        // d) Output all lowercase letters starting from a and skipping three letters
        System.out.println("\n\nd) Lowercase letters starting from a, skipping three letters:");
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch += 4;   // skip three letters
        }

        // e) All uppercase letters from W to L by decrementing
        System.out.println("\n\ne) Uppercase Letters from W to L (Decrementing):");
        ch = 'W';
        while (ch >= 'L') {
            System.out.print(ch + " ");
            ch--;
        }
    }//main
}//class
