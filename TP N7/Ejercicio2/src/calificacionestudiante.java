public class calificacionestudiante {
    public static void NotaEstudiante(Double nota) throws Calificacion{
        if (nota < 0 || nota  > 10) { //puse un or para no hacer 2 if
            throw new Calificacion("¡Error! por favor ingrese una nota entre 0 y 10");   // aqui tuve un error medio boludo, porque yo dsp de las comillas le agregue +nota y al imprimirme en pantalla al lado del resultado de mi exepcion me salia el numero que habia puesto
        }


    }
}