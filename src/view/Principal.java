package view;

import controller.ControllerParque;
import model.Fila;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> pessoa = new Fila<>();
		
		ControllerParque cp = new ControllerParque();
		
		for (int i = 1; i < 31; i++) {
			Pessoa p = new Pessoa();
			p.Nome = "Pessoa" + i;
			p.Altura = (float)((Math.random()*0.66)+1.35);
			p.Idade = (int)(Math.random()*31)+10;
			pessoa.insert(p);
		}


		
		
		cp.brinquedo(pessoa);
	}

}
