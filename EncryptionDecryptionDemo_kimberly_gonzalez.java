package encryption_kimberly_gonzalez;

import java.io.IOException;

/**
 * This Demo class demonstrates the Encryption class and Decryption class by 
 * passing the names of the files required through their respected objects.
 * 
 * @author kgonz038
 */

public class EncryptionDecryptionDemo_kimberly_gonzalez 
{
    public static void main(String[] args)throws IOException
    {  
      //The names of the files, the original message, encryption and decryption
      String existingFN ="MessageFile.txt";
      String encryptFN = "EncryptionFile.txt";
      String decryptFN = "DecryptionFile.txt";
      
      //Alerts to the user ways to change the pre-exisitng message in the file
      System.out.println("If you wish to change the message to encrypt and "
              + "decrypt, go to the MessageFile text file and enter your "
              + "preferred message. \n ");
      
      //Creates a Encryption object
      Encryption_kimberly_gonzalez EncObj = new Encryption_kimberly_gonzalez();
      
      //Creates a Decrpytion object
      Decryption_kimberly_gonzalez DecObj = new Decryption_kimberly_gonzalez();
      
      //String name of the message and encrypted file to the encryptFile method
      EncObj.encryptFile(existingFN, encryptFN);

      //String name of the encrypted and decrpyted file to the decryptFile method
      DecObj.decryptFile(encryptFN, decryptFN); 
    }
}
