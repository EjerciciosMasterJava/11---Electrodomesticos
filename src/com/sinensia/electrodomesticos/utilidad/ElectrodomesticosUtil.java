package com.sinensia.electrodomesticos.utilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sinensia.electrodomesticos.color.ColorImpl;
import com.sinensia.electrodomesticos.color.Colores;
import com.sinensia.electrodomesticos.electrodomestico.Electrodomestico;
import com.sinensia.electrodomesticos.electrodomestico.ElectrodomesticoImpl;
import com.sinensia.electrodomesticos.enumerados.ElectrodomesticoConsumoEnergeticoEnum;
import com.sinensia.electrodomesticos.lavadora.Lavadora;
import com.sinensia.electrodomesticos.television.TelevisionImpl;

public class ElectrodomesticosUtil {

	public static final List<Electrodomestico> getElectrodomesticosPrueba() {
		
		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		electrodomesticos = Arrays.asList(
				new Lavadora(),
				new Lavadora(10d, 10d),
				new Lavadora(10d, ElectrodomesticoConsumoEnergeticoEnum.A, new ColorImpl("", Colores.GRIS), 30d, 20),
				new Lavadora(15d, ElectrodomesticoConsumoEnergeticoEnum.B, new ColorImpl("", Colores.NEGRO), 35d, 15),
				new Lavadora(9d, ElectrodomesticoConsumoEnergeticoEnum.D, new ColorImpl("", Colores.ROJO), 20d, 23),

				new TelevisionImpl(),
				new TelevisionImpl(35d, 12d),
				new TelevisionImpl(10d, ElectrodomesticoConsumoEnergeticoEnum.A, new ColorImpl("", Colores.GRIS), 10d, 21.5, false),
				new TelevisionImpl(15d, ElectrodomesticoConsumoEnergeticoEnum.B, new ColorImpl("", Colores.NEGRO), 10d, 55.0, true),
				new TelevisionImpl(9d, ElectrodomesticoConsumoEnergeticoEnum.D, new ColorImpl("", Colores.ROJO), 10d, 65.5, true)
				);		
		return electrodomesticos;
	}
	
	public static final void mostrarPrecios(List<Electrodomestico> electrodomesticos) {
		Double sumaTelevisiones = 0.0;
		Double sumaLavadoras = 0.0;
		Double sumaTotal = 0.0;
		for(Electrodomestico e: electrodomesticos) {
			if(e instanceof Lavadora) {
				sumaLavadoras += e.precioFinal();
			}
			if(e instanceof TelevisionImpl) {
				sumaTelevisiones += e.precioFinal();
			}
			sumaTotal += e.precioFinal();
			System.out.println("Precio final " + e.getClass().getSimpleName() + " = " + e.precioFinal());
		}
		
		System.out.println("Suma Total = " + sumaTotal);
		System.out.println("Suma Lavadoras = " + sumaLavadoras);
		System.out.println("Suma Televisores = " + sumaTelevisiones);
	}
}
