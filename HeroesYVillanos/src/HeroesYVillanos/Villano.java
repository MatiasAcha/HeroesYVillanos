package HeroesYVillanos;

public class Villano extends Competidor{

	public Villano(String nombre, String pseudo, int fuerza, int destreza, int resistencia, int velocidad) {
		super(TipoCompetidor.VILLANO, nombre, pseudo, fuerza, destreza,  resistencia, velocidad);
	}
	
	@Override
	public String toString() {
		return type + super.toString();
	}
	
	/*
	 * FALTA COMPLETAR
	 */
	public void Competir(Competidor heroe) {
		
	}
}
