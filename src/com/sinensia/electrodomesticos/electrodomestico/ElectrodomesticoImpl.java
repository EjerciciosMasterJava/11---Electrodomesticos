package com.sinensia.electrodomesticos.electrodomestico;

import com.sinensia.electrodomesticos.color.ColorImpl;
import com.sinensia.electrodomesticos.color.Colores;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoPrecioEnum;

public class ElectrodomesticoImpl implements Electrodomestico {

	private Double precio;
	private ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico;
	private ColorImpl color;
	private Double peso;

	public ElectrodomesticoImpl() {
		super();
		consumoEnergetico = ElectrodomesticoDefault.CONSUMO_ENERGETICO_DEFAULT;
		precio = ElectrodomesticoDefault.PRECIO_BASE_DEFAULT;
		peso = 5d;
	}

	public ElectrodomesticoImpl(Double precio, Double peso) {
		this();
		this.precio = precio;
		this.peso = peso;
	}

	public ElectrodomesticoImpl(Double precio, ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico, ColorImpl color, Double peso) {
		super();
		this.precio = precio;
		this.consumoEnergetico = consumoEnergetico;
		this.color = color;
		this.peso = peso;
	}

	/**
	 * Metodo no visible para comprobar si un color es correcto, es decir
	 * si está en el Enum Colores
	 * @param color String con el color a comproprobar
	 * @return si existe devuelve el color que se le pasa, si no existe
	 * 	devuelve el color por defecto
	 */
	private Colores comprobarColor(String color) {
		for(Colores c: Colores.values()) {
			if(c.name().equalsIgnoreCase(color)) {
				return c;
			}
		}
		return ElectrodomesticoDefault.COLOR_DEFAULT;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ElectrodomesticoConsumoEnergeticoEnum getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ElectrodomesticoConsumoEnergeticoEnum consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public ColorImpl getColor() {
		return color;
	}

	public void setColor(ColorImpl color) {
		this.color = color;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public ElectrodomesticoConsumoEnergeticoEnum comprobarConsumoEnergetico(char letra) {
		for (ElectrodomesticoConsumoEnergeticoEnum c : ElectrodomesticoConsumoEnergeticoEnum.values()) {
			if (c.name().equalsIgnoreCase(String.valueOf(letra))) {
				return c;
			}
		}
		return ElectrodomesticoDefault.CONSUMO_ENERGETICO_DEFAULT;
	}

	@Override
	public Double precioFinal() {
		return ElectrodomesticoPrecioEnum.getPrecioPorTamanho(peso) + consumoEnergetico.getPrecio();
	}

}
