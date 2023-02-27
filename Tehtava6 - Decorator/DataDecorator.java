import java.security.InvalidKeyException;

abstract class DataDecorator implements Data {
	protected Data data;

	public DataDecorator(Data data) {
		this.data = data;
	}

	@Override
	public String readData() throws InvalidKeyException {
		return data.readData();
	}

	@Override
	public void writeData(String data) {
		this.data.writeData(data);
	}
}