
public class BankKonto {
	public class Bankkonto {
		private int saldo = 0;
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) throws NumberFormatException{
			if(saldo<0){
				NumberFormatException e = new NumberFormatException();
				throw e;
			}
			
			this.saldo = saldo;
		}
	}

}
