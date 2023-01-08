package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		Calculator obj=new Calculator();
		int output_f=obj.add(3, 4);
		assertEquals(8,output_f);
		
	}

}
