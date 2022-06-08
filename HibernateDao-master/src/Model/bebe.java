package Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Bebe")
public class bebe {
	@Id
	@Column(name = "id_bebe", length = 10)
	@NotNull
	  private int IdBebe;
	
	@Column(name = "nome_bebe", length = 60)
	@NotNull
	  private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate data;
	
	@Column(name = "altura", length = (int) 7.2 )
	@NotNull
	private float altura;

	
	@Override
	public String toString() {
		return "bebe [IdBebe=" + IdBebe + ", nome=" + nome + ", data=" + data + ", altura=" + altura + "]";
	}

	public int getIdBebe() {
		return IdBebe;
	}

	public void setIdBebe(int idBebe) {
		IdBebe = idBebe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
