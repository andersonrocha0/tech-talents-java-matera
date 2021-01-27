package sobrescrita;

public class TestaGarrafaComSobrescrita {

	public static void main(String[] args) {
		GarrafaComSobrescrita gs1 = new GarrafaComSobrescrita();
		GarrafaComSobrescrita gs2 = new GarrafaComSobrescrita();
		
		gs1.setCodigoBarras("123");
		gs2.setCodigoBarras("123");
		
		if (gs1.equals(gs2)) {
			System.out.println("Garrafas são iguais");
		} else {
			System.out.println("Garrafas não são iguais");
		}
	}
}
