package combates;

public abstract class Competidor implements Comparable<Competidor> {

	private boolean estoyEnLiga;
	private boolean tipo;


	private String pseudo = "";
	private String nombre = "";

	private Caracteristicas caracteristicas;

	

	public Competidor(boolean tipo, String nombreDeLiga) throws CaracteristicaNegativaException {
		this.tipo = tipo;
		this.nombre = nombreDeLiga;
		caracteristicas = new Caracteristicas(0, 0, 0, 0);
	}

	public Competidor(boolean tipo ,String nombre, String pseudo, int velocidad, int fuerza, int resistencia, int destreza) throws CaracteristicaNegativaException {
		this.tipo = tipo;
		setNombre(nombre);
		setPseudo(pseudo);
		caracteristicas = new Caracteristicas(fuerza, destreza, velocidad, resistencia);
	}
	
	public boolean esGanador(Competidor otroCompetidor) {
		if(this.compareTo(otroCompetidor) == 1) {
		return true;	
		}
		else return false;
		
		
	}
	
	public int compareTo(Competidor otroCompetidor) {
		return this.caracteristicas.compareTo(otroCompetidor.caracteristicas);
	}


	public abstract String toString();

	public boolean getEstoyEnLiga() {
 		return estoyEnLiga;
 	}
 
 	public void setEstoyEnLiga(boolean estoyEnLiga) {
 		this.estoyEnLiga = estoyEnLiga;
 	}
 
	public Caracteristicas getTodasLasCaracteristicas() {
		return caracteristicas;
	}
	
	public int obtenerCaracteristica(Caracteristica c) {
		return caracteristicas.getCaracteristica(c);
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean esHeroe() {
		return tipo;
	}

	
}
