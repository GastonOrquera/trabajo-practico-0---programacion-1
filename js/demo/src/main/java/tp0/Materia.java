package tp0;

public class Materia {
    private String nombre;
    private String codigo;
    private double calificacion;

    public Materia(String nombre, String codigo, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
