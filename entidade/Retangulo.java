package entidade;

public class Retangulo extends Forma  {

	public Retangulo(double base, double largura, double altura) {
		super(0, largura, altura);
		// TODO Auto-generated constructor stub
		
	}
	public double calcularArea() {
		return  largura * altura;
	}
	@Override
	public String toString() {
		return mostrarInfo() + "\nÁrea do Retangulo: " + calcularArea();
	}

}
