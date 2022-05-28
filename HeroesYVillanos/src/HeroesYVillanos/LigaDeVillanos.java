package HeroesYVillanos;

import java.util.ArrayList;
import java.util.List;

public class LigaDeVillanos extends Competidor {
	List<Villano> ligaDeVillanos = new ArrayList<Villano>();

public LigaDeVillanos(String nombreDeLiga) {
	super(TipoCompetidor.VILLANO ,nombreDeLiga);
}

/*
 * Aniade a la liga un villano y suma los atributos de este a la liga.
 */
public void addVillano(Villano villano) {
	ligaDeVillanos.add(villano);
	setFuerza(villano.getFuerza());
	setDestreza(villano.getDestreza());
	setResistencia(villano.getResistencia());
	setVelocidad(villano.getVelocidad());
}

/*
 * FALTA COMPLETAR
 */
public void Competir(Competidor villano) {

}

/*
 * Devuelve el promedio del atributo dado como parámetro.
 */
public int getPromedio(int atributo) {
	int Promedio = 0;
	if(ligaDeVillanos.size() > 0) {
	Promedio = atributo/ligaDeVillanos.size();
	}
	return Promedio;
}

}
