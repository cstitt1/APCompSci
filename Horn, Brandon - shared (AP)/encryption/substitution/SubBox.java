package substitution;

import java.util.ArrayList;
import java.util.Collections;

public class SubBox
{
    private final String alphabet;
    
    public SubBox()
    {
        ArrayList<String> letters = new ArrayList<String>();
        for(char letter = 'A'; letter <= 'Z'; letter++)
            letters.add("" + letter);
        Collections.shuffle(letters);
        String alpha = "";
        for(String letter : letters)
            alpha += letter;
        this.alphabet = alpha;
    }
    
    public SubBox(String alphabet)
    {
        this.alphabet = alphabet;
    }
    
    public String alphabet()
    {
        return this.alphabet;
    }
    
    public String encrypt(String plainText)
    {
        String cipherText = "";
        for(int i = 0; i < plainText.length(); i++)
        {
            char c = plainText.charAt(i);
            if('A' <= c && c <= 'Z')
                cipherText += alphabet.charAt(c - 'A');
            else
                cipherText += c;
        }
        return cipherText;
    }
    
    public String decrypt(String cipherText)
    {
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++)
        {
            char c = cipherText.charAt(i);
            if('A' <= c && c <= 'Z')
                plainText += (char) (alphabet.indexOf("" + c) + 'A');
            else
                plainText += c;
        }
        return plainText;
    }
}