package encryption_kimberly_gonzalez;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This Encryption class will open a pre-existing file with text and will be
 * encrypted to another file.
 * 
 * @author kgonz038
 */
public class Encryption_kimberly_gonzalez 
{
    /**
     * This method will open and read from a file then encrypt the message that
     * is then written to another file.
     * 
     * @param existing A Pre-existing file with content already written 
     * @param encrypted The encrypted file where the new content is written to
     * @throws IOException
     */
    public static void encryptFile(String existing, String encrypted) throws IOException
    {
        //Opens the pre-existing file and then reads from the file
        FileInputStream inStream = new FileInputStream(existing);
        DataInputStream inFile = new DataInputStream(inStream);

        //Opens the encrypted file and then writes to the file
        FileOutputStream outStream = new FileOutputStream(encrypted);
        DataOutputStream outFile = new DataOutputStream(outStream);

        boolean fileEnd = false; //Signifies the end of content in the file
        
        //Alerts that the message from the exisitng file is being encrpyted
        System.out.println("Encrypting the message from the MessageFile. ");
        
        //Reads all the content/lines in the file and writes to the encrpyted file
        while (!fileEnd) 
        {
            try 
            {
                //Reads the content from pre-existing file
                byte input = inFile.readByte();

                //Adds 8 chracters codes to each character
                input = (byte) (input + 8);

                //Writes the new input to encrpyted file
                outFile.writeChar(input);

            } catch (EOFException e) 
            {
                //Stops reading and writing when it reaches the end of the file
                fileEnd = true;
            }
        }

        //Alerts to the console that the encrpytion process is done
        System.out.println("Encryption complete. \n");
        
        //Closes the files
        outFile.close();
        inFile.close();
}
}
