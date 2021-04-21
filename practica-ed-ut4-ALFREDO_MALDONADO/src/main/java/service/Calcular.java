package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Calcular {
	/**
	 * Método: calcula y retorna el margen
	 * 
	 * @param precio {@link Double} precio
	 * @param coste  {@link Double} coste
	 * @return Double {@link Double} margen
	 */
	public double calculaMargen(double precio, double coste) {
		return BigDecimal.valueOf(((precio - coste) / precio) * 100).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	/**
	 * Método: calcula y retorna (beneficio total)
	 * 
	 * @param resultado variable double que contiene la suma de los anteriores beneficios                 
	 * @param precio    {@link Double} precio
	 * @param coste     {@link Double} coste
	 * @return double beneficio total
	 */
	public double calcularBeneficioTotal(double resultado, double precio, double coste) {
		return BigDecimal.valueOf(resultado + (precio - coste)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	/**
	 * Método: calcula un precio desde un coste
	 * 
	 * @param coste {@link Double} coste que recibe del producto
	 * @return double nuevo precio
	 */
	public double calcularNuevoPrecio(double coste) {
		return BigDecimal.valueOf((coste / (1 - (10.00 / 100)))).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
