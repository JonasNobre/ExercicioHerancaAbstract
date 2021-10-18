package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.taxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<taxPayer> list = new ArrayList<>();
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double salarioAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures:");
				double gastosSaude = sc.nextDouble();
				list.add(new Individual(name, salarioAnual, gastosSaude));
			}else if(ch == 'c') {
				System.out.print("Number of employees:");
				int numeroFunc = sc.nextInt();
				list.add(new Company(name, salarioAnual, numeroFunc));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for(taxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			total += tax;
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + total);
		
		sc.close();
	}

}
