package TestFiles;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import SourceFiles.WatermelonDivider;






public class WatermelonTests {
	
	@Test
	public void Test1() {
		int w = 8;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test2() {
		int w = 5;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test3() {
		int w = 4;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test4() {
		int w = 3;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test5() {
		int w = 2;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test6() {
		int w = 1;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test7() {
		int w = 7;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test8() {
		int w = 6;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test9() {
		int w = 10;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test10() {
		int w = 9;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test11() {
		int w = 53;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test12() {
		int w = 77;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test13() {
		int w = 32;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test14() {
		int w = 44;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test15() {
		int w = 98;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test16() {
		int w = 99;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test17() {
		int w = 90;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test18() {
		int w = 67;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("NO", d.Divide(w));
	
	}
	@Test
	public void Test19() {
		int w = 100;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	@Test
	public void Test20() {
		int w = 88;
		WatermelonDivider d = new WatermelonDivider();
		assertEquals("YES", d.Divide(w));
	
	}
	

}
