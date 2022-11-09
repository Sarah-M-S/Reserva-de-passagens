package reserva_de_passagens;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao tecoteco = new Aviao("tecoteco", 1, 2);
		tecoteco.lugares[0][0] = "Sarah";
		tecoteco.lugares[0][1] = "Davi";

		System.out.println(tecoteco.lugares[0][0]);
	}


}
