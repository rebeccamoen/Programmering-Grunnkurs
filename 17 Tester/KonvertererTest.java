import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class KonvertererTest {

	/*
	 * @Test
	 * public void NOE(){
	 * KODE;
	 * KODE;
	 * fail(); og/eller assert();
	 * }
	 */
	Konverterer k=null;
	@Before
	public void setUp(){
		//Dette skjer før testen
		k = new Konverterer();
	}
	
	@After
	public void finished(){
		System.out.println("Ferdig med testing");
	}
	
	@Test
	public void testKilometerTilMeter(){
		//Konverterer k = new Konverterer();
		if(k.kilometerTilMeter(1)!=1000){
			fail();
		}
		if(k.kilometerTilMeter(-2)!=-2000){
			fail();
		}
	}
	
	@Test
	public void testKilometerTilMeter2(){
		//Konverterer k = new Konverterer();
		assertTrue(1000==k.kilometerTilMeter(1));
	}
	
	@Test
	public void testKilomenterTilMeter3(){
		//Konverterer k = new Konverterer();
		assertEquals(1000,k.kilometerTilMeter(1),0);
	}
	
	@Test
	public void testUtslipp(){
		Konverterer k = new Konverterer();
		assertEquals(0,k.utslipp(100, "elbil"),0.01);
		assertEquals(12,k.utslipp(100, "bensin"),0.01);
	}
	
	@Test
	public void testLovlig(){
		Konverterer k = new Konverterer();
		if(k.lovlig(16)!=false){
			fail("16 skal ikke komme inn");
		}
		if(k.lovlig(18)!=true){
			fail("18 skal komme inn");
		}
		if(k.lovlig(19)!=true){
			fail("19 skal komme inn");
		}
	}
	
	@Test
	public void testValuta(){
		Konverterer k = new Konverterer();
		double kurs = 7.0;
		double kroner = 100;
		double dollar = k.konverterValuta(kroner,kurs);
		assertEquals(14.28,dollar,0.1);
	}
	
	/*@Test(timeout=1000)
	public void testEvigLokke(){
		Konverterer k = new Konverterer();
		if(!k.evigLokke()){
			fail("Noe feilet");
		}
	}*/

}