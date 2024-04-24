package com.sinensia.electrodomesticos.electrodomestico;

import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;

public interface Electrodomestico {

	public ElectrodomesticoConsumoEnergeticoEnum comprobarConsumoEnergetico(char letra);
	
	public Double precioFinal();
	
}
