package enums;

class FreshJuice{
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}

}
