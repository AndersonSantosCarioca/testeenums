package com.enums.enums;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnumsApplication {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String planeta;
		System.out.println("Para qual planeta deseja viajar?");
		planeta = entrada.next().toUpperCase();
		entrada.close();

		try {
			ClasseTeste1 pl = new ClasseTeste1(planeta);
			pl.viajarPlaneta();
		} catch (IllegalArgumentException e) {
			System.out.println("Planeta não econtrado");
		}
	}
}
