package HeroesYVillanos;

public class Heroe extends Competidor {

	public Heroe(String nombre, String pseudo, int fuerza, int destreza, int resistencia, int velocidad) {
		super(TipoCompetidor.HEROE, nombre, pseudo, fuerza, destreza, resistencia, velocidad);
	}
	
	@Override
	public String toString() {
		return type + super.toString();
	}
	
	/*
	 * FALTA COMPLETAR
	 */
	public void Competir(Competidor villano) {

	}
}
