package qaTest;

import org.testng.annotations.Test;

public class priorty {

//	@Test
//	public void a() {
//		System.out.println("a");
//	}
//	@Test
//	public void b() {
//		System.out.println("b");
//	}
//	@Test
//	public void c() {
//		System.out.println("c");
//	}
	@Test(priority=0)
	public void z() {
		System.out.println("hi");
	}
	@Test(priority=3)
	public void a() {
		System.out.println("hello");
	}
}
