
public class Main {

	public static void main(String[] args) {
		String message = "Weather is beautiful today.";
		System.out.println(message);
		
		System.out.println("Number of character: "+message.length());
		System.out.println("5. character: "+message.charAt(4));
		System.out.println(message.concat("Ohh yeaa"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0,5, characters, 0);
		System.out.println(message);
		System.out.println(message.indexOf('a'));
		
		//
		String newMessage = message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for (String word : message.split(" ")){
				System.out.println(word);
		}
		
		String newMessages = "          Today is beatuf";
		
		System.out.println(newMessages.toLowerCase());
		System.out.println(newMessages.toUpperCase());
		System.out.println(newMessages.trim());
	}
}
