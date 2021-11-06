package prueba;

import datos.clsGestionArchivo;
import java.util.ArrayList;
import modelo.clsProfesor;
import vista.vtnPrincipal;


public class clsPrincipal {
    /*Atributos*/
    private static ArrayList<clsProfesor> lstProfes;
    
    /*Metodos*/
    public static void main(String[] args) {
        //Inicializar vector
        clsPrincipal.lstProfes = new ArrayList<>();
        
        //Lectura de Archivo
        clsGestionArchivo GA = new clsGestionArchivo();
        GA.leerArchivoProfe(lstProfes);
        
        //Lanzamiento de la ventana grafica
        vtnPrincipal vtn = new vtnPrincipal(clsPrincipal.lstProfes);
        vtn.setVisible(true);
    }
    
}
