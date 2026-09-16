package tiendaJuegos;

public class Customer {
private int id;
private String name;
private double balance;
public Customer(int id, String name, double balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getBalance() {
	return balance;
}

public double añadirSado(double añadir) {
	if(añadir > 0) {
		System.out.println("Saldo añadido correctamente, total de : " +balance+añadir );
		return balance + añadir;
	}
	
		return 0;
	
}

public double retirarSaldo(double retirar) {
	if(retirar <= balance) {
		return balance - retirar;
	}
	return 0;
}

public boolean comprobarCantidadDeterminada(double cantidad) {
	if(cantidad <= balance ) {
		System.out.println("Si tiene esa cantidad de " +cantidad);
		return true ;
	}
	return false;
}
public void representacionTextual(int id) {
	if(id == getId()) {
		System.out.println("Cliente id=" + id + ", nombre=" + name + ", saldo=" + balance + "]");
	}
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}

}
