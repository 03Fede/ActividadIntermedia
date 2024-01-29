
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ClasificadorTest1 {

        @Test
        void testClasificacionSimple() {
            ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
            ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorSimple);

            String clasificacion = clienteClasificador.obtenerClasificacion(85);

            assertEquals("B", clasificacion);
        }

        @Test
        void testClasificacionExtendida() {
            ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
            ClasificadorEstudiantes clasificadorExtendido = new ClasificadorExtendido(clasificadorSimple);
            ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorExtendido);

            String clasificacion = clienteClasificador.obtenerClasificacion(55);

            assertEquals("F", clasificacion);
        }
    }

class CalificadorTest2 {

    @Test
    void testClasificacionSimpleA() {
        ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
        ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorSimple);

        String clasificacion = clienteClasificador.obtenerClasificacion(95);

        assertEquals("A", clasificacion);
    }

    @Test
    void testClasificacionSimpleC() {
        ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
        ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorSimple);

        String clasificacion = clienteClasificador.obtenerClasificacion(75);

        assertEquals("C", clasificacion);
    }

    @Test
    void testClasificacionExtendidaB() {
        ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
        ClasificadorEstudiantes clasificadorExtendido = new ClasificadorExtendido(clasificadorSimple);
        ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorExtendido);

        String clasificacion = clienteClasificador.obtenerClasificacion(85);

        assertEquals("B", clasificacion);
    }

    @Test
    void testClasificacionExtendidaF() {
        ClasificadorEstudiantes clasificadorSimple = new ClasificadorSimple();
        ClasificadorEstudiantes clasificadorExtendido = new ClasificadorExtendido(clasificadorSimple);
        ClienteClasificador clienteClasificador = new ClienteClasificador(clasificadorExtendido);

        String clasificacion = clienteClasificador.obtenerClasificacion(55);

        assertEquals("F", clasificacion);
    }
}



