package com.sinensia.electrodomesticos.aplicacion;
import java.util.List;

import com.sinensia.electrodomesticos.electrodomestico.Electrodomestico;
import com.sinensia.electrodomesticos.lavadora.Lavadora;
import com.sinensia.electrodomesticos.utilidad.ElectrodomesticosUtil;

public class AplicacionElectrodomesticos {

	public static void main(String[] args) {
		
		// Instanciar lista de electrodomesticos
		List<Electrodomestico> electrodomesticos = ElectrodomesticosUtil.getElectrodomesticosPrueba();
		
		// Mostrar precios de la lista de electrodomesticos
		ElectrodomesticosUtil.mostrarPrecios(electrodomesticos);
		
		
		// Comprobación de método comprobarConsumoEnergetico
		Electrodomestico lavadora = new Lavadora();
		System.out.println(lavadora.comprobarConsumoEnergetico('x'));
		System.out.println(lavadora.comprobarConsumoEnergetico('a'));
		
		
		
	}
	
}
