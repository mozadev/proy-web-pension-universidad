
package Modelo;

public class Alumno
{
    	String categoria ;
            String tipoalumno;
            double promedio;
            int pension;
            double descuento;
            double nuevapension;

    public Alumno(String categoria, String tipoalumno, double promedio) {
        this.categoria = categoria;
        this.tipoalumno = tipoalumno;
        this.promedio = promedio;
    }

            
            
            
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoalumno() {
        return tipoalumno;
    }

    public void setTipoalumno(String tipoalumno) {
        this.tipoalumno = tipoalumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNuevapension() {
        return nuevapension;
    }

    public void setNuevapension(double nuevapension) {
        this.nuevapension = nuevapension;
    }


     

    
    
}
