package com.mds.app.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TimeControle {

	static Scanner recebaDados = new Scanner(System.in);
	
	static ArrayList<Time> montarTime = new ArrayList<Time>();
	static Time sul;
	static Time nordeste;
	static Time centroOeste;
	static Time sudeste;
	
	public static void main(String[] args) {
		
		int opcaoMenu = 0;
		
		for(;;){
			System.out.println("1 = cadastrar");
			System.out.println("2 = listar");
			System.out.println("3 = excluir");
			
			opcaoMenu = Integer.parseInt(recebaDados.nextLine());
			
			switch(opcaoMenu){
				case 1: 
					cadastrar();
					break;
				case 2: 
					listar();
					break;
				case 3: 
					excluir();
					break;
			}
		}

	}

	private static void excluir() {
		montarTime.remove(sul);
		
	}

	private static void listar() {
		
		Iterator<Time> percorre = montarTime.iterator();
		
		//Enquanto tiver pr�ximo objeto na lista
		while(percorre.hasNext()){
			//Imprima o que tiver
			System.out.println(percorre.next());
		}
	}

	private static void cadastrar() {
		sul = new Time("Internacional");
		centroOeste = new Time("goias");
		sudeste = new Time("vasco");
		nordeste =  new Time("bahia");
		
		montarTime.add(sul);
		montarTime.add(sudeste);
		montarTime.add(centroOeste);
		montarTime.add(nordeste);
		
	}

}
