package entities;

public class Curso extends Conteudo {

	
	private int cargaHoraria;
	
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso de " + getTitulo() + ",\n descricao = " + getDescricao() + " \n cargaHoraria = " + cargaHoraria ;
	}
	@Override
	public double calcularXp() {
		
		return XP_PADRAO * cargaHoraria;
	}
	
	
	
}
