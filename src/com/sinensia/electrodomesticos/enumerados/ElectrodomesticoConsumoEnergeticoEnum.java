package com.sinensia.electrodomesticos.enumerados;

/**
 * Consumo Energetico de un electrodomestico con su respectivos precios
 */
public enum ElectrodomesticoConsumoEnergeticoEnum {
	
	A(100), B(80), C(60), D(50), E(30), F(10);

	Integer precio;
	
	private ElectrodomesticoConsumoEnergeticoEnum(Integer precio) {
		this.precio = precio;
	}
	
	public Integer getPrecio() {
		return precio;
	}

}
