public class Main {
        public static void main(String[] args) {
            // Crea la instancia de ClasificadorSimple
            ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();

            // Crea la instancia de ClasificadorExtendido con el clasificador simple como base
            ClasificadorEstudiantes clasificadorExtendido = new ClasificadorExtendido(clasificadorSimple);

            // Crea la instancia de ClienteClasificador con el clasificador extendido
            ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorExtendido);

            // Obtiene la clasificación para un estudiante
            String clasificacion = clienteClasificador.obtenerClasificacion(85);

            System.out.println("Clasificación del estudiante: " + clasificacion);
        }
    }

// Interfaz para el clasificador de estudiantes
interface ClasificadorEstudiantes {
    String clasificarEstudiante(int calificacion);
}

// Implementación del clasificador simple
class ClasificadorSimple implements ClasificadorEstudiantes {
    @Override
    public String clasificarEstudiante(int calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
}

// Esto es la implementación de un clasificador extendido
class ClasificadorExtendido implements ClasificadorEstudiantes {
    private final ClasificadorEstudiantes clasificadorBase;

    public ClasificadorExtendido(ClasificadorEstudiantes clasificadorBase) {
        this.clasificadorBase = clasificadorBase;
    }

    @Override
    public String clasificarEstudiante(int calificacion) {
        if (calificacion < 60) {
            return "F";
        } else {
            return clasificadorBase.clasificarEstudiante(calificacion);
        }
    }
}

// Esta es una clase principal que utiliza el clasificador de estudiantes
class ClienteClasificador {
    private ClasificadorEstudiantes clasificador;

    // Este constructor acepta cualquier implementación de ClasificadorEstudiantes
    public ClienteClasificador(ClasificadorEstudiantes clasificador) {
        this.clasificador = clasificador;
    }

    // Este Método utiliza el clasificador de estudiantes
    public String obtenerClasificacion(int calificacion) {
        return clasificador.clasificarEstudiante(calificacion);
    }
}




