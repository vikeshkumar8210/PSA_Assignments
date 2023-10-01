package day17;

public class BankImp implements Bank {
	@Override
	public void TransferAmount() {
		System.out.println(1);
	}
	@Override
	public void Statements () {
		System.out.println(25);
	}
	@Override
	public void MobileRecharge() {
		System.out.println(300);
	}
	public static void main(String[] args) {
		BankImp b = new BankImp ();
		b.TransferAmount();
		b.Statements();
		b.MobileRecharge();
	}

}
