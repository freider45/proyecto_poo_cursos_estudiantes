
package modelo;

import java.util.ArrayList;

public class clsProfesor extends clsPersona implements iEvaluacion{
    /*ATRIBUTOS*/
    //Atributos de clase
    private cargoDocente cargo;
    private float sueldo; 
    
    /*REFERENCIA*/
    private ArrayList<clsCurso> lstCursos;
    
    /*METODOS*/
    //Constructores
    public clsProfesor(){
        this.lstCursos = new ArrayList<clsCurso>();
    }

    public clsProfesor(long codigo, String nombre, cargoDocente cargo, float sueldo) {
        super(codigo, nombre);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.lstCursos = new ArrayList<clsCurso>();
    }
    
    //Metodos de acceso y modificacion

    public cargoDocente getCargo() {
        return cargo;
    }

    public void setCargo(cargoDocente cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<clsCurso> getLstCursos() {
        return lstCursos;
    }

    public void setLstCursos(ArrayList<clsCurso> lstCursos) {
        this.lstCursos = lstCursos;
    }

    @Override
    //Metodo abstracto que se sobrescribe
    public String obtenerInformacion() {
        String info = "=====INFORMACION PROFESOR======="+
                "\nCodigo: "+super.getCodigo()+
                "\nNombre: "+super.getNombre()+
                "\nCrago: "+this.getCargo()+
                "\nSueldo: "+this.getSueldo();
        return info;
    }
    
    public String obtenerFormatoLinea() {
        String info =
                super.getCodigo()+","+
                super.getNombre()+","+
                this.cargo+","+
                this.sueldo+"\n";
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
    
}//Fin clase
