package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import entity.Producto;
import entity.Tienda;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Builder {
	// constantes
	/**
	 * {@value MAXPRODUCTOS}
	 */
	public static final int MAXPRODUCTOS = 20;
	private final Double MAXPRECIO = 2000.0;
	private final Double MAXCOSTE = 1000.0;

	/**
	 * Metodo: genera productos de la tienda
	 * 
	 * @param tienda {@link Tienda} con los productos
	 * @return productos {@link Producto} array que contiene productos
	 */
	public Producto[] generaArrayProductos(Tienda tienda) {
		Producto[] productos = new Producto[MAXPRODUCTOS];
		for (int i = 0; i < productos.length; i++) {
			productos[i] = new Producto();
		}

		for (int i = 0; i < productos.length; i++) {

			productos[i].setPrecio(
					BigDecimal.valueOf(Math.random() * MAXPRECIO).setScale(2, RoundingMode.HALF_UP).doubleValue());
			productos[i].setCoste(
					BigDecimal.valueOf(Math.random() * MAXCOSTE).setScale(2, RoundingMode.HALF_UP).doubleValue());
			productos[i].setIdProducto(i + 1);
		}
		return productos;
	}

	/**
	 * Metodo: retorna una tienda con productos instanciados
	 * 
	 * @return tienda {@link Tienda} retorna la tienda con los productos
	 */
	public Tienda construirTienda() {
		Tienda tienda = new Tienda();
		tienda.setProductos(generaArrayProductos(tienda));
		return tienda;
	}
}