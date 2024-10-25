package Pizzaria;

public class CalculadoraPizza {

	    public double calcular(Pizza pizza) {
	        double total = 0;

	        // Valores dos sabores
	        for (String sabor : pizza.getSabores()) {
	            if (sabor.contains("Atum")) total += 58;
	            else if (sabor.contains("Frango com Catupiry")) total += 25;
	            else if (sabor.contains("Marguerita")) total += 67;
	        }

	        // Borda
	        if (pizza.isComBorda()) total += 5;

	        //  Entrega
	        if (pizza.getTipoEntrega().contains("Tele Entrega")) total += 10;

	        // Opcionais
	        for (String opcional : pizza.getOpcionais()) {
	            if (opcional.contains("Azeitonas")) total += 3;
	            else if (opcional.contains("Orégano")) total += 2;
	            else if (opcional.contains("Bacon")) total += 5;
	        }

	        return total;
	    }
	}
