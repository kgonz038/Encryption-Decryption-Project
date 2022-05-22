package encryption_kimberly_gonzalez;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This Decryption class will open the encryption file, read from it and then 
 * decrypts the the encrypted message. That message is then written into the 
 * decrypted file. The decryption file is then read from to the console.
 * 
 * @author kgonz038
 */
public class Decryption_kimberly_gonzalez 
{
    /**
     * This method will open and read from a encrypted file. It then opens and 
     * writes to the decrypted file after decrypting the message. The message is
     * then printed to the console.
     * 
     * @param encrypted The encrypted file
     * @param decrypted The decrypted file
     * @throws IOException 
     */
    public static void decryptFile(String encrypted, String decrypted) throws IOException
    {
        //Opens the encrpyted file and then reads from the file
        FileInputStream inStream = new FileInputStream(encrypted);
        DataInputStream inFile = new DataInputStream(inStream);
        
         //Opens the decrypted file and then writes to the file
        FileOutputStream outStream = new FileOutputStream(decrypted);
        DataOutputStream outFile = new DataOutputStream(outStream);
        
        //Signals the end of content in the file
         boolean fileEnd = false;
         
         //Alerts that the message from the encrypted file is being decrpyted
         System.out.println("Beginning to decrypt the message from the EncryptionFile: ");
        
         //Reads all the content/lines in the file and writes to the decrypted file
        while (!fileEnd)
      {
         try
         {
             //Reads the content from encrypted file
              char input = inFile.readChar();

              //Subtracts 8 character codes from each character
              input = (char) (input - 8);

              //Writes the original message to decrpyted file
              outFile.writeChar(input);

              //Prints the decrpyted message to the console
              System.out.print(input + "");

          } catch (EOFException e) 
          {
              //Stops reading and writing when it reaches the end of the file
              fileEnd = true;
          }
         
      }
        System.out.print("\n");
        
        //Closes the files
        outFile.close();
        inFile.close();
    }
}
