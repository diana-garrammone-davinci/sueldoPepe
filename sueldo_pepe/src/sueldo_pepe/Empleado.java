package sueldo_pepe;

public abstract class Empleado {
	
	private int faltas;
	private String desempeño;
	private int bonoPresentismo;
	private double bonoDesempeño;
	private int sueldoNeto;
	private double sueldoTotal;
	
	public Empleado(int faltas, String desempeño) {
		super();
		this.faltas = faltas;
		this.desempeño = desempeño;
		this.bonoPresentismo = 0;
		this.bonoDesempeño = 0;
		this.setSueldoNeto(0);
		this.sueldoTotal = 0;
	}
	
	public double getSueldoTotal() {
		return sueldoTotal;
	}





	public void setSueldoTotal(double sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}
	
	


	public int getSueldoNeto() {
		return sueldoNeto;
	}





	public void setSueldoNeto(int sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}





	public double getBonoDesempeño() {
		return bonoDesempeño;
	}





	public void setBonoDesempeño(double bonoDesempeño) {
		this.bonoDesempeño = bonoDesempeño;
	}





	public int getBonoPresentismo() {
		return bonoPresentismo;
	}




	public void setBonoPresentismo(int bonoPresentismo) {
		this.bonoPresentismo = bonoPresentismo;
	}




	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getDesempeño() {
		return desempeño;
	}

	public void setDesempeño(String desempeño) {
		this.desempeño = desempeño;
	}

	@Override
	public String toString() {
		return "Empleado [faltas=" + faltas + ", desempeño=" + desempeño + ", bonoPresentismo=" + bonoPresentismo
				+ ", bonoDesempeño=" + bonoDesempeño + ", sueldoNeto=" + sueldoNeto + ", sueldoTotal=" + sueldoTotal
				+ "]";
	}
	
	
	
	public void presentismo() {
		if(this.getFaltas()==0) {
			this.setBonoPresentismo(100);
		}else if(this.getFaltas()==1){
			this.setBonoPresentismo(50);
		}else {
			this.setBonoPresentismo(0);
		}
	}
	
	public void desempeño() {
		if(this.getDesempeño()== "muy bueno") {
			this.setBonoDesempeño(bonoDesempeño);
		}else if(this.getDesempeño()== "bueno"){
			this.setBonoDesempeño(bonoDesempeño);
		}else {
			this.setBonoDesempeño(bonoDesempeño);
		}
	}
	
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempeño());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}





	
	
	
}
