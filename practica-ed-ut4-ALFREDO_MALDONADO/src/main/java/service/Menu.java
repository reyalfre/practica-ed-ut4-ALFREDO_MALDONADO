package service;

import entity.Tienda;
import entity.Producto;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Menu {
	/**
	 * Muestra los precios de los productos
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void mostrarPrecios(Tienda tienda) {
		Producto[] productos=tienda.getProductos();
		System.out.println("");
		System.out.println("Precios de productos: ");
		for(int i=0; i<productos.length; i++) {
			System.out.println("ID "+productos[i].getIdProducto()+ " - "+productos[i].getPrecio());
	
		}
	}
	/**
	 * Muestra los costes de los productos
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void mostrarCostes(Tienda tienda) {
		Producto[] productos=tienda.getProductos();
		System.out.println("");
		System.out.println("Costes de productos: ");
		for(int i=0; i<productos.length; i++) {
			System.out.println("ID "+productos[i].getIdProducto()+ " - "+productos[i].getCoste());
		
		}
	}
	/**
	 * Muestra los precios modificados de los nuevos productos
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void mostrarNuevoPrecio(Tienda tienda) {
		Producto[] productos=tienda.getProductos();
		System.out.println("");
		System.out.println("Nuevos precios de productos: ");
		for(int i=0; i<productos.length; i++) {
			if(productos[i].getNuevoPrecio()!=null) {
				System.out.print("ID "+ productos[i].getIdProducto() +": ");
				System.out.println(productos[i].getNuevoPrecio());
			}
		}
	}
	/**
	 * Muestra por pantalla los margenes de cada producto
	 * @param tienda {@link Tienda} contiene los productos
	 */
	public void mostrarMargen(Tienda tienda) {
		Producto[] productos=tienda.getProductos();
		System.out.println("");
		System.out.println("Margenes de beneficio de Productos: ");
		for(int i=0; i<productos.length; i++) {
			System.out.println("ID "+ productos[i].getIdProducto() +" -  "+productos[i].getMargen());
		}
	}
}

