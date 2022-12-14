package sueldo_pepe;

public abstract class Empleado {
	
	private int faltas;
	private String desempeņo;
	private int bonoPresentismo;
	private double bonoDesempeņo;
	private int sueldoNeto;
	private double sueldoTotal;
	
	public Empleado(int faltas, String desempeņo) {
		super();
		this.faltas = faltas;
		this.desempeņo = desempeņo;
		this.bonoPresentismo = 0;
		this.bonoDesempeņo = 0;
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





	public double getBonoDesempeņo() {
		return bonoDesempeņo;
	}





	public void setBonoDesempeņo(double bonoDesempeņo) {
		this.bonoDesempeņo = bonoDesempeņo;
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

	public String getDesempeņo() {
		return desempeņo;
	}

	public void setDesempeņo(String desempeņo) {
		this.desempeņo = desempeņo;
	}

	@Override
	public String toString() {
		return "Empleado [faltas=" + faltas + ", desempeņo=" + desempeņo + ", bonoPresentismo=" + bonoPresentismo
				+ ", bonoDesempeņo=" + bonoDesempeņo + ", sueldoNeto=" + sueldoNeto + ", sueldoTotal=" + sueldoTotal
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
	
	public void desempeņo() {
		if(this.getDesempeņo()== "muy bueno") {
			this.setBonoDesempeņo(bonoDesempeņo);
		}else if(this.getDesempeņo()== "bueno"){
			this.setBonoDesempeņo(bonoDesempeņo);
		}else {
			this.setBonoDesempeņo(bonoDesempeņo);
		}
	}
	
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempeņo());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}





	
	
	
}
