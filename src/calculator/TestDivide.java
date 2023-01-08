package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivide {

	@Test
	public void test() {
		Calculator obj=new Calculator();
		 int output_f=obj.divide(4 ,0);
		assertEquals(0,output_f);
	}

}
