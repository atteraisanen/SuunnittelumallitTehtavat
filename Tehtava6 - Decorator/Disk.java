import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Disk implements Data {
	private String fileName;

	public Disk(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String readData() {
		String data = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				data += line;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An error occurred while reading data from the disk.");
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public void writeData(String data) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred while writing data to the disk.");
			e.printStackTrace();
		}
	}
}