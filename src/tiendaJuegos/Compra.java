package tiendaJuegos;

public class compra {
private String purchase;
private Game game;
private int quantity;
private double totalPrice;

public compra(String purchase, Game game, int quantity, double totalPrice) {
	super();
	this.purchase = purchase;
	this.game = game;
	this.quantity = quantity;
	this.totalPrice = game.getPrice() * quantity;
}

public String getPurchase() {
	return purchase;
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
	return "Compras. Cliente= " + purchase + ", Juego= " + game + ", Cantidad= " + quantity + ", totalPrice=" + totalPrice
			+ "]";
}



}
