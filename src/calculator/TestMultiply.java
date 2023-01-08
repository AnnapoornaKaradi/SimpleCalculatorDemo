package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void test() {
		Calculator obj=new Calculator();
		int output_f=obj.multiply(3, 4);
		assertEquals(13,output_f);
	}

}
