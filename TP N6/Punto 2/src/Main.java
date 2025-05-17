import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Desarrolla un sistema para gestionar tareas en un proyecto colaborativo:
//• Una tarea tiene una fecha de inicio, fecha de fin y responsable al que se le asigna la
//tarea.
//• Implementa por lo menos tres tipos de tareas concretas.
//• Se debe poder calcular el tiempo total invertido en cada tarea y generar un informe de
//progreso.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<TareaBase> tareas = new ArrayList<>();
        tareas.add( new TareaDesarrollo(" Relevar informacion ", 40 , "Delfina Torres", 2, 8));
        tareas.add(new  TareaAvance("1er Avance de TareaBase  ", 20 , "Rojo Samuel", 3, 6));
        tareas.add( new Tareadepruebas("Prueba del 1er avance de TareaBase ", 10 , "Rojo Felipe", 5, 10));
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver tareas en desarrolo");
            System.out.println("2. Ver informes de avances");
            System.out.println("3. ver pruebas");
            System.out.println("0. Salir");
            System.out.print("Elija: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    for (TareaBase t : tareas) {
                        if (t instanceof TareaDesarrollo) {
                            TareaDesarrollo td = (TareaDesarrollo) t;
                            System.out.println("Tarea de desarrollo: " + td.getTitulo());
                            System.out.println("Responsable: " + td.getResponsable());
                            System.out.println("Estimación de horas: " + td.getEstimacionhoras());
                            System.out.println("Módulos completos: " + td.getModulosCompletos() + " / " + td.getModulosTotales());
                            System.out.println("Avance: " + td.porcentajeAvance() + "%");
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 2:
                    for (TareaBase t : tareas) {
                        if (t instanceof TareaAvance) {
                            TareaAvance ta = (TareaAvance) t;
                            System.out.println("Tarea de avance: " + ta.getTitulo());
                            System.out.println("Responsable: " + ta.getResponsable());
                            System.out.println("Estimación de horas: " + ta.getEstimacionhoras());
                            System.out.println("Los avances son: " + ta.getAvanceHecho() + " de " + ta.getAvanceTotal());
                            System.out.println("Avance porcentual: " + ta.porcentajeAvance() + "%");
                            System.out.println("-------------------------");
                        }
                    }
                    break;


                case 3:
                    for (TareaBase t : tareas) {
                        if (t instanceof Tareadepruebas) {
                            Tareadepruebas tp = (Tareadepruebas) t;
                            System.out.println("Tarea de pruebas: " + tp.getTitulo());
                            System.out.println("Responsable: " + tp.getResponsable());
                            System.out.println("Estimación de horas: " + tp.getEstimacionhoras());
                            System.out.println("Casos hechos: " + tp.getCasosHechos() + " de " + tp.getCasosTotales());
                            System.out.println("Avance porcentual: " + tp.porcentajeAvance() + "%");
                            System.out.println("-------------------------");
                        }
                    }
                    break;

            }
        } while(opcion != 0);

        scanner.close();
    }
}