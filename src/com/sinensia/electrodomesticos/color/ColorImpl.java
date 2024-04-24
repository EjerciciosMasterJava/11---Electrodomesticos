package com.sinensia.electrodomesticos.color;

import com.sinensia.electrodomesticos.electrodomestico.ElectrodomesticoDefault;

public class ColorImpl {

	private String codigoColor;
	private Colores color;

	public ColorImpl() {
		super();
		color = ElectrodomesticoDefault.COLOR_DEFAULT;
	}

	public ColorImpl(String codigoColor, Colores color) {
		this();
		this.codigoColor = codigoColor;
		this.color = color;
	}

	public String getCodigoColor() {
		return codigoColor;
	}

	public void setCodigoColor(String codigoColor) {
		this.codigoColor = codigoColor;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color [codigoColor=" + codigoColor + ", color=" + color + "]";
	}

}
