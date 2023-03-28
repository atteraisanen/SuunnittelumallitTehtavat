class PisteidenJakaja implements BonusVisitor {
	@Override
	public void visit(HahmoTilaA tila) {
		int pisteet = tila.annaBonuspisteet();
		System.out.println("HahmoTilaA sai " + pisteet + " bonuspistettä");
	}

	@Override
	public void visit(HahmoTilaB tila) {
		int pisteet = tila.annaBonuspisteet();
		System.out.println("HahmoTilaB sai " + pisteet + " bonuspistettä");
	}
}