package aula02; //

public class Aula02 {

	public static void main(String[] args) {

		Caneta1 c1 = new Caneta1();
		c1.cor = " Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		Caneta1 c2 = new Caneta1();
		c2.cor = "rosa";
		c2.ponta = 1.0f;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
