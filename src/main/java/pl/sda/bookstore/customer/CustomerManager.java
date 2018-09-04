package pl.sda.bookstore.customer;

import java.util.Scanner;

public class CustomerManager {

    public static Customer createCustomer(Scanner scanner) {
        System.out.println("Wybierz:");
        System.out.println("1. użytkownik prywatny");
        System.out.println("2. firma");

        int option = scanner.nextInt();
        scanner.nextLine();

        //TODO zaimplementować pętlę wyboru (while)
        if (option == 1) {
            System.out.println("Proszę podaj imię: ");
            String name = scanner.nextLine();
            System.out.println("Proszę podaj nazwisko: ");
            String surname = scanner.nextLine();
            System.out.println("Proszę podaj adres: ");
            String address = scanner.nextLine();

            return new User(name, surname, address);

        } else if (option == 2) {
            System.out.println("Proszę podaj nazwę fiirmy: ");
            String companyName = scanner.nextLine();
            System.out.println("Proszę podaj NIP firmy: ");
            String taxCode = scanner.nextLine();
            System.out.println("Proszę podaj adres firmy: ");
            String address = scanner.nextLine();

            return new Company(companyName, taxCode, address);

        } else {
            System.out.println("Brak ci piątej klepki!");
            return null;
        }

    }

}
