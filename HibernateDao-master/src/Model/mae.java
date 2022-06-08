package Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Mae")
public class mae {

	@Id
	@Column(name = "ID_Mae", length = 10)
	@NotNull
	  private int id_mae;
	
	@Column(name = "Nome", length = 60)
	@NotNull
	  private String nome;
		
	@Column(name = "telefone", length = 10)
	@NotNull
	private String telefone;
	
	@Column(name = "Logradouro_Endereco", length = 100)
	@NotNull
	private String logradouro;
	
	@Id
	@Column(name = "Numero_Endereco", length = 10)
	@NotNull
	  private int numero;
	
	@Column(name = "CEP_Endereco", length = 8)
	@NotNull
	  private String cep;
		
	@Column(name = "Complemento_Endereco", length = 200)
	@NotNull
	private String celular;
	
	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate data;
	
}
