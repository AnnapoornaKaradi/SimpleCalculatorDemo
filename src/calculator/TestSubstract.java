package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubstract {

	@Test
	public void test() {
		Calculator obj=new Calculator();
		int output_f=obj.substract(5, 4);
		assertEquals(2,output_f);
	}

}
