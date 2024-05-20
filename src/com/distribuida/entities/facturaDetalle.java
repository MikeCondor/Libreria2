package com.distribuida.entities;

public class facturaDetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private float subtotal;
	private factura factura;
	private libro libro;
	public facturaDetalle(int idFacturaDetalle, int cantidad, float subtotal) {
		super();
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		
		
	}
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}
	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
	public factura getFactura() {
		return factura;
	}
	public void setFactura(factura factura) {
		this.factura = factura;
	}
	public libro getLibro() {
		return libro;
	}
	public void setLibro(libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "facturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
}
