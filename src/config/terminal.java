package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Marvic R Santiago P on 28/02/2016.
 */
public class terminal {

    /**
     * reading file in the source specific and print to the screen
     */
    public void readFile() {
        try {
            /**a type object properties is created*/
            Properties properties = new Properties();
            /**Upload the file to the specified path*/
            properties.load(new FileInputStream("C:\\Projects\\JVPOS\\jvpos\\src\\properties\\config.propierties"));
            String company = properties.getProperty("Empresa");
            String branch = properties.getProperty("Sucursal");
            String check_out_counter = properties.getProperty("Caja");
            /**Print values*/
            System.out.println("Empresa : " + company + "\n" + "Sucursal : " + branch + "\n" + "Caja : " + check_out_counter );
        } catch (FileNotFoundException e) {
            System.out.println("Error, El archivo no exite");
        } catch (IOException e) {
            System.out.println("Error, No se puede leer el archivo");
        }
    }
}


