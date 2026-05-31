public class Caesar{
public static String encryptedText(String text, int shift) {
    String result = ""; 

shift = shift % 26;

    for (int index = 0; index < text.length(); index++) {
        char letter = text.charAt(index);

       
        char shiftedLetter = (char) (letter + shift);

        
        if (Character.isUpperCase(letter) && shiftedLetter > 'Z') {
            shiftedLetter = (char) (shiftedLetter - 26); 
        }
        
        else if (Character.isLowerCase(letter) && shiftedLetter > 'z') {
            shiftedLetter = (char) (shiftedLetter - 26); 
        }

        
        result = result + shiftedLetter;
    }

    return result;
}







}
