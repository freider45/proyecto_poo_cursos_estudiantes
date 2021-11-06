
package datos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.cargoDocente;
import modelo.clsProfesor;

/**
 *
 * @author freid
 */
public class clsGestionArchivo {
    /*Atributos*/
    DataInputStream origenDatos = null;
    FileInputStream archivo = null;
    DataOutputStream destinoDatos;
    FileOutputStream archivoSalida;
    String linea;
    String [] partes;
    
    /*Metodos*/
    public clsGestionArchivo(){
        
    }
    public void escribirArchivoProfes(ArrayList<clsProfesor> lstProfes){
        try{
            String ruta = System.getProperty("user.dir");
            String rutaCompleta = ruta + "/" + "profesores.txt";
            File file = new File(rutaCompleta);

            // Si el archivo no existe es creado
            if (!file.exists()){
                file.createNewFile();

            }
            
            archivoSalida = new FileOutputStream(rutaCompleta);
            destinoDatos = new DataOutputStream(archivoSalida);
            
            clsProfesor auxp;
            for(int i=0;i<lstProfes.size();i++){
                auxp = lstProfes.get(i);
                linea = auxp.obtenerFormatoLinea();
                if(!linea.isEmpty()){
                    destinoDatos.writeUTF(linea);
                }
            }
            
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, 
                "Archivo no Encontrado",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, 
                "Archivo con Informacion no Valida",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE
            );
        }
        finally{
            try {
                destinoDatos.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, 
                "Fallo el Mecanismo de Cierre",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void leerArchivoProfe(ArrayList<clsProfesor> lstProfes){
        boolean bandera = true;
        clsProfesor auxp;
        try{
            String ruta = System.getProperty("user.dir");
            String rutaCompleta = ruta +"/" + "profesores.txt";
            File file = new File(rutaCompleta);

            // Si el archivo no existe es creado
            if (!file.exists()){
                file.createNewFile();

            }
            
            archivo = new FileInputStream(rutaCompleta);
            origenDatos = new DataInputStream(archivo);
            
            while(bandera){
                linea = origenDatos.readUTF();
                partes = linea.split(",");
                auxp = new clsProfesor();
                auxp.setCodigo(Long.parseLong(partes[0]));
                auxp.setNombre(partes[1]);
                cargoDocente enumD;
                if(partes[2].equalsIgnoreCase("Docente")){
                    enumD = cargoDocente.Docente;
                }
                else{
                    if(partes[2].equalsIgnoreCase("Coordinador")){
                        enumD = cargoDocente.Coordinador;
                    }
                    else{
                        enumD = cargoDocente.Jefe;
                    }
                }
                auxp.setCargo(enumD);
                auxp.setSueldo(Float.parseFloat(partes[3]));
                lstProfes.add(auxp);
            }
        }
        catch(EOFException e){
            JOptionPane.showMessageDialog(null, 
                "Carga de datos con Exito",
                "Gestion de Lectura",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, 
                "Archivo no Encntrado",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE
            );
        }
        catch(IOException e){
            //e.printStackTrace();  //Para que aparezca los errores en la consola
            JOptionPane.showMessageDialog(null, 
                "Archivo con Informacion no Valida",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE
            );
        }
        finally{
            try {
                archivo.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, 
                "Fallo el Mecanismo de Cierre",
                "Gestion de Lectura",
                JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
    
}
