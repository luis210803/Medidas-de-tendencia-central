import java.util.HashMap;

public class CalcularModa {
    // Moda para datos no agrupados
    public static double calcularModa(double[] datos) {
        HashMap<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : datos) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        double moda = datos[0];
        int maxFrequency = 0;
        for (double key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                moda = key;
            }
        }

        return moda;
    }

    // Moda para datos agrupados
    public static double calcularModaAgrupados(double[] intervalos, double[] frecuencias) {
        int maxFrecuenciaIndex = 0;
        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > frecuencias[maxFrecuenciaIndex]) {
                maxFrecuenciaIndex = i;
            }
        }

        double L = intervalos[maxFrecuenciaIndex] - (intervalos.length > 1 ? intervalos[1] - intervalos[0] : 1) / 2.0;
        double d1 = frecuencias[maxFrecuenciaIndex] - (maxFrecuenciaIndex > 0 ? frecuencias[maxFrecuenciaIndex - 1] : 0);
        double d2 = frecuencias[maxFrecuenciaIndex] - (maxFrecuenciaIndex < frecuencias.length - 1 ? frecuencias[maxFrecuenciaIndex + 1] : 0);

        return L + (d1 / (d1 + d2)) * (intervalos.length > 1 ? intervalos[1] - intervalos[0] : 1);
    }
}



