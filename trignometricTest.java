import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class trignometricTest {

	//First Testing case for checking degToRadConverter method.
	@Test
	public void degToRadConverterTest1() {
		assertEquals(Math.toRadians(370),trignometric.degreeToRadianConverter(370),0.0001);		
	}
	
	//Second Testing case for checking degToRadConverter method.
	@Test
	public void degToRadConverterTest2() {
		assertEquals(Math.toRadians(-260), trignometric.degreeToRadianConverter(-260),0.0001);
	}
	
	//Third Testing case for checking degToRadConverter method.
	@Test
	public void degToRadConverterTest3() {
		assertEquals(Math.toRadians(30), trignometric.degreeToRadianConverter(30),0.0001);
	}
	
	//First Testing case for checking normRadian method.
	@Test
	public void normRadianTest1() {
		assertEquals(5.8849, trignometric.normalizeRadian(75), 0.0001);
	}
	
	//Second Testing case for checking normRadian method.
	@Test
	public void normRadianTest2() {
		assertEquals(-6.0177, trignometric.normalizeRadian(-50), 0.0001);
	}
	
	//Third Testing case for checking normRadian method.
	@Test
	public void normRadTest3() {
		assertEquals(-1.0177, trignometric.normalizeRadian(-45), 0.0001);
	}
	
	//First Testing case for checking sin method.
	@Test
	public void sinTestcase1() {
		assertEquals(Math.sin(400), trignometric.sin(400), 0.0001);
	}
	
	//Second Testing case for checking sin method.
	@Test
	public void sinTestcase2() {
		assertEquals(Math.sin(Math.toRadians(60)), trignometric.sin(trignometric.degreeToRadianConverter(60)),0.0001);
	}
	
	//Third Testing case for checking sin method.
	@Test
	public void sinTestcase3() {
		assertEquals(Math.sin(-1.27), trignometric.sin(-1.27),0.0001);
	}
	
	//First Testing case for checking cos method.
	@Test
	public void cosTestcase1(){
		assertEquals(Math.cos(30), trignometric.cos(30), 0.0001);
	}
	
	//Second Testing case for checking cos method.
	@Test
	public void cosTestcase2(){
		assertEquals(Math.cos(Math.toRadians(400)), trignometric.cos(trignometric.degreeToRadianConverter(400)),0.0001);
	}
	
	//Third Testing case for checking cos method.
	@Test
	public void cosTestcase3(){
		assertEquals(Math.cos(-25), trignometric.cos(-25), 0.0001);
	}
	
	//First Testing case for checking tan method.
	@Test
	public void tanTestcase1() {
		assertEquals(Math.tan(400), trignometric.tan(400), 0.0001);
	}
	
	//Second Testing case for checking tan method.
	@Test
	public void tanTestcase2() {
		assertEquals(Math.tan(Math.toRadians(45)), trignometric.tan(trignometric.degreeToRadianConverter(45)),0.0001);
	}
	
	//Third Testing case for checking tan method.
	@Test
	public void tanTestcase3() {
		assertEquals(Math.sin(-0.75),trignometric.sin(-0.75),0.0001);
	}

}
