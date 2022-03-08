package programme.test;

 class TestA {
	 private int y=10;
	 long k= 100000;
	public void methodpublic(){
		methodprivate();
	} 
	protected void methodprotected(){
		methodprivate();
	}
	void methoddefault(){
		methodprivate();
	}
	private void methodprivate(){
		System.out.println("Class TestA: methodprivate");
		System.out.println("Value of private value y"+100);
		System.out.println("Value of long "+k);
	}
}
