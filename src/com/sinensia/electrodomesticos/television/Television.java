package com.sinensia.electrodomesticos.television;

import com.sinensia.electrodomesticos.color.ColorImpl;
import com.sinensia.electrodomesticos.electrodomestico.ElectrodomesticoImpl;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;

public class Television extends ElectrodomesticoImpl{

	private Double resolucionPulgadas;
	
	private Boolean sintonizadorTDT;

	public Television() {
		super();
		resolucionPulgadas = 20.0;
		sintonizadorTDT = false;
	}

	public Television(Double precio, ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico, ColorImpl color, Double peso, Double resolucionPulgadas, Boolean sintonizadorTDT) {
		super(precio, consumoEnergetico, color, peso);
		this.resolucionPulgadas = resolucionPulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television(Double precio, Double peso) {
		super(precio, peso);
		resolucionPulgadas = 20.0;
		sintonizadorTDT = false;
	}

	public Double getResolucionPulgadas() {
		return resolucionPulgadas;
	}

	public Boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public Double precioFinal() {
		Double precioFinal = super.precioFinal();
		if(resolucionPulgadas > 40.0) {
			precioFinal *= 1.3;
		}
		if(sintonizadorTDT) {
			precioFinal += 50.0;
		}
		return precioFinal;
	}
	
	
}
