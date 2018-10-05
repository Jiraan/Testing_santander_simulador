import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TESTSC {

	@Test
	public void TestRut() {
		String r=Persona.rut("19260088k");
		String re = "19260088k";
		assertEquals(re,r);
	}
	@Test
	public void TestNombrem() {
		String r = Persona.nombre("carlos");
		String re = ("carlos");
		assertEquals(re,r);
	}
	@Test
	public void TestNombreM() {
		String r = Persona.nombre("Carlos");
		String re = ("Carlos");
		assertEquals(re,r);
	}
	@Test
	public void TestApellidoPm() {
		String r = Persona.apellidoP("contreras");
		String re = ("contreras");
		assertEquals(re,r);
	}@Test
	public void TestApellidoPM() {
		String r = Persona.apellidoP("Contreras");
		String re = ("Contreras");
		assertEquals(re,r);
	}
	@Test
	public void TestApellidoMm() {
		String r = Persona.apellidoM("silva");
		String re = ("silva");
		assertEquals(re,r);
	}
	@Test
	public void TestApellidoMM() {
		String r = Persona.apellidoM("Silva");
		String re = ("Silva");
		assertEquals(re,r);
	}
	@Test
	public void TestCorreom() {
		String r = Persona.correo("negrocontreras1997@gmail.com");
		String re = ("negrocontreras1997@gmail.com");
		assertEquals(re,r);
	}
	@Test
	public void TestCorreoM() {
		String r = Persona.correo("Negrocontreras1997@gmail.com");
		String re = ("Negrocontreras1997@gmail.com");
		assertEquals(re,r);
	}
	@Test
	public void TestTelefono() {
		int r = Persona.telefono(62471170);
		int re = 62471170;
		assertEquals(re,r);
	}
	@Test
	public void TestRegionm() {
		String r = Persona.region("metropolitana");
		String re = "metropolitana";
		assertEquals(re,r);
	}
	@Test
	public void TestRegionM() {
		String r = Persona.region("Metropolitana");
		String re = "Metropolitana";
		assertEquals(re,r);
	}
	@Test
	public void TestComunam() {
		String r = Persona.comuna("la florida");
		String re = "la florida";
		assertEquals(re,r);
	}
	@Test
	public void TestComunaM() {
		String r = Persona.comuna("La Florida");
		String re = "La Florida";
		assertEquals(re,r);
	}
	@Test
	public void TestValorPropiedad() {
		int r = Banco.valorPropiedad(2000);
		int re = 2000;
		assertEquals(re,r);
	}
	@Test
	public void TestAporteContado() {
		int r = Banco.aporteContadooPie(500);
		int re = 500;
		assertEquals(re,r);
	}
	@Test
	public void TesMontoFinanciamiento() {
		int r = Banco.montoFinanciamiento(8000, 6000);
		int re = 2000;
		assertEquals(re,r);
	}
	@Test
	public void TestPorcentaje() {
		int r = Banco.porcentaje(8000, 6000);
		int re = 25;
		assertEquals(re,r);
	}
}
