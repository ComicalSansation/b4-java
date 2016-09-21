
public class Begin {

	public static void main(String[] args) {
		

		String alpha = "abcdefghijklmnopqrstuwxyz";
		
		int key = 2;
		
		String plaintext = "I love java";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		plaintext = plaintext.toLowerCase();
		
		for (int i = 0; i < plaintext .length(); i++){
		indexPlaintext = alpha.indexOf(plaintext.charAt(i));
		//System.out.println("alpha index for the first char of plaintext is: " + indexPlaintext);
		
		indexShifted = indexPlaintext + key;
		/*		 
		System.out.println("key: " + key);
		System.out.println("index of plaintext: " + indexPlaintext);
		System.out.println("index of shiftedtext: " + indexShifted);
		System.out.println(("shifted char is: " + alpha.charAt(indexShifted)));
		*/
		codedText = codedText + alpha.charAt(indexShifted);
		
		}
		
		System.out.println("Original: " + plaintext);
		System.out.println("key: " + key);
		System.out.println("Secret code msg: "  + codedText);

		
	}

}
