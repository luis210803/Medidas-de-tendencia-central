public class Main {
    public static void main(String[] args) {
        // Datos no agrupados
        double[] datosNoAgrupados = DataSet.getDatosNoAgrupados();

        // Datos agrupados
        double[] intervalosAgrupados = DataSet.getIntervalosAgrupados();
        double[] frecuenciasAgrupadas = DataSet.getFrecuenciasAgrupadas();

        // Determinación y cálculo para datos no agrupados
        if (datosNoAgrupados != null && datosNoAgrupados.length > 0) {
            double mediaNoAgrupados = CalcularMedia.calcularMedia(datosNoAgrupados);
            System.out.println("Media (no agrupados): " + mediaNoAgrupados);

            double medianaNoAgrupados = CalcularMediana.calcularMediana(datosNoAgrupados);
            System.out.println("Mediana (no agrupados): " + medianaNoAgrupados);

            double modaNoAgrupados = CalcularModa.calcularModa(datosNoAgrupados);
            System.out.println("Moda (no agrupados): " + modaNoAgrupados);
        } else {
            System.out.println("No hay datos no agrupados para procesar.");
        }

        // Determinación y cálculo para datos agrupados
        if (intervalosAgrupados != null && frecuenciasAgrupadas != null && frecuenciasAgrupadas.length > 0) {
            double mediaAgrupados = CalcularMedia.calcularMediaAgrupados(intervalosAgrupados, frecuenciasAgrupadas);
            System.out.println("Media (agrupados): " + mediaAgrupados);

            double medianaAgrupados = CalcularMediana.calcularMedianaAgrupados(intervalosAgrupados, frecuenciasAgrupadas);
            System.out.println("Mediana (agrupados): " + medianaAgrupados);

            double modaAgrupados = CalcularModa.calcularModaAgrupados(intervalosAgrupados, frecuenciasAgrupadas);
            System.out.println("Moda (agrupados): " + modaAgrupados);
        } else {
            System.out.println("No hay datos agrupados para procesar.");
        }
    }
}




