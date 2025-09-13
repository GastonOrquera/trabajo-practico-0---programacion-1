package tp0;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido());
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}