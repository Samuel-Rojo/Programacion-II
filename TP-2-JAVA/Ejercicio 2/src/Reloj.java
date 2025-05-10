public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos.");
        }
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos.");
        }
    }
    public void establecerHora(int hora, int minutos, int segundos) {
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public void mostrarHora() {
        System.out.printf("La hora es: %02d:%02d:%02d\n", hora, minutos, segundos);
    }
    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}
