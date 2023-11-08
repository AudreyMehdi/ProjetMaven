package veille2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import veille1.HomerSimpson;

public class TestHomer {
	@Test
	 public void Testdrinkbeer() {
		assertTrue(HomerSimpson.drinkBeer().contains("Duff"));
		//assertEquals(true, HomerSimpson.drinkBeer().contains("Duff")); 2eme method
	}
	
	@Test
	 public void Testeat() {
		/*assertEquals("I love donuts", */HomerSimpson.eat().contains("donuts");
	}
}