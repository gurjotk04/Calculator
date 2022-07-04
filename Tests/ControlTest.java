package Tests;

public class ControlTest {
	
	public void testSum() {
		
		Calculator calculator = new Calculator();
		int result = calculator.sum(6, 2);
		if (result != 8) 
      {  // if 6 + 2 != 8
			Assert.fail();
		}
	}

    
}
