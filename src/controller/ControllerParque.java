package controller;

import model.Fila;
import model.Pessoa;

public class ControllerParque {

	public ControllerParque() {
		super();
	}

	public void brinquedo(Fila<Pessoa> p) {
		try {

			if (p.isEmpty()) {
				System.err.println("Fila vazia");
			} else {

				do {
					Pessoa aux = p.remove();
					String msg = "Nome:" + aux.Nome;
					if (aux.Altura < 1.60 || aux.Idade < 16) {
						msg = msg + " - Não entrou pois: ";

						if (aux.Altura < 1.60) {
							msg = msg + "tem menos que 1.6m -";
						}
						
						if (aux.Idade < 16) {
							msg = msg + "tem menos que 16 anos";
						}		

					} else {
						msg = msg + " - Entrou no Brinquedo";
					}

					System.out.println(msg);
				} while (!p.isEmpty());
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
