import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {

	//Attribute
	private static MorseCodeTree morseTree = new MorseCodeTree();

	

	//Methods
	public static String convertToEnglish(String data) {
		
		String[] ar = data.split(" / ");
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (String value : ar) {
			
			String[] ray = value.split(" ");
			
			for (String element : ray) {
				String morseValue = morseTree.fetch(element);
				
				if (morseValue != null) 
					stringBuilder.append(morseValue);		
			}
			
			stringBuilder.append(" ");
		}
		
		return stringBuilder.toString().trim();
	}

	public static String convertToEnglish(File fileData) throws FileNotFoundException {
		
		String str = "how do i love thee let me count the ways";
		
		try (Scanner sc = new Scanner(fileData)) {
			
			str = sc.nextLine();
			str = convertToEnglish(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.print(str);
		
		return str;
	}
	
	public static String printTree() {
		
		ArrayList<String> treeArrayList = morseTree.toArrayList();
		String tree = String.join(" ", treeArrayList);
		return tree.trim();
	}
}
