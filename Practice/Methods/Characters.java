import java.util.Scanner;
public class Characters{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a String: ");
		String word=input.nextLine();

		wordsInfo(word);
	}//main

	public static void wordsInfo(String word){
		System.out.println(word.length()+" Characters");
		int vowelCount=0;

		for(int i=0; i<word.length(); i++){
			if(word.charAt(i)=='A' || word.charAt(i)=='a' || word.charAt(i)=='E' || word.charAt(i)=='e' || word.charAt(i)=='I' || word.charAt(i)=='i' || word.charAt(i)=='O' || word.charAt(i)=='o' || word.charAt(i)=='U' || word.charAt(i)=='u'){
				vowelCount++;
			}
		}
		System.out.println(vowelCount+" Vowels");
	}//wordsInfo

}//CharactersLab1