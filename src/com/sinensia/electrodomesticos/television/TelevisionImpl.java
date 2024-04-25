package com.sinensia.electrodomesticos.television;

import com.sinensia.electrodomesticos.color.ColorImpl;
import com.sinensia.electrodomesticos.electrodomestico.ElectrodomesticoImpl;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;

public class TelevisionImpl extends ElectrodomesticoImpl implements Television{

	private Double resolucionPulgadas;
	
	private Boolean sintonizadorTDT;
	
	private Boolean encendida;

	public TelevisionImpl() {
		super();
		resolucionPulgadas = 20.0;
		sintonizadorTDT = false;
		this.encendida = false;
	}

	public TelevisionImpl(Double precio, ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico, ColorImpl color, Double peso, Double resolucionPulgadas, Boolean sintonizadorTDT) {
		super(precio, consumoEnergetico, color, peso);
		this.resolucionPulgadas = resolucionPulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public TelevisionImpl(Double precio, Double peso) {
		super(precio, peso);
		resolucionPulgadas = 20.0;
		sintonizadorTDT = false;
	}

	public Boolean getEncendida() {
		return encendida;
	}

	public void setEncendida(Boolean encendida) {
		this.encendida = encendida;
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

	@Override
	public void encender() {
		System.out.println("Se ha encendido la television.");
		this.encendida = true;
	}

	@Override
	public void apagar() {
		System.out.println("Se ha apagado la television.");
		this.encendida = false;
	}
	
	
}
