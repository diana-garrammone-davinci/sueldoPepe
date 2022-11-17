package sueldo_pepe;

public abstract class Empleado {
	
	private int faltas;
	private String desempe�o;
	private int bonoPresentismo;
	private double bonoDesempe�o;
	private int sueldoNeto;
	private double sueldoTotal;
	
	public Empleado(int faltas, String desempe�o) {
		super();
		this.faltas = faltas;
		this.desempe�o = desempe�o;
		this.bonoPresentismo = 0;
		this.bonoDesempe�o = 0;
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





	public double getBonoDesempe�o() {
		return bonoDesempe�o;
	}





	public void setBonoDesempe�o(double bonoDesempe�o) {
		this.bonoDesempe�o = bonoDesempe�o;
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

	public String getDesempe�o() {
		return desempe�o;
	}

	public void setDesempe�o(String desempe�o) {
		this.desempe�o = desempe�o;
	}

	@Override
	public String toString() {
		return "Empleado [faltas=" + faltas + ", desempe�o=" + desempe�o + ", bonoPresentismo=" + bonoPresentismo
				+ ", bonoDesempe�o=" + bonoDesempe�o + ", sueldoNeto=" + sueldoNeto + ", sueldoTotal=" + sueldoTotal
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
	
	public void desempe�o() {
		if(this.getDesempe�o()== "muy bueno") {
			this.setBonoDesempe�o(bonoDesempe�o);
		}else if(this.getDesempe�o()== "bueno"){
			this.setBonoDesempe�o(bonoDesempe�o);
		}else {
			this.setBonoDesempe�o(bonoDesempe�o);
		}
	}
	
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempe�o());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}





	
	
	
}
