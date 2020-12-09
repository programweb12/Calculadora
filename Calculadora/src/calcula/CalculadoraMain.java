package calcula;

public class CalculadoraMain {

	private Calculadora calc;

	// No entiendo el por qué se establece métodos getter y setter aquí

	public Calculadora getCalc() {
		return calc;
	}

	public void setCalc(Calculadora calc) {
		this.calc = calc;
	}

	//public static String cMensaje;
	
	public double calcular() {

		double nResultado = 0;

		switch (calc.getOpcion()) {
		case "1":
			nResultado = calc.sumar(calc.getOperador1(), calc.getOperador2());
			break;
		case "2":
			nResultado = calc.restar(calc.getOperador1(), calc.getOperador2());
			break;
		case "3":
			nResultado = calc.multiplicacion(calc.getOperador1(), calc.getOperador2());
			break;
		case "4":
			nResultado = calc.division(calc.getOperador1(), calc.getOperador2());
			break;
		case "5":
			nResultado = calc.resto(calc.getOperador1(), calc.getOperador2());
		}
		return nResultado;
	}

}
