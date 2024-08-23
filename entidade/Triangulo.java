package entidade;

public class Triangulo extends Forma {

	public Triangulo(double base, double largura, double altura) {
		super(base, 0, altura);
		// TODO Auto-generated constructor stub
	
	}
	public  double calcularArea() {
		return base * altura / 2;
	}
	@Override
	public String toString() {
		return mostrarInfo() + "\nÁrea Triangulo: " +calcularArea() ;
	}

}
