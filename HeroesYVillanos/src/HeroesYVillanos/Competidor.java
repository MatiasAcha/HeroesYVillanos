package HeroesYVillanos;

public abstract class Competidor implements Competible {
	private int fuerza;
	private int destreza;
	private int resistencia;
	private int velocidad;
	
	TipoCompetidor type;
	String nombre;
	String pseudo;
	
	public Competidor(TipoCompetidor type ,String nombreDeLiga) {
		this.type = type;
		this.nombre = nombreDeLiga;
		setFuerza(0);
		setDestreza(0);
		setResistencia(0);
		setVelocidad(0);
	}
	
	public Competidor(TipoCompetidor type ,String nombre, String pseudo, int fuerza, int destreza, int resistencia, int velocidad) {
		this.nombre = nombre;
		this.pseudo = pseudo;
		this.type = type;
		setFuerza(fuerza);
		setDestreza(destreza);
		setResistencia(resistencia);
		setVelocidad(velocidad);
	}

/*
 * FALTA COMPLETAR
 */
	public void Competir(Competidor otro) {

	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", pseudo=" + pseudo + ", fuerza=" + fuerza + ", destreza=" + destreza
				+ ", resistencia=" + resistencia + ", velocidad=" + velocidad + "]";
	}

	// ************Getters & Setters************
	public int getFuerza() {
		return fuerza;
	}
	
	
	public void setFuerza(int fuerza) {
		this.fuerza += fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza += destreza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia += resistencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad += velocidad;
	}

}