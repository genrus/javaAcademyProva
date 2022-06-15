package implementazione;

import interfaccia.IOperazione;

public class Operazione implements IOperazione {

	@Override
	public boolean minoreDi(int a, int b) {
		if(a < b)
			return true;
		 
		return false;
	}

	@Override
	public boolean minoreDi(double a, double b) {
		if(a < b)
			return true;
		 
		return false;
	}

	@Override
	public boolean maggioreDi(int a, int b) {
		if(a > b)
			return true;
		 
		return false;
	}

	@Override
	public boolean maggioreDi(double a, double b) {
		if(a > b)
			return true;
		 
		return false;
	}

	@Override
	public double calcolaEsponenziale(double num, int esponente) {
		
		return Math.pow(num, esponente);
		
	}

	@Override
	public double calcolaRadice(double num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcolaDifferenza(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcolaDifferenza(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
