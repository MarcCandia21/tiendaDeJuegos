package tiendaJuegos;

public class Game {
private int id;
private String title;
private Genre genre;
private double price;
private int stock;


public Game(int id, String title, Genre genre, double price, int stock) {
	super();
	this.id = id;
	this.title = title;
	this.genre = genre;
	this.price = price;
	this.stock = stock;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}

public String gettitle() {
	return title;
}

public int getId() {
	return id;
}


public Genre getGenre() {
	return genre;
}


public double getPrice() {
	return price;
}


public int aumentarStock(int cantidad) {
	if(cantidad<= 0){
		System.out.println("Error");
		return 0;
		}
	return stock+cantidad;
}

public int reducirStock(int cantidad) {
	if(cantidad<= 0) {
		System.out.println("Error");
	return 0;
	}
	return stock-cantidad;
}

public int unidadesDisponibles(int id) {
	if(id == this.getId()) {
		return stock;
	}
	return 0;
}

public String representacionTextual(int id ) {
	if(id == this.getId()) {
		return "El juego "+ title +" con id "+id+" y genero "+genre+ " tine un stock de : "+stock ;
	}
	return "Error, no existe es ID";
}
@Override
public String toString() {
	return "Juego id=" + id + ", Titulo=" + title + ", genero=" + genre + ", precio=" + price + ", cantidad=" + stock + "";
}

}
