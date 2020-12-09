package calcula;

public class Calculadora {
	private double operador1;
	private double operador2;
	private String opcion;

	public static String cMensaje;
	
	public Calculadora() {
	}

	public Calculadora(double operador1, double operador2, String opcion) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		this.opcion = opcion;
	}

	public double getOperador1() {
		return operador1;
	}

	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}

	public double getOperador2() {
		return operador2;
	}

	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public double sumar(double a, double b) {
		double suma = a + b;
		return suma;
	}

	public double restar(double a, double b) {
		double resta = a - b;
		return resta;
	}

	public double multiplicacion(double a, double b) {
		double multiplica = a * b;
		return multiplica;
	}

	public double division(double a, double b) {
		if (b == 0) {
			cMensaje = "No se puede dividir entre cero.";
			// System.out.println("El segundo operador no puede tener valor 0");
			return 0;
		} else {
			double divide = a / b;
			return divide;
		}
	}

	public double resto(double a, double b) {
		double resto = a % b;
		return resto;
	}

}
