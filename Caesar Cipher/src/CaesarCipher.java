import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write the text to encrypt it: ");		
		String text = input.nextLine();
		
		System.out.println("Write the key: ");
		int key = input.nextInt();
		
		System.out.println(Encrypt(text, key));
	}
	
	
	public static String Encrypt(String text, int shift)
	{
		String encryptedText="";
		int length = text.length();
		
		if(shift > 26)
			shift = shift % 26;
		
		else if(shift < 0)
			shift = (shift % 26) + 26;
		
		for (int i = 0; i < length; i++)
		{
			char charr = text.charAt(i);
			if (Character.isLetter(charr))
			{
				if(Character.isUpperCase(charr)) 
				{
					char ch = (char)(charr + shift);
					if(ch > 'Z')
						encryptedText += (char)(charr - (26 - shift));
					
					else
						encryptedText += ch;
				}
				
				else if (Character.isLowerCase(charr))
				{
					char ch = (char)(charr + shift);
					if(ch > 'z')
						encryptedText += (char)(charr - (26 - shift));
					
					else
						encryptedText += ch;
				}
				
			}
			
			else 
				encryptedText += charr;
			
		}
		
		return encryptedText;
	}


}