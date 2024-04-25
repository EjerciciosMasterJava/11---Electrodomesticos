package com.sinensia.electrodomesticos.aplicacion;
import java.util.List;

import com.sinensia.electrodomesticos.electrodomestico.Electrodomestico;
import com.sinensia.electrodomesticos.lavadora.Lavadora;
import com.sinensia.electrodomesticos.television.Television;
import com.sinensia.electrodomesticos.television.TelevisionImpl;
import com.sinensia.electrodomesticos.utilidad.ElectrodomesticosUtil;

public class AplicacionElectrodomesticos {

	public static void main(String[] args) {
		
		// Instanciar lista de electrodomesticos de prueba
		List<Electrodomestico> electrodomesticos = ElectrodomesticosUtil.getElectrodomesticosPrueba();
		
		// Mostrar precios de la lista de electrodomesticos
		ElectrodomesticosUtil.mostrarPrecios(electrodomesticos);
		
		
		// Comprobación de método comprobarConsumoEnergetico
		Electrodomestico lavadora = new Lavadora();
		System.out.println(lavadora.comprobarConsumoEnergetico('x'));
		System.out.println(lavadora.comprobarConsumoEnergetico('a'));
		
		
		Television television = new TelevisionImpl();
		television.encender();
		television.apagar();
		((TelevisionImpl)television).setPrecio(200d);
		System.out.println(((TelevisionImpl)television).precioFinal());
		
	}
	
}
