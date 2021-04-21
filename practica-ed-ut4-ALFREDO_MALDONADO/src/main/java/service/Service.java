package service;

import entity.Tienda;
import entity.Producto;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Service {
	/**
	 * Metodo: calculo del margen de beneficio (productos)
	 * 
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void calculaMargenBeneficio(Tienda tienda) {
		Calcular calcular = new Calcular();
		Producto[] productos = tienda.getProductos();
		for (int i = 0; i < productos.length; i++) {
			productos[i].setMargen(calcular.calculaMargen(productos[i].getPrecio(), productos[i].getCoste()));
		}
	}

	/**
	 * Metodo: calculo del beneficio total de los productos
	 * 
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void beneficioTotal(Tienda tienda) {
		double resultado = 0;
		Calcular calcular = new Calcular();
		Producto[] productos = tienda.getProductos();
		for (int i = 0; i < productos.length; i++) {
			resultado = calcular.calcularBeneficioTotal(resultado, productos[i].getPrecio(), productos[i].getCoste());
		}
		tienda.setBeneficioTotal(resultado);
	}

	/**
	 * Metodo: calculo de precios nuevos cuando tienen un margen menor de 10
	 * 
	 * @param tienda {@link Tienda} productos
	 */
	public void calcularNuevoPrecioProductos(Tienda tienda) {
		Calcular calc = new Calcular();
		Producto[] productos = tienda.getProductos();
		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getMargen() < 10) {
				productos[i].setNuevoPrecio(calc.calcularNuevoPrecio(productos[i].getCoste()));
			}
		}
	}

	/**
	 * Metodo que calcula y devuelve el id del producto con margen maximo
	 * 
	 * @param tienda {@link Tienda} contiene los productos
	 * @return  ID max
	 */
	public int calcularIdMax(Tienda tienda) {
		Producto[] productos = tienda.getProductos();
		double valorMax = productos[0].getMargen();
		int resultado = 0;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getMargen() >= valorMax) {
				valorMax = productos[i].getMargen();
				resultado = productos[i].getIdProducto();
			}
		}
		tienda.setMaxMargen(valorMax);
		return resultado;
	}

	/**
	 * Metodo que calcula y devuelve el id del producto con margen minimo
	 * 
	 * @param tienda {@link Tienda} contiene los productos
	 * @return ID min
	 */
	public int calcularIdMin(Tienda tienda) {
		Producto[] productos = tienda.getProductos();
		Double valorMin = productos[0].getMargen();
		int resultado = 0;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getMargen() <= valorMin) {
				valorMin = productos[i].getMargen();
				resultado = productos[i].getIdProducto();
			}
		}
		tienda.setMinMargen(valorMin);
		return resultado;
	}
}
