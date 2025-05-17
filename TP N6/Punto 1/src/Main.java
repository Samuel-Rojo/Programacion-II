//Imagina que estás desarrollando un sistema para gestionar una red de dispositivos IoT
//(Internet of Things). Los dispositivos pueden ser sensores de temperatura, cámaras de
//seguridad, o altavoces inteligentes, entre otros:
//• Un dispositivo se pude encender, apagar y obtener su Estado.
//• Implementa por lo menos tres dispositivos concretos.
//• Se debe registrar el historial de estado del dispositivo y el mismo debe ser utilizado por
//cada dispositivo.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dispositivo> dispositivos = new ArrayList<>(); //lista de dispositivos
        dispositivos.add(new AltavozInteligente("Siri", 40));
        dispositivos.add(new Termometro("Sensor de humedad", 32));
        dispositivos.add(new Freezer("Samsung", true));
        int opcion;
        do {
            System.out.println("Bienvenido al Menu");
            System.out.println("0. Salir del menu");
            System.out.println("1. Mostrar dispositivos");
            System.out.println("2. Encender dispositivos");
            System.out.println("3. apagar dispositivos");
            System.out.println("4. Mostrar Estado");
            System.out.println("5. Mostrar historial");
            System.out.println("Elija una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dispositivos: ");
                    for (int i = 0; i < dispositivos.size(); i++) {
                        System.out.println((i + 1) + ". " + dispositivos.get(i));
                    }
                    break;
                case 2:
                    System.out.println("¿cual dispositivo desea encender? : ");
                    int Encender = scanner.nextInt() - 1;
                    if (Encender >= 0 && Encender < dispositivos.size()) {
                        dispositivos.get(Encender).encender();
                        System.out.println("encendido : " + dispositivos.get(Encender).nombre);
                        String hora= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                        System.out.println("Encendido en: "+ hora);
                    } else {
                        System.out.println("Dispositivo invalido");
                    }
                    break;
                case 3:
                    System.out.println("¿cual dispositivo desea apagar? : ");
                    int Apagar = scanner.nextInt() - 1;
                    if (Apagar >= 0 && Apagar < dispositivos.size()) {
                        dispositivos.get(Apagar).apagado();
                        System.out.println("Apagado: " + dispositivos.get(Apagar).nombre);
                        String hora= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                        System.out.println("Apagado en: "+ hora);
                    } else {
                        System.out.println("Dispositivo invalido");
                    }
                    break;
                case 4:
                    System.out.println("¿A cuantos dispositivos le desea ver el estado?: ");
                    int Estado = scanner.nextInt() - 1;
                    if (Estado >= 0 && Estado < dispositivos.size()) {
                        System.out.println("Estado de " + dispositivos.get(Estado).nombre + ": " + (dispositivos.get(Estado).getEstado() ? "Encendido" : "Apagado"));

                    } else {
                        System.out.println("Dispositivo invalido");
                    }
                    break;
                case 5:
                    System.out.println("¿A cual dispositivos le desea ver el historial?: ");
                    int Historial = scanner.nextInt() - 1;
                    if (Historial >= 0 && Historial < dispositivos.size()) {
                        System.out.println("Historial de " + dispositivos.get(Historial).nombre + ":");
                        for (String evento : dispositivos.get(Historial).getHistorial()) {
                            System.out.println(" -  " + evento);
                        }

                    } else {
                        System.out.println("Dispositivo invalido");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 0);
        scanner.close();
    }
}