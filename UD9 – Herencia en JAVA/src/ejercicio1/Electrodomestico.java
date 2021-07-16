package ejercicio1;

public class Electrodomestico {
	protected static final String blanco = "blanco";
	protected static final char f = 'F';
	protected static final int base = 100;
	protected static final int pesobase = 5;
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	private void comprobarColor(String color) {
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean colorCorrecto = false;
		for (int i = 0; i < colores.length && !colorCorrecto; i++) {
			if (colores[i].equalsIgnoreCase(color)) {
				colorCorrecto = true;
			}

		}
		if (colorCorrecto) {
			this.color = color;
		} else {
			this.color = blanco;
		}
	}

	private void comprobarConsumo (char consumoEnergetico) {
		consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		char consumo[] = {'A','B','C','D','E','F'};
		boolean consumoCorrecto = false;
		for (int i = 0; i < consumo.length && !consumoCorrecto; i++) {
			if (consumo[i]==consumoEnergetico) {
				consumoCorrecto = true;
			}
		}
		if (consumoCorrecto) {
			this.consumoEnergetico=consumoEnergetico;
		}else {
			this.consumoEnergetico=f;
		}
	}
	public void precioFinal() {
		
	}
	public Electrodomestico() {
		this.color = blanco;
		this.consumoEnergetico = f;
		this.precioBase = base;
		this.peso = pesobase;
	}

	public Electrodomestico(int precio, int peso) {
		this.color = blanco;
		this.consumoEnergetico = f;
		this.precioBase = precio;
		this.peso = peso;
	}

	public Electrodomestico(int precio, int peso, String color, char consumoEnergetico) {
		comprobarColor(color);
		comprobarConsumo(consumoEnergetico);
		this.precioBase = precio;
		this.peso = peso;
	}
}
