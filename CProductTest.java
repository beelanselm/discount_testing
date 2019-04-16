package ar.edu.ub.testing.Discount.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.ub.testing.Discount.CProduct;
import ar.edu.ub.testing.Discount.CBrand;
class CProductTest {


	@BeforeEach
	void setUp() throws Exception {
		CBrand brandTest = new CBrand("brandTest");
		ArrayList<String> arrayTest = new ArrayList();
		CProduct productTest = new CProduct(brandTest, arrayTest, "nombre", "descripcion");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
	void testCrearCProduct() {
		assertNotNull(productTest.brand());
		assertNotNull(productTest.name());
		assertNotNull(productTest.tags());
		assertNotEquals(false, productTest.hasTag(arrayTest.get(0)));
		assertNotNull(productTest.description());
	}
	
	
	void testBrand() {
		assertTrue(brandTest instanceof CBrand);
	}
	void testNombre() {
		assertEquals("nombre", productTest.name());

	}
	void testTags() {
		assertFalse(productTest.tags().size() != 0);
	}
	void testDescripcion() {
		assertEquals("descripcion", productTest.description() );
	}
	
	CBrand brandTest;
	ArrayList<String> arrayTest;
	CProduct productTest;
	
	
}
