import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        gravador();
        leitor();
    }

    private  static void gravador()
    {
        byte[] dados = {65, 66, 67 ,68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("D://Documentos//Estudos//Java//stream.txt"))
        {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void leitor()
    {
        try (FileInputStream leitor = new FileInputStream("D://Documentos//Estudos//Java//stream.txt"))
        {
            int leitura;
            while ((leitura = leitor.read()) != -1)
            {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
