package interfaccia;

public interface IOperazione {

	public boolean minoreDi(int a, int b);
	public boolean minoreDi(double a, double b);
	
	public boolean maggioreDi(int a, int b);
	public boolean maggioreDi(double a, double b);
	
	public double calcolaEsponenziale(double num, int esponente);
	
	public double calcolaRadice(double num);
	
	public double calcolaDifferenza(double num1, double num2);
	public double calcolaDifferenza(int num1, int num2);
	
}
