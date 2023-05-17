package test;

public class inter3 implements Inter1,inter2 {

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("multi");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("division");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("adding");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("subtract");
		
	}
	public static void main(String[] args) {
		inter3 a = new inter3();
		a.mul();
		a.div();
		a.sub();
		a.sum();
	}
	   
			
}
