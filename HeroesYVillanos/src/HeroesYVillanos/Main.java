package HeroesYVillanos;

public class Main {
public static void main(String[] args) {
	Heroe capAmerica = new Heroe("Capitan América","Steve Rogers", 120, 282, 48, 99) ;
	Heroe thor = new Heroe("Thor", "Thor", 200, 70, 182, 68);
	Heroe spiderMan = new Heroe("SpiderMan", "Peter Parker", 80, 210, 72, 189);
	LigaDeHeroes ligaUno = new LigaDeHeroes("Liga Uno");
	ligaUno.addHeroe(capAmerica);
	ligaUno.addHeroe(thor);
	ligaUno.addHeroe(spiderMan);

	System.out.println(ligaUno.ligaDeHeroes.size());
	System.out.println(capAmerica.toString());
	System.out.println(ligaUno.toString());
	System.out.println("Promedio Fuerza: " + ligaUno.getPromedio(ligaUno.getFuerza()));
	System.out.println("Promedio Destreza: " + ligaUno.getPromedio(ligaUno.getDestreza()));
	System.out.println("Promedio Resistencia: " + ligaUno.getPromedio(ligaUno.getResistencia()));
	System.out.println("Promedio Velocidad: " + ligaUno.getPromedio(ligaUno.getVelocidad()));
	
	System.out.println("");
	
	Villano loki = new Villano("Loki","Loki", 90, 122, 48, 169) ;
	Villano cerbero = new Villano("Cerbero", "Cerbero", 200, 66, 200, 40);
	LigaDeVillanos ligaDos = new LigaDeVillanos("Liga Dos");
	ligaDos.addVillano(loki);
	ligaDos.addVillano(cerbero);

	System.out.println(ligaDos.ligaDeVillanos.size());
	System.out.println(loki.toString());
	System.out.println(ligaDos.toString());
	System.out.println("Promedio Fuerza: " + ligaDos.getPromedio(ligaDos.getFuerza()));
	System.out.println("Promedio Destreza: " + ligaDos.getPromedio(ligaDos.getDestreza()));
	System.out.println("Promedio Resistencia: " + ligaDos.getPromedio(ligaDos.getResistencia()));
	System.out.println("Promedio Velocidad: " + ligaDos.getPromedio(ligaDos.getVelocidad()));
}
}
