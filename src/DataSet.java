public class DataSet {
    // Datos no agrupados
    private static final double[] DATOS_NO_AGRUPADOS = {};

    // Datos agrupados (intervalos y frecuencias)
    private static final double[] INTERVALOS_AGRUPADOS = {10, 20, 30, 40, 50};
    private static final double[] FRECUENCIAS_AGRUPADAS = {15, 20, 25, 30, 35};

    // Método para determinar el tipo de datos
    public static boolean esAgrupado() {
        return INTERVALOS_AGRUPADOS != null && FRECUENCIAS_AGRUPADAS != null;
    }

    public static double[] getDatosNoAgrupados() {
        return DATOS_NO_AGRUPADOS;
    }

    public static double[] getIntervalosAgrupados() {
        return INTERVALOS_AGRUPADOS;
    }

    public static double[] getFrecuenciasAgrupadas() {
        return FRECUENCIAS_AGRUPADAS;
    }
}


