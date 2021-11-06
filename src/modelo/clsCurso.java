package modelo;

import com.toedter.calendar.JCalendar;
import java.util.ArrayList;
import java.util.Calendar;

public class clsCurso {
    //ATRIBUTOS
    //Atributos de clase
    private String nombre;
    private int semestre;
    private Calendar fecha;
    //Referencias
    private ArrayList<clsEstudiante> lstEstudiantes;
    private ArrayList<clsModulo> lstModulos;
    //METODOS
    //Constructores
    public clsCurso(){
        this.lstEstudiantes = new ArrayList<>();
        this.lstModulos = new ArrayList<>();
    }
    public clsCurso(String nombre, int semestre, Calendar fecha) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.fecha = fecha;
        this.lstEstudiantes = new ArrayList<>();
        this.lstModulos = new ArrayList<>();
    }
    //Metodos de acceso y modificación
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<clsEstudiante> getLstEstudiantes() {
        return lstEstudiantes;
    }

    public void setLstEstudiantes(ArrayList<clsEstudiante> lstEstudiantes) {
        this.lstEstudiantes = lstEstudiantes;
    }

    public ArrayList<clsModulo> getLstModulos() {
        return lstModulos;
    }

    public void setLstModulos(ArrayList<clsModulo> lstModulos) {
        this.lstModulos = lstModulos;
    }
    //Metodos generales  
    //metodo de agregación
    public void agregarEstudiante(clsEstudiante objE){
        this.lstEstudiantes.add(objE); //Desde el curso hacia el estudiante
        objE.getLstCursos().add(this); //Desde estudiante hacia curso                
    }
    //metodo de composición
    public void crearModulo(String tema, float porcentaje){
        clsModulo objM = new clsModulo(tema,porcentaje);
        this.lstModulos.add(objM); //Desde el curso hacia el modulo
        objM.setObjCurso(this); //Desde modulo hacia el curso
    }
    
}//cierre clase
