package sueldo_pepe;

public class Cadete extends Empleado {

	private int sueldoNeto;

	public Cadete(int faltas, String desempeņo) {
		super(faltas, desempeņo);
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
	public void desempeņo() {
		if(this.getDesempeņo()== "muy bueno") {
			this.setBonoDesempeņo(sueldoNeto*0.1);
		}else if(this.getDesempeņo()== "bueno"){
			this.setBonoDesempeņo(80);
		}else {
			this.setBonoDesempeņo(0);
		}
		System.out.println("su bono por desempeņo es de $"+ this.getBonoDesempeņo());
	}
	
	@Override
	public void sueldo() {
		
		this.setSueldoTotal(this.getSueldoNeto() + this.getBonoPresentismo() + this.getBonoDesempeņo());
		System.out.println("el sueldo total es de $" + this.getSueldoTotal());
		
	}
	
	

}
