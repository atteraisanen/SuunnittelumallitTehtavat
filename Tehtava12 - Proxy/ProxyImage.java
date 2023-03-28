class ProxyImage implements Image {
	private final String filename;
	private RealImage image;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public ProxyImage(String filename) {
		this.filename = filename;
	}

	/**
	 * Displays the image
	 */
	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}

	@Override
	public void showData() {
		try {
			image.showData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}