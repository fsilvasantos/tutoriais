package javatutorial._20_files_and_io;
import java.io.*;

public class DataInput_Stream {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("teste.txt"));
      dataOut.writeUTF("hello");
      dataOut.close();

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("teste.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.print("content: " + k + " ");
      }

      dataIn.close();

   }

}