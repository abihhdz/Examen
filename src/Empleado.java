public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String rfc;

    public static void main(String[] args) {}
    
    public Empleado(String rfc, String apellido, String nombre) {
        this.rfc = rfc;
        this.apellido = apellido;
        this.nombre = nombre;
        this.rfc = rfc;
    }
    public void mostrarInformacion() {
        System.out.println("RFC: " + rfc);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }
    public String getRfc() {
    return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getApellido() {
    return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombres(String nombre) {
        this.nombre = nombre;
    


}
}
