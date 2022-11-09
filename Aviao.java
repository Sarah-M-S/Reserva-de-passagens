package reserva_de_passagens;

public class Aviao extends Aeronave {

	public Aviao(String modelo, int fileiras, int assentos) {
		
		super(modelo);

		this.lugares = new String [fileiras][assentos];

	}

	String lugares[][];
}
