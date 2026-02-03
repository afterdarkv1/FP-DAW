package cuentaObjetos;

public class Cuenta {
 private String numeroCuenta;
 private double saldo = 0;
 
 public Cuenta(String nc) {
		numeroCuenta = nc;
	}
 public double consultarSaldo() {
		return saldo;
	}
 public String toString() {
     return "Cuenta" + "[ numeroCuenta= " + numeroCuenta + " " + "saldo= " + saldo + " ]" ;
 }
 public void recibirAbonos(double abono) {
     saldo += abono;
 }
 public void pagarRecibo(double recibo) {
     saldo -= recibo;
 }

 
}


