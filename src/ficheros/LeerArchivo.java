package ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] str) {
        String routeFile = "C:/Users/LEX/Documents/ensayo_leerArchivoJava.txt";
        String createFile = "C:/Users/LEX/Documents/ensayo_leerArchivoJava1.txt";

        Leer_Fichero fichero = new Leer_Fichero();
        fichero.Lee(routeFile);

        Escribiendo escribir = new Escribiendo();
        escribir.Escribir(createFile);
    }
}

class Leer_Fichero {

    public void Lee(String File) {

        try {

            FileReader file = new FileReader(File);
            int c = 0;

            while(c!=-1) {
                c = file.read();
                char letra = (char)c;
                System.out.print(letra);
            }

            file.close();

        } catch (IOException e){
            System.out.print("No se encontro el archivo");
        }
    }
}

class Escribiendo {

    public void Escribir(String file) {

        String frase ="Soy de neiva y escribo desde java. ";
        try {
            // crea un archivo nuevo si no existe
            FileWriter escritura = new FileWriter(file, true);

            for (int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
