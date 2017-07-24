//∂‡Ã¨demo

abstract class Bus{
	public abstract void in();
	public void out(){
		System.out.println("put money");
	}
}
 
class By{
	public void come(Bus bus){
		bus.in();
		bus.out();
	}
}

class Old extends Bus{
	public void in(){
		System.out.println("old bus put 1 yuan");
	}
	public void out(){
		System.out.println("slowly");
	}
}

class young extends Bus{
	public void in(){
		System.out.println("young car put 2 yuan");
	}
	public void out(){
		System.out.println("quickly");
	}
}


public class DuoTaiDemo {
	public static void main(String[] args){
		By bus = new By();
		bus.come(new Old());
		bus.come(new young());
	}

}
