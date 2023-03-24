import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class trg {

    public static void main(String[] args) throws IOException {

        CopiarFichero("C:\\Users\\erick\\Documents\\fichero.txt", "C:\\Users\\erick\\Documents\\passwrd");

    }




public static void  CopiarFichero(String fileIn, String fileOut) throws IOException {

        InputStream inputStream = null;
        PrintStream printStream = null;

        try {
            inputStream = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            printStream = new PrintStream(new FileOutputStream(fileOut));
            out.write(datos);
            out.close();


        } catch (Exception e) {
            out.println("Exception: " + e.getMessage());
        }
}

}
