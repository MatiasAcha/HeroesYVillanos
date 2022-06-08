package combates;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class MenuDeCombatesTest {

	@Test
	public void compiteHeroeCOntraVIllanoGanaHeroe() throws IOException, TipoDeCompetidorInvalidoException, NoHayArchivoDeEntrada, YaEstoyEnLigaException, CaracteristicaNegativaException {
		
		Competidor heroe = new Personaje(true, "Julian","El Invatible", 900, 800, 1000, 900);
		Competidor villano = new Personaje(false, "Patricio","Mr Musculo", 600, 790, 800, 900);
		
		Assert.assertFalse(heroe.esGanador(villano));
	}
	
	@Test
	public void compiteHeroeCOntraVIllanoGanaVillano() throws IOException, TipoDeCompetidorInvalidoException, NoHayArchivoDeEntrada, YaEstoyEnLigaException, CaracteristicaNegativaException {
		
		Competidor heroe = new Personaje(true , "Julian","El Invatible", 600, 900, 600, 900);
		Competidor villano = new Personaje(false, "Patricio","Mr Musculo", 900, 800, 1000, 900);
		
		Assert.assertFalse(heroe.esGanador(villano));
	
	}

}
