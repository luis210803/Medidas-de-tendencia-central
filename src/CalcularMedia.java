public class CalcularMedia {
    public static double calcularMedia(double[] datos) {
        double sum = 0;
        for (double num : datos) {
            sum += num;
        }
        return sum / datos.length;
    }

    public static double calcularMediaAgrupados(double[] intervalos, double[] frecuencias) {
        double sum = 0;
        double totalFrecuencia = 0;
        for (int i = 0; i < intervalos.length; i++) {
            sum += intervalos[i] * frecuencias[i];
            totalFrecuencia += frecuencias[i];
        }
        return sum / totalFrecuencia;
    }
}



