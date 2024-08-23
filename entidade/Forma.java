package entidade;

public class Forma {
	
	public double base;
	public double largura;
	public double altura;
	
	
	public Forma(double base, double largura, double altura) {
		this.base = base;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return 0;
	}
	
	public String mostrarInfo() {
		return "Base: " + base + "\nLargura: " +largura + "\nAltura: " + altura;
	}
	
	

}
