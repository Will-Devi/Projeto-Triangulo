package ds;

public class Triangulo {
	
	public double lado1;
	public double lado2;
	public double lado3;

	
	
	private String tipo;
	private Double perimetro;
	private Double area;
	
	public boolean isTriangle() {
		
		if (lado1 < (lado2 + lado3) && lado2<(lado1 + lado3) && lado3 <(lado1 + lado2)) {
				return true;
		}
		return false;
	
	}
	
	
	///////////////////////
	///
	public double calcularPerimetro() {
		
		return perimetro = lado1 + lado2 + lado3;
	}
	
	
	///////////////////////
	
	public String classificar() {
		
		if( lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
		return "equilátero";
		} 
		
		else if (lado1 != lado2 && lado1!=lado3 && lado3!=lado2){
			return "escaleno";
					
				}
					
		else {	return"isósceles";}
				
	}
	
				/////////////
		public double calcularArea() {
			
			double sp = perimetro/2;
			
		area =	Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
			
		return area;
		}
				
		


}
