package comCal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class Mycal {

//	@Test
//	@Timeout(2)
//	void testadd() {
//		Cal c = new Cal();
//		assertEquals(300, c.add(100,200));
//
//	}
	@Test
	@Timeout(2)
	void testadd1() throws InterruptedException  {
		Cal c = new Cal();
		Thread.sleep(3000);
		assertEquals(300, c.add(100,200));

	}

}
