package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import service.Calcular;


public class TestCalcular {
@Test
public void calcularMargen_ok() {
	Calcular s1 = new Calcular();
	double precio=200;
	double coste=100;
	double respuesta=s1.calculaMargen(precio, coste);
	assertEquals(50,respuesta);
}
@Test
public void calcularBeneficioTotal_ok() {
	Calcular s2 = new Calcular();
	double resultado=50;
	double precio=200;
	double coste=100;
	double respuesta=s2.calcularBeneficioTotal(resultado, precio, coste);
	assertEquals(150,respuesta);
}
@Test
public void calcularNuevoPrecio_ok() {
	Calcular s3 = new Calcular();
	double coste=100;
	double respuesta=s3.calcularNuevoPrecio(coste);
	assertEquals(111.11,respuesta);
}

}
