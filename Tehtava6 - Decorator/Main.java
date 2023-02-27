import java.security.InvalidKeyException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InvalidKeyException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String data = scanner.nextLine();

		System.out.print("Do you want to encrypt the data? (y/n): ");
		String choice = scanner.nextLine();

		Data disk = new Disk("data.txt");

		if (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter a password: ");
			String password = scanner.nextLine();
			disk = new EncryptionDecorator(disk, password);
		}

		disk.writeData(data);
		System.out.println("Data written to disk.");

		System.out.print("Do you want to read the data? (y/n): ");
		choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("y")) {
			String readData = disk.readData();
			System.out.println("Data read from disk: " + readData);
		}

		scanner.close();
	}
}
