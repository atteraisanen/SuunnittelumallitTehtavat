import java.security.InvalidKeyException;

public interface Data {
	String readData() throws InvalidKeyException;

	void writeData(String data);
}