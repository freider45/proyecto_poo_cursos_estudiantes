package modelo;

public class clsModulo {
    //ATRIBUTOS
    //Atributos de clase
    private String tema;
    private float porcentaje;
    //Referencias
    private clsCurso objCurso;
    //METODOS
    //Constructores
    public clsModulo(){}
    public clsModulo(String tema, float porcentaje){
        this.tema = tema;
        this.porcentaje = porcentaje;
    }
    //Metodos de acceso y modificación
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public clsCurso getObjCurso() {
        return objCurso;
    }

    public void setObjCurso(clsCurso objCurso) {
        this.objCurso = objCurso;
    }    
    //Metodos generales   
    
}
