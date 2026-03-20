package ds2;

import javax.swing.JOptionPane;

import ds.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo objTriangulo = new Triangulo();
		
		objTriangulo.lado1= Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro lado"));
		objTriangulo.lado2= Double.parseDouble(JOptionPane.showInputDialog("informe o segundo lado"));
		objTriangulo.lado3= Double.parseDouble(JOptionPane.showInputDialog("informe o terceiro lado"));
		
		if (objTriangulo.isTriangle()) {
			
			JOptionPane.showMessageDialog(null,
					"perimetro " + objTriangulo.calcularPerimetro() +
			 "\ntipo " + objTriangulo.classificar() 
			+ "\narea " + objTriangulo.calcularArea() );
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "não é um triangulo");
		}
		}

	}


