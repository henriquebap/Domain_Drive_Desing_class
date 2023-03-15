package ExercicioCalculadora;

public class CalculatorEx {
	//declarando atributos
	double n1;
	double n2;
	double result;

	//methods acessores e modificadores

	public void setN1(double n){
		n1 = n;
	}

	public double getN1(){
		return n1;
	}

	public void SetN2(double n){
		n2 = n;
	}
	public double getN2(){
		return n2;
	}

	public void setResult(double r){
		result = r;
	}

	public double getResult(){
		return result;
	}


	//methods operacionais

	public double add(double n1, double n2){
		double result = n1 + n2;
		return result;
	}

	public double sub(double n1, double n2){
		double result = n1 - n2;
		return result;
	}

	public double mult(double n1, double n2){
		return n1 * n2;
	}

	public double div(double n1, double n2){
		return n1 / n2;
	}

	


}
