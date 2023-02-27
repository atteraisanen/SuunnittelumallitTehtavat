import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

class EncryptionDecorator extends DataDecorator {
	private SecretKeySpec secretKey;
	private Cipher cipher;

	public EncryptionDecorator(Data data, String password) {
		super(data);
		try {
			byte[] key = password.getBytes("UTF-8");
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
			cipher = Cipher.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String readData() throws InvalidKeyException {
		String encryptedData = super.readData();
		try {
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] decryptedData = Base64.getDecoder().decode(encryptedData);
			decryptedData = cipher.doFinal(decryptedData);
			return new String(decryptedData);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void writeData(String data) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] encryptedData = cipher.doFinal(data.getBytes());
			String encodedData = Base64.getEncoder().encodeToString(encryptedData);
			super.writeData(encodedData);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
	}
}