package com.sinensia.electrodomesticos.electrodomestico;

import com.sinensia.electrodomesticos.color.Colores;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoPrecioEnum;

/**
 * Valores por defecto de un Electrodomestico
 */
public abstract class ElectrodomesticoDefault {
	
	public final static ElectrodomesticoConsumoEnergeticoEnum CONSUMO_ENERGETICO_DEFAULT = ElectrodomesticoConsumoEnergeticoEnum.F;
	
	public final static Double PRECIO_BASE_DEFAULT = ElectrodomesticoPrecioEnum.BASE.getPrecio();
	
	public final static Colores COLOR_DEFAULT = Colores.BLANCO;
	

}
