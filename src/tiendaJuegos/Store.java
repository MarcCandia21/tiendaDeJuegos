package tiendaJuegos;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Store {

	//Game game;
// 8	
	ArrayList<Game> games = new ArrayList<>();
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<Compra> purchase = new ArrayList<>();
	//8.1
	public void agregarJuegos(int id, String title, Genre genre, double price, int stock) {
		
		for(Game a: games) {
			if(a.getId() == id) {
				System.out.println("Este id ya pertenece a un juego");
				break;
			}
		}
		
		 games.add(new Game(id,title,genre,price,stock));
		 System.out.println("Juego añadido correctamente");
		
	}
	//8.2
	public Game buscarVideojuegos(int id) {
			for(Game a: games) {
				if(a.getId() == id) {
					return a;
				}
			}
			throw new RuntimeException("Videojuego ");
}
	//8.3 Buscar clientes
		public Customer buscarCliente(int id) {
			for (Customer c : customers) {
		        if (c.getId() == id) {
		        	System.out.println();
		        	return c;
		        }
		        	
		    }
		    throw new RuntimeException("Cliente " + id + " no existe");
	}
	//8.4
	public void buscarTexto(String texto) {
		for(Game a :games ) {
			if(a.gettitle().contains(texto)) {
				System.out.println(a.gettitle());
			}
		}
		
	}
	//8.5 Busqueda por genero
	public void buscarGenero(Genre genre) {
		for(Game a :games ) {
			if(a.getGenre().equals(genre)) {
				System.out.println(a.gettitle());
			}
		}
		
	}
	//8.6 Comprar videoJuegos
	public void comprarJuegos(int id, int id2, int cantidad, double saldo) {
		boolean clienteExiste = false;
		boolean juegoExiste = false;
		boolean stockValido = false;
		boolean saldoSuficiente = false;
		
		//comprobar si el cliente existe
		for(Customer b : customers) {
			if(b.getId() == id) {
				 clienteExiste = true;
				break;
			}
		}
		//comprobar si el juego existe
		for(Game a: games) {
			if(a.getId()== id2) {
				 juegoExiste = true;
				break;
			}
		}
		//comprobar si la cantidad solicitada es valida y stock suficiente
		for(Game a: games) {
			if(a.getStock()>= cantidad && cantidad > 0) {
				 stockValido = true;
				break;
			}
		}
		//Saldo suficiente por parte del cliente
		for(Customer a : customers) {
			if(a.getBalance()>= saldo) {
				saldoSuficiente = true;
				break;
			}
		}
		
		Boolean compraValida = (clienteExiste && juegoExiste && stockValido && saldoSuficiente) ? false : true;
		if(compraValida) {
			 purchase.add(new Compra(null, null, cantidad, saldo));
		}else {
			System.out.println("Compra no valida");
		}
	}
}
