package modelo;


public class clsDeuda {
    //ATRIBUTOS
    //Atributos de clase
    private int codigo;
    private String descripcion;
    private float valor;
    //Referencias
    private clsEstudiante objEstudiante;
    //METODOS
    //Constructores
    public clsDeuda(){}
    public clsDeuda(int codigo, String descripcion, float valor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    //Metodos de acceso y modificación
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public clsEstudiante getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(clsEstudiante objEstudiante) {
        this.objEstudiante = objEstudiante;
    }
    //Metodos generales
    
}
