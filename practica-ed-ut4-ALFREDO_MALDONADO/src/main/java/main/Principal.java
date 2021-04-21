package main;

import service.Service;
import entity.Tienda;
import service.Builder;
import service.Menu;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Principal {
	//Método main
    public static void main(String[] args) {
    	Builder builder=new Builder();
        Service service=new Service();
        Tienda tienda=builder.construirTienda();
        
        // Margen de beneficio
        service.calculaMargenBeneficio(tienda);
        
        // Id producto (mayor margen de beneficio)
        tienda.setIdMaxMargen(service.calcularIdMax(tienda));
        
        // ID producto (menor margen de beneficio)
        tienda.setIdMinMargen(service.calcularIdMin(tienda));
        // Precio del producto (margen max 10%) 
        service.calcularNuevoPrecioProductos(tienda);
		
        // Beneficio_total
        service.beneficioTotal(tienda);
		
        Menu menu=new Menu();
        
        menu.mostrarPrecios(tienda);
        menu.mostrarCostes(tienda);
        menu.mostrarMargen(tienda);
        menu.mostrarNuevoPrecio(tienda);
        
        System.out.println("Id producto (margen maximo): " + tienda.getIdMaxMargen());
        System.out.println("Id producto (margen minimo): " + tienda.getIdMinMargen());
        System.out.println("Margen Maximo: " + tienda.getMaxMargen());
        System.out.println("Margen Minimo: " + tienda.getMinMargen());
        System.out.println("Beneficio total: " + tienda.getBeneficioTotal());
    
    }
}