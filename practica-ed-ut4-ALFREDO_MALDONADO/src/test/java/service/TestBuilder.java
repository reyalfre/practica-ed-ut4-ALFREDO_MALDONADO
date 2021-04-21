package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

public class TestBuilder {

	@Test
	public void Construir_Tienda_ok() {

		Builder builder = new Builder();
		builder.construirTienda();
		assertNotNull(builder);
	}

	@Test
	void crear_productos_OK() {
		Builder builder = new Builder();
		Tienda tienda = new Tienda();
		Producto[] productos = new Producto[1];
		productos[0] = new Producto(200, 30, 1);
		tienda.setProductos(productos);
		builder.generaArrayProductos(tienda);
		assertNotNull(productos);
	}

}
