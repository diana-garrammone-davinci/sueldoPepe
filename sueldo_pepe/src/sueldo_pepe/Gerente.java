package sueldo_pepe;

public class Gerente extends Empleado {

	//private int sueldoNeto;

	public Gerente(int faltas, String desempeņo) {
		super(faltas, desempeņo);
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
	public void desempeņo() {
		if(this.getDesempeņo()== "muy bueno") {
			this.setBonoDesempeņo(this.getSueldoNeto()*0.1);
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
