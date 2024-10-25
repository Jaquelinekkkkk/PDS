package Pizzaria;


	import java.util.ArrayList;
	import java.util.List;

	public class Pizza {
	    private List<String> sabores;
	    private boolean comBorda;
	    private String tipoEntrega;
	    private List<String> opcionais;

	    public Pizza() {
	        sabores = new ArrayList<>();
	        opcionais = new ArrayList<>();
	        comBorda = false;
	        tipoEntrega = "Retira (Grátis)";
	    }

	    public void toggleSabor(String sabor, boolean selected) {
	        if (selected) {
	            if (sabores.size() < 3) {
	                sabores.add(sabor);
	            } else {
	                System.out.println("Você pode selecionar no máximo 3 sabores.");
	            }
	        } else {
	            sabores.remove(sabor);
	        }
	    }

	    public void setBorda(boolean comBorda) {
	        this.comBorda = comBorda;
	    }

	    public void setTipoEntrega(String tipoEntrega) {
	        this.tipoEntrega = tipoEntrega;
	    }

	    public void toggleOpcional(String opcional, boolean selected) {
	        if (selected) {
	            opcionais.add(opcional);
	        } else {
	            opcionais.remove(opcional);
	        }
	    }

	    public List<String> getSabores() {
	        return sabores;
	    }

	    public boolean isComBorda() {
	        return comBorda;
	    }

	    public String getTipoEntrega() {
	        return tipoEntrega;
	    }

	    public List<String> getOpcionais() {
	        return opcionais;
	    }
	}
