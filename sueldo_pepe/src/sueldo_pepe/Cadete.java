package sueldo_pepe;

public class Cadete extends Empleado {

	private int sueldoNeto;

	public Cadete(int faltas, String desempe�o) {
		super(faltas, desempe�o);
		this.sueldoNeto = 1000;
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
	public void desempe�o() {
		if(this.getDesempe�o()== "muy bueno") {
			this.setBonoDesempe�o(sueldoNeto*0.1);
		}else if(this.getDesempe�o()== "bueno"){
			this.setBonoDesempe�o(80);
		}else {
			this.setBonoDesempe�o(0);
		}
		System.out.println("su bono por desempe�o es de $"+ this.getBonoDesempe�o());
	}
	
	@Override
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempe�o());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}
	
	

}
