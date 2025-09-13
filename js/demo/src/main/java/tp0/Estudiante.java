package tp0;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private Carrera carrera; // Cambiado a tipo Carrera
    private double promedio;
    public List<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad, Carrera carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 16) {
            System.out.println("Tiene la edad permitida para ingresar...");
        } else {
            System.out.println("No tiene la edad permitida para ingresar...");
        }
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Materia materia : materias) {
            suma += materia.getCalificacion();
        }
        return suma / materias.size();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
        if (promedio >= 1 || promedio <= 5) {
            System.out.println("El promedio no es valido");
        } else if (promedio > 10) {
            System.out.println("El promedio tiene que ser menor/igual a 10.");
        } else {
            System.out.println("El promedio es valido");
        }
    }
}