import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.Test;

class TesteUsuario1 {
	    Artista artista;
	    Endereco endereco;
	    String email;
	    String resultadoEsperado;
	    String senha;
	    boolean equipamentos;
	    boolean booleanEsperado;

	    /*public TesteUsuario1(Artista artista, Endereco enderco, String email, String senha, boolean equipamentos) {
	        this.artista = artista;
	        this.endereco = enderco;
	        this.email = email;
	        this.senha = senha;
	        this.equipamentos = equipamentos;
	    }*/

	    public Artista getArtista() {
	        return artista;
	    }

	    public void setArtista(Artista artista) {
	        this.artista = artista;
	    }

	    public Endereco getEnderco() {
	        return endereco;
	    }

	    public void setEnderco(Endereco enderco) {
	        this.endereco = enderco;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public boolean isEquipamentos() {
	        return equipamentos;
	    }

	    public void setEquipamentos(boolean equipamentos) {
	        this.equipamentos = equipamentos;
	    }

	    @Test
		public void agendaLotada() {
			artista = new Artista("Mendes", "(83)9999-9999", endereco, "testeads@gmail.com", "233", false);
	        boolean resultadoEsperado = true;
	        boolean resultado = artista.marcarShow(4, 10, 16);
	        
	        assertEquals(resultadoEsperado, resultado);
	         
	    }
	    
	    @Test
		public void mudarEmail() {
			artista = new Artista("Mendes", "(83)9999-9999", endereco, "testeads@gmail.com", "233", false);
	        resultadoEsperado = "emailteste@gmail.com";
	        artista.mudarEmail("emailteste@gmail.com");
	        artista.setEmail("emailteste@gmail.com");
	        String resultado = artista.getEmail();
	        
	        assertEquals(resultadoEsperado, resultado);
	         
	    }
	    
	    
	    
	
	}
