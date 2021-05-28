package entity;

import service.Builder;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Tienda {
	private Producto[] productos=new Producto[Builder.MAXPRODUCTOS];
	private double beneficioTotal;
	private double maxMargen;
	private double minMargen;
	private int idMaxMargen;
	private int idMinMargen;
	
	public Tienda() {
		beneficioTotal=0;
		maxMargen=0;
		minMargen=0;
		idMaxMargen=0;
		idMinMargen=0;
		
	}

	/**
	 * @return los productos
	 */
	public Producto[] getProductos() {
		return productos;
	}

	/**
	 * @return el beneficioTotal
	 */
	public double getBeneficioTotal() {
		return beneficioTotal;
	}

	/**
	 * @return el maxMargen
	 */
	public double getMaxMargen() {
		return maxMargen;
	}

	/**
	 * @return el minMargen
	 */
	public double getMinMargen() {
		return minMargen;
	}

	/**
	 * @return el idMaxMargen
	 */
	public int getIdMaxMargen() {
		return idMaxMargen;
	}

	/**
	 * @return el idMinMargen
	 */
	public int getIdMinMargen() {
		return idMinMargen;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	/**
	 * @param beneficioTotal the beneficioTotal to set
	 */
	public void setBeneficioTotal(double beneficioTotal) {
		this.beneficioTotal = beneficioTotal;
	}

	/**
	 * @param maxMargen the maxMargen to set
	 */
	public void setMaxMargen(double maxMargen) {
		this.maxMargen = maxMargen;
	}

	/**
	 * @param minMargen the minMargen to set
	 */
	public void setMinMargen(double minMargen) {
		this.minMargen = minMargen;
	}

	/**
	 * @param idMaxMargen the idMaxMargen to set
	 */
	public void setIdMaxMargen(int idMaxMargen) {
		this.idMaxMargen = idMaxMargen;
	}

	/**
	 * @param idMinMargen the idMinMargen to set
	 */
	public void setIdMinMargen(int idMinMargen) {
		this.idMinMargen = idMinMargen;
	}
	
}
