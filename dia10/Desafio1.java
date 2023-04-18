package desafios.dia10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		
		System.out.printf("Digite o target: \n");
		int target = sc.nextInt();
		
		//while (sc.hasNextInt()) {
		while (!sc.hasNext("pare")) {
			System.out.print("Digite um inteiro: ");
			arr.add(sc.nextInt());
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
			for (int j = i+1; j < arr.size(); j++) {
				int soma = arr.get(i) + arr.get(j);
				if (soma == target) {
					System.out.println(i + ", " + j);
				}
			}
		}
		sc.close();
	}
}
