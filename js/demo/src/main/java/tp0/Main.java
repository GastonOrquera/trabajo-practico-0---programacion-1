package tp0;

public class Main {
    public static void main(String[] args) {
    
        Carrera ingenieria = new Carrera("Ingeniería", "ING101");

        Estudiante juan = new Estudiante("Juan", "Perez", 20, ingenieria, 0);
        Estudiante ana = new Estudiante("Ana", "Gomez", 21, ingenieria, 0);

        ingenieria.agregarEstudiante(juan);
        ingenieria.agregarEstudiante(ana);

        Materia mate = new Materia("Matemáticas", "MAT101", 10.0);
        Materia programacion = new Materia("Programación", "PRG101", 6.0);
        Materia quimica = new Materia("Química", "QUI101", 7.0);

        juan.agregarMateria(mate);
        juan.agregarMateria(programacion);

        ana.agregarMateria(programacion);
        ana.agregarMateria(quimica);

        System.out.println("Promedio de Juan: " + juan.calcularPromedio());
        System.out.println("Promedio de Ana: " + ana.calcularPromedio());

        System.out.println("Estudiantes de la carrera " + ingenieria.getNombre() + ":");
        ingenieria.listarEstudiantes();
    }
}
