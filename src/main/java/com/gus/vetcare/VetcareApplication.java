package com.gus.vetcare;

import com.gus.vetcare.controllers.BreedController;
import com.gus.vetcare.models.BreedModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class VetcareApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		BreedController breeds_ctrl = new BreedController();

		System.out.println("---------------------");
		System.out.println("REGISTRO DE RAZAS");
		System.out.println("---------------------");

		System.out.println("Nombre de la raza..........:");
		String name = scanner.nextLine();
		System.out.println("Pais de origen de la raza..:");
		String origin = scanner.nextLine();

		BreedModel breedModel = new BreedModel(name, origin);
		breeds_ctrl.create(breedModel);

		System.out.println("---------------------");
		System.out.println("LISTAR RAZAS");
		System.out.println("---------------------");

		System.out.println("ID");
		String name2 = scanner.nextLine();
		System.out.println("----------------------------------------------");


	}
}
