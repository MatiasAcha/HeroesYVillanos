package HeroesYVillanos;

import java.util.ArrayList;
import java.util.List;

public class LigaDeHeroes extends Competidor {
List<Heroe> ligaDeHeroes = new ArrayList<Heroe>();

public LigaDeHeroes(String nombreDeLiga) {
	super(TipoCompetidor.HEROE, nombreDeLiga);
}

/*
 * Aniade a la liga un heroe y suma los atributos de este a la liga.
 */
public void addHeroe(Heroe heroe) {
	ligaDeHeroes.add(heroe);
	setFuerza(heroe.getFuerza());
	setDestreza(heroe.getDestreza());
	setResistencia(heroe.getResistencia());
	setVelocidad(heroe.getVelocidad());
}

/*
 * FALTA COMPLETAR
 */
public void Competir(Competidor villano) {

}

public int getPromedio(int atributo) {
	int promedio = 0;
	if(ligaDeHeroes.size() > 0) {
		promedio = atributo/ligaDeHeroes.size();
	}
	return promedio;
}


}
