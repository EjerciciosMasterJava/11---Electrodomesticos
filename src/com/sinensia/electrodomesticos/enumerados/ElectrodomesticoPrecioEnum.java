package com.sinensia.electrodomesticos.enumerados;

public enum ElectrodomesticoPrecioEnum {

	BASE(100d);
	
	private Double precio;
	
	private ElectrodomesticoPrecioEnum(Double precio) {
		precio = precio;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public static Double getPrecioPorTamanho(Double kilos) {
		Double[] precios = {10d, 50d, 80d, 100d};
		if(kilos > 0) {
			if(kilos < 20) {
				return precios[0];
			}else if(kilos >= 20 && kilos < 50) {
				return precios[1];
			}else if(kilos >= 50 && kilos < 80) {
				return precios[2];
			}else {
				return precios[3];
			}
		}else {
			System.out.println("Error. El peso debe ser mayor a 0.");
			return -1d;
		}
	}
	
}
