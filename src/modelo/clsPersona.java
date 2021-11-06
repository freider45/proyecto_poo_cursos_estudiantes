
package modelo;

public abstract class clsPersona {
    /*ATRIBUTSO*/
    //Atributos de clase
    private long codigo;
    private String nombre;
    
    /*METODOS*/
    //Constructores
    public clsPersona(){
        
    }

    public clsPersona(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Metodos de acceso y midficacion

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo polimorfico
    public abstract String obtenerInformacion();
}//Fin clase
