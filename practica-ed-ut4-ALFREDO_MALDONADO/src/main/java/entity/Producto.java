package entity;

/**
 * @version 1.0
 * @author Alfredo Rafael Maldonado Pertuz
 * @since 18/03/2021
 */
public class Producto {
	private double precio;
	private double coste;
	private double margen;
	private double nuevoPrecio;
	private int idProducto;
	
	public Producto(){}
	public Producto (double precio, double coste, int idProducto){
		this.precio=precio;
		this.coste=coste;
		this.idProducto = idProducto;
		}
	/**
	 * @return el precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @return el coste
	 */
	public Double getCoste() {
		return coste;
	}
	/**
	 * @return el margen
	 */
	public Double getMargen() {
		return margen;
	}
	/**
	 * @return el nuevoPrecio
	 */
	public Double getNuevoPrecio() {
		return nuevoPrecio;
	}
	/**
	 * @return el idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @param coste the coste to set
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}
	/**
	 * @param margen the margen to set
	 */
	public void setMargen(double margen) {
		this.margen = margen;
	}
	/**
	 * @param nuevoPrecio the nuevoPrecio to set
	 */
	public void setNuevoPrecio(double nuevoPrecio) {
		this.nuevoPrecio = nuevoPrecio;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	

}
