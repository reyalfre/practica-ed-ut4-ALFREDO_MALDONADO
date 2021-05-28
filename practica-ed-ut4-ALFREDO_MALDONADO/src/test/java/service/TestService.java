package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

public class TestService {

	@Test
	void comprobar_Margen_Beneficio() {
		Tienda tienda = new Tienda();
		Service serv = new Service();
		Producto[] productos = new Producto[1];
		productos[0] = new Producto(10, 3, 1);
		tienda.setProductos(productos);
		serv.calculaMargenBeneficio(tienda);
		assertEquals(tienda.getProductos()[0].getMargen(), 70.0);
	}

	@Test
	void comprobar_Beneficio_Total_Ok() {
		Tienda tienda = new Tienda();
		Service serv = new Service();
		Producto[] productos = new Producto[2];
		productos[0] = new Producto(10, 3, 1);
		productos[1] = new Producto(15, 5, 2);
		tienda.setProductos(productos);
		serv.beneficioTotal(tienda);
		assertEquals(tienda.getBeneficioTotal(), 17);
	}

	@Test
	void calcular_Nuevo_precio_Productos_Ok() {
		Tienda tienda = new Tienda();
		Service serv = new Service();
		Producto[] productos = new Producto[1];
		productos[0] = new Producto(3, 10, 1);
		tienda.setProductos(productos);
		serv.calcularNuevoPrecioProductos(tienda);
		assertEquals(tienda.getProductos()[0].getNuevoPrecio(), 11.11);

	}

	@Test
	void calcularIdMax_ok() {
		Tienda tienda = new Tienda();
		Service serv = new Service();
		Producto[] productos = new Producto[2];
		productos[0] = new Producto(500, 60, 1);
		productos[1] = new Producto(500, 30, 2);
		tienda.setProductos(productos);
		int resultado = serv.calcularIdMax(tienda);
		assertEquals(resultado, 2);
	}

	@Test
	void calcularIdMin_ok() {
		Tienda tienda = new Tienda();
		Service serv = new Service();
		Producto[] productos = new Producto[2];
		productos[0] = new Producto(500, 60, 1);
		productos[1] = new Producto(500, 30, 2);
		tienda.setProductos(productos);
		int resultado = serv.calcularIdMin(tienda);
		assertEquals(resultado, 1);
	}
}
