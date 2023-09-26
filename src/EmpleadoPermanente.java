public class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String numeroSeguroSocial;
    

public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, String numeroSeguroSocial) {
        super(rfc, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.numeroSeguroSocial = numeroSeguroSocial;    
}

public double getSueldoBase() {
        return sueldoBase;
    }
public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }


public double calcularSalario() {
        return sueldoBase;
    }
public void mostrarInformacionPermanente() {
        super.mostrarInformacion(); 
        System.out.println("Sueldo Base: " + sueldoBase);
        System.out.println("Número de Seguro Social: " + numeroSeguroSocial);
    }

public double obtenerIngresos() {
        return sueldoBase;
    }
public double calcularDescuento() {
        return 0.11 * sueldoBase;
    }

public double calcularSueldoNeto() {
        double ingresos = obtenerIngresos();
        double descuento = calcularDescuento();
        return ingresos - descuento;
}
}

