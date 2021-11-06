package modelo;

import java.util.ArrayList;

public class clsEstudiante extends clsPersona implements iEvaluacion{
    //ATRIBUTOS
    //Atributos de clase
    private String correo;
    //Referencias
    private ArrayList<clsDeuda> lstDeudas;
    private ArrayList<clsCurso> lstCursos;
    
    //METODOS
    //Constructores
    public clsEstudiante(){
        this.lstDeudas = new ArrayList<>();
        this.lstCursos = new ArrayList<>();
    }
    public clsEstudiante(long codigo, String nombre, String correo) {
        super(codigo, nombre);
        this.correo = correo;
        this.lstDeudas = new ArrayList<>();
        this.lstCursos = new ArrayList<>();
    }    
    
    //Metodos de acceso y modificación
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<clsDeuda> getLstDeudas() {
        return lstDeudas;
    }

    public void setLstDeudas(ArrayList<clsDeuda> lstDeudas) {
        this.lstDeudas = lstDeudas;
    }

    public ArrayList<clsCurso> getLstCursos() {
        return lstCursos;
    }

    public void setLstCursos(ArrayList<clsCurso> lstCursos) {
        this.lstCursos = lstCursos;
    }
    //Metodos generales

   
    @Override
    //Metodo abstracto que se sobrescribe
    public String obtenerInformacion() {
        String info = "=====INFORMACION ESTUDIANTE======="+
                "\nCodigo: "+super.getCodigo()+
                "\nNombre: "+super.getNombre()+
                "\nCorreo: "+this.correo;
        return info;
    }

    @Override
    public String evauacioncualitativa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String evaluacionCuantitativa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
