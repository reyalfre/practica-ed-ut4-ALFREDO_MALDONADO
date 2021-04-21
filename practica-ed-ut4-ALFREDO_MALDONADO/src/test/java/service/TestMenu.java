package service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

public class TestMenu {
	@Test
	public void mostrarPrecios_Ok() {
		Tienda tienda = new Tienda();
		Menu menu = new Menu();
		Producto[] productos = new Producto[1];
		productos[0] = new Producto(10, 3, 1);
		tienda.setProductos(productos);
		menu.mostrarPrecios(tienda);
		assertNotNull(menu);
	}

	@Test
	public void mostrarCostes_Ok() {
		Tienda tienda = new Tienda();
		Menu menu = new Menu();
		final int MAXPRODUCTOS = 2;
		Producto[] productos = new Producto[MAXPRODUCTOS];
		productos[0] = new Producto(10, 3, 1);
		productos[1] = new Producto(8, 3, 2);
		tienda.setProductos(productos);
		menu.mostrarCostes(tienda);
		assertNotNull(menu);
	}

	@Test
	public void comprobar_MostrarNuevoPrecio() {
		Tienda tienda = new Tienda();
		Menu menu = new Menu();
		final int MAXPRODUCTOS = 2;
		Producto[] productos = new Producto[MAXPRODUCTOS];
		productos[0] = new Producto(10, 3, 1);
		productos[1] = new Producto(8, 3, 2);
		tienda.setProductos(productos);
		menu.mostrarNuevoPrecio(tienda);
		assertNotNull(menu);
	}

	@Test
	public void mostrarMargen_Ok() {
		Tienda tienda = new Tienda();
		Menu menu = new Menu();
		final int MAXPRODUCTOS = 2;
		Producto[] productos = new Producto[MAXPRODUCTOS];
		productos[0] = new Producto(10, 3, 1);
		productos[1] = new Producto(8, 3, 2);
		tienda.setProductos(productos);
		menu.mostrarMargen(tienda);
		assertNotNull(menu);
	}

}
