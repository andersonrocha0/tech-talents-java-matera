package sobrecarga;

public class TestaData {

	public static void main(String[] args) {
		Data datinhaShow = new Data();
		Data datinhaShow4 = new Data(22);
		Data datinhaShow3 = new Data(12,11);
		Data datinhaShow2 = new Data(11,12,2022);
		 
		System.out.println("Datinha show: "+ datinhaShow.getData());
		System.out.println("Datinha show 4: "+ datinhaShow4.getData());
		System.out.println("Datinha show 3: "+ datinhaShow3.getData());
		System.out.println("Datinha show 2: "+ datinhaShow2.getData());
	}
}
