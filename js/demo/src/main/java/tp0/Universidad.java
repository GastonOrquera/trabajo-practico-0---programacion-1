package tp0;

import java.util.List;
import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre, String direccion, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
