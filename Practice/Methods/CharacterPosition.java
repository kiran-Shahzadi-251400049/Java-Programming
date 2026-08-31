import java.util.Scanner;
public class CharacterPosition
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String word = input.nextLine();

        int position;
        do{
        System.out.print("Enter the position: ");
        position = input.nextInt();
        if(position>word.length()){
            System.out.println(word+" is not "+position+" characters long");
            return;
        }
        }while(position<0);

        
        System.out.println("Character at position " + position +" is: "+ charAtPosition(word, position));

    }

    public static char charAtPosition(String word, int position)
    {
        int exactPosition = position-1;
        return word.charAt(exactPosition);
    }
}
