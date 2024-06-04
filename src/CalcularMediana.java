import java.util.Arrays;

public class CalcularMediana {
    public static double calcularMediana(double[] datos) {
        Arrays.sort(datos);
        int size = datos.length;
        if (size % 2 == 0) {
            return (datos[size / 2 - 1] + datos[size / 2]) / 2.0;
        } else {
            return datos[size / 2];
        }
    }

    public static double calcularMedianaAgrupados(double[] intervalos, double[] frecuencias) {
        double totalFrecuencia = 0;
        for (double freq : frecuencias) {
            totalFrecuencia += freq;
        }

        double frecuenciaAcumulada = 0;
        int medianaClaseIndex = -1;
        for (int i = 0; i < frecuencias.length; i++) {
            frecuenciaAcumulada += frecuencias[i];
            if (frecuenciaAcumulada >= totalFrecuencia / 2) {
                medianaClaseIndex = i;
                break;
            }
        }

        double L = intervalos[medianaClaseIndex] - (intervalos.length > 1 ? intervalos[1] - intervalos[0] : 1) / 2.0; // Límite inferior de la clase de la mediana
        double F = frecuenciaAcumulada - frecuencias[medianaClaseIndex]; // Frecuencia acumulada antes de la clase de la mediana
        double f = frecuencias[medianaClaseIndex]; // Frecuencia de la clase de la mediana
        double h = intervalos.length > 1 ? intervalos[1] - intervalos[0] : 1; // Tamaño del intervalo

        return L + ((totalFrecuencia / 2 - F) / f) * h;
    }
}






