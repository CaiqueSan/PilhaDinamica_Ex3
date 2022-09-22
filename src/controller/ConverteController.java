package controller;

import pilhaInt.Pilha;

public class ConverteController {
	Pilha p =  new Pilha();
	
	public String decToBin(int a) throws Exception{
		String s = "";
		if (a == 0)
			return s = "0";
		while (a > 0) {
			p.push(a%2);
			a = a/2;
		}
		while (p.tamanho() > 0) {
			s = s + Integer.toString(p.pop());
		}
		return s;
	}
}
	
