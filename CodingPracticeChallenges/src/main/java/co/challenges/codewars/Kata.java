package co.challenges.codewars;

//https://www.codewars.com/kata/evil-autocorrect-prank/train/java

public class Kata {

	public static String autocorrect(String input) {
		return input.replaceAll("(?i)\\b(you+|u)\\b", "your sister");
	}

	public static String autocorrectMine(String input) {

		String[] inputArray = input.toLowerCase().split(" ");
		String[] responseArray = input.split(" ");
		String response = "";

		for (int i = 0; i < inputArray.length; i++) {
			String word = inputArray[i];
			String responseWord = responseArray[i];
			if (word.equals("u") || word.contains("you") && word.matches("you[^a-t|v-z]*")) {
				System.out.println(word + "-> your sister");
				if (word.matches("you[^a-z]*"))
					responseWord = word.replace("you", "your sister");
				else
					responseWord = "your sister";

			}
			response += responseWord + " ";
		}
		return response.trim();
	}

}