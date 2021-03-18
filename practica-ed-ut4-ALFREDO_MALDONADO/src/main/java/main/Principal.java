package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int idMaxMargen = 0, idMinMargen = 0;
        double maxMargen = 0, minMargen = 0, beneficio = 0;
        // vector con los rendimientos generadas
        Double[] arrayPrecios = new Double[20];
        Double[] arrayCoste = new Double[20];
        Double[] arrayMargenes = new Double[20];
        Double[] arrayNuevoPrecio = new Double[20];

        // Genera precio random entre 0 y 2000
        for (int i = 0; i < arrayPrecios.length; i++) {
            arrayPrecios[i] = BigDecimal.valueOf(Math.random() * 2000).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        // Genera coste random entre 0 y 1000
        for (int i = 0; i < arrayPrecios.length; i++) {
            arrayCoste[i] = BigDecimal.valueOf(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        // Operaciones
        // 1. Calcula Margen de beneficio
        for (int i = 0; i < arrayPrecios.length; i++) {
            arrayMargenes[i] = BigDecimal.valueOf(((arrayPrecios[i] - arrayCoste[i]) / arrayPrecios[i]) * 100)
                    .setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        // 2. Obtener el id del producto con mayor margen de beneficio
        double postEval = Double.MIN_VALUE;
        for (int i = 0; i < arrayMargenes.length; i++) {
            double preEval = arrayMargenes[i];
            if (preEval > postEval) {
                maxMargen = preEval;
                postEval = arrayMargenes[i];
                idMaxMargen = i + 1;
            }
        }
        // 3. Obtener el id del producto con menor margen de beneficio
        postEval = Double.MAX_VALUE;
        for (int i = 0; i < arrayMargenes.length; i++) {
            double preEval = arrayMargenes[i];
            if (preEval < postEval) {
                minMargen = preEval;
                postEval = arrayMargenes[i];
                idMinMargen = i + 1;
            }
        }
        // 4. Calcular el precio del producto para todos aquellos productos que no
        // tengan al menos un margen del 10%
        for (int i = 0; i < arrayMargenes.length; i++) {
            if (arrayMargenes[i] < 10) {
                arrayNuevoPrecio[i] = BigDecimal.valueOf((arrayCoste[i] / (1 - (10.00 / 100))))
                        .setScale(2, RoundingMode.HALF_UP).doubleValue();
            }
        }

        // 5. Beneficio total
        for (int i = 0; i < arrayCoste.length; i++) {
            beneficio = BigDecimal.valueOf(beneficio + (arrayPrecios[i] - arrayCoste[i])).setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
        }

        System.out.println("Array Precio: " + Arrays.toString(arrayPrecios));
        System.out.println("Array Coste: " + Arrays.toString(arrayCoste));
        System.out.println("Array Margen: " + Arrays.toString(arrayMargenes));
        System.out.println("Array Nuevo: " + Arrays.toString(arrayNuevoPrecio));
        System.out.println("Margen Maximo: " + maxMargen);
        System.out.println("Margen Minimo: " + minMargen);
        System.out.println("Id producto margen maximo: " + idMaxMargen);
        System.out.println("Id producto margen minimo: " + idMinMargen);
        System.out.println("Beneficio total: " + beneficio);
    }

}
