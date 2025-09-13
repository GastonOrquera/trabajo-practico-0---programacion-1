# trabajo-practico-0---programacion-1

# Informe 

## Encapsulamiento

Apliqué el encapsulamiento declarando los atributos de las clases (Estudiante, Carrera, Materia) como private y proporcionando métodos públicos get y set para acceder y modificar estos atributos.

## Relaciones entre clases

Implementé la relación entre Estudiante y Materia agregando una lista de materias List<Materia> en la clase Estudiante, junto con métodos para agregar materias y calcular el promedio.  
La relación entre Carrera y Estudiante se implementó agregando una lista de estudiantes List<Estudiante> en la clase Carrera, con métodos para agregar, listar y buscar estudiantes.

## Validaciones en los setters

Agregué validaciones en los métodos setEdad y setPromedio de la clase Estudiante:
1) En setEdad, se verifica si la edad es mayor a 16 para permitir el ingreso.
2) En setPromedio, se valida que el promedio esté en un rango válido de 0 a 10 y se muestra un mensaje si no lo está.
