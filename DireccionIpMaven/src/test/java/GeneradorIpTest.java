

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.cuatrovientos.ip.GeneradorIp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GeneradorIpTest extends TestCase {

	public GeneradorIpTest(String testMethodName) {
		super(testMethodName);
	}

	

	public void GenerarNumero() {
		
		GeneradorIp target = new GeneradorIp();
		int numero2 = target.generarNumero(0, 254);
		int numeroComprobacion;
		if (numero2 >= 0 && numero2 <= 254) {
			numeroComprobacion = numero2;
		} else {
			numeroComprobacion = 0;
		}
		
		int expected = numeroComprobacion;
		int actual = numero2;
		assertEquals("numero aleatorio entre 0 y 254",expected, actual);
	}
	
	public void GenerarDireccion() {
		GeneradorIp target = new GeneradorIp();
		boolean comprobacion;
		
		String direccionIp;
		direccionIp = target.generarIp();
		
		if (direccionIp.charAt(0) != '0' && direccionIp.charAt(direccionIp.length() -1) != '0') {
			comprobacion = true;
		} else {
			comprobacion = false;
		}
		boolean expected = true;
		boolean actual = comprobacion;
		assertEquals("compracion si la direccion comienza o finaliza con 0", expected, actual);
	}
	


	
	
	@Test
	public static TestSuite suite() {
		
		TestSuite mySuite = new ActiveTestSuite();
		
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("GenerarNumero"), 1000));
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("GenerarDireccion"), 1));
		return mySuite;
		
	}

}
