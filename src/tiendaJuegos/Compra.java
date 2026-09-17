package tiendaJuegos;

public class Compra {
private Customer customers;
private Game game;
private int quantity;
private double totalPrice;

public Compra(Customer customers, Game game, int quantity, double totalPrice) {
	super();
	this.customers= customers;
	this.game = game;
	this.quantity = quantity;
	this.totalPrice = game.getPrice() * quantity;
}

public Customer getCustomers() {
	return customers;
}

public Game getGame() {
	return game;
}

public int getQuantity() {
	return quantity;
}

public double getTotalPrice() {
	return totalPrice;
}

@Override
public String toString() {
	return "Compras. Cliente= " + customers + ", Juego= " + game + ", Cantidad= " + quantity + ", totalPrice=" + totalPrice
			+ "]";
}



}
