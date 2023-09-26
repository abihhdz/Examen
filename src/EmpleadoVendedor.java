public class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String rfc, String apellido, String nombre, double montoVendido, double tasaComision) {
        super(rfc, apellido, nombre);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }
        double getMontoVendido() {
            return montoVendido;
        }
    
        public void setMontoVendido(double montoVendido) {
            this.montoVendido = montoVendido;
        }
    
        public double getTasaComision() {
            return tasaComision;
        }
    
        public void setTasaComision(double tasaComision) {
            this.tasaComision = tasaComision;
        }

 
    

public double calcularIngresos() {
    return montoVendido * tasaComision;
}


public double calcularBonificacion() {
        double ingresos = calcularIngresos();
        if (montoVendido < 1000) {
            return 0;
        } 
        else if (montoVendido >= 1000 && montoVendido <= 5000){
            return 0.05 * ingresos; 
        } else if (montoVendido >5000)  {
            return 0.10 * ingresos;
        }
        return ingresos; 
    }

public double calcularDescuento() {
        double ingresos = calcularIngresos();
        if (ingresos < 1000) {
            return 0.11 * ingresos;
        } 
        else {
            return 0.15 * ingresos;
        }
    }


public double calcularSueldoNeto() {
        double ingresos = calcularIngresos();
        double bonificacion = calcularBonificacion();
        double descuento = calcularDescuento();
        return ingresos + bonificacion - descuento;
    }
}
