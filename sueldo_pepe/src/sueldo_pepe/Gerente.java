package sueldo_pepe;

public class Gerente extends Empleado {

	//private int sueldoNeto;

	public Gerente(int faltas, String desempeño) {
		super(faltas, desempeño);
		this.setSueldoNeto(1500);
	}
	
	@Override
	public void presentismo() {
		if(this.getFaltas()==0) {
			this.setBonoPresentismo(100);
		}else if(this.getFaltas()==1){
			this.setBonoPresentismo(50);
		}else {
			this.setBonoPresentismo(0);
		}
		System.out.println("su bono por presentismo es de $"+ this.getBonoPresentismo());
	}
	
	@Override
	public void desempeño() {
		if(this.getDesempeño()== "muy bueno") {
			this.setBonoDesempeño(this.getSueldoNeto()*0.1);
		}else if(this.getDesempeño()== "bueno"){
			this.setBonoDesempeño(80);
		}else {
			this.setBonoDesempeño(0);
		}
		System.out.println("su bono por desempeño es de $"+ this.getBonoDesempeño());
	}
	
	@Override
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempeño());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}
	
	

}
