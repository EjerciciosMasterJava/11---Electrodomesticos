package com.sinensia.electrodomesticos.lavadora;

import com.sinensia.electrodomesticos.color.ColorImpl;
import com.sinensia.electrodomesticos.electrodomestico.ElectrodomesticoImpl;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;

public class Lavadora extends ElectrodomesticoImpl{

	private Integer carga;

	public Lavadora() {
		super();
		carga = 5;
	}
	
	/**
	 * Constructor con precio y peso
	 * @param precio el precio de la lavadora
	 * @param peso el peso de la lavadora
	 */
	public Lavadora(Double precio, Double peso) {
		super(precio, peso);
		carga = 5;
	}

	public Lavadora(Double precio, ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico, ColorImpl color, Double peso, Integer carga) {
		super(precio, consumoEnergetico, color, peso);
		this.carga = carga;
	}

	public Integer getCarga() {
		return carga;
	}

	@Override
	public Double precioFinal() {
		if(carga > 30) {
			return super.precioFinal() + 50d;
		}else {
			return super.precioFinal();
		}
	}

	
}
