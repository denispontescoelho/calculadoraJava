package estudo;

public class Calculadora {

	public double numero1 = 0;
	public double numero2 = 0;
	public double resultadoAcumulado = 0;
	public String ce;
	public String operação = "";
	public String ponto;
	public String igual;
	
	
	

	public double Somar(double x, double y) {
		double resultadoDaSoma = 0;
		resultadoDaSoma = x + y;
		return resultadoDaSoma;
	}

	public double Subtracao( double x, double y) {
		double resultadodaSubtracao = 0;
		resultadodaSubtracao= x - y;
		return resultadodaSubtracao;
	}
	
	public double Multiplicacao(double x, double y) {
		double resultadodaMultiplicacao = 0;
		resultadodaMultiplicacao = x * y;
		return resultadodaMultiplicacao;
	}
	
	public double Divisao(double x, double y) {
		double resultadodaDivisao = 0;
		resultadodaDivisao = x / y;
		return resultadodaDivisao;
	}
	
	public double SomarAcumulado(double k) {
		resultadoAcumulado = Somar(resultadoAcumulado, k);
		return resultadoAcumulado; 
	}
	
	public double SubtracaoAcumulado(double k) {
		resultadoAcumulado = Subtracao(resultadoAcumulado, k);
		return resultadoAcumulado; 
		
	}
	
	public double MultiplicacaoAcumulado(double k) {
		resultadoAcumulado = Multiplicacao(resultadoAcumulado, k);
		return resultadoAcumulado; 
	}
	
	public double DivisaoAcumulado(double k) {
		resultadoAcumulado = Divisao(resultadoAcumulado, k);
		return resultadoAcumulado; 
	}
	
	public void Zerar() {
		resultadoAcumulado = 0;
	}
	
	
	
	
	
}
