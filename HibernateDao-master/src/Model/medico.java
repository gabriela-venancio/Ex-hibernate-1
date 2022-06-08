package Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Medico")
public class medico {
	@Id
	@Column(name = "CRM", length  = 7)
	@NotNull
	  private int crm;
	
	@Column(name = "nome_medico", length = 60)
	@NotNull
	  private String nome;
		
	@Column(name = "telefone_celular", length = 11)
	@NotNull
	private String celular;
	
	@Column(name = "especialidade", length = 30)
	@NotNull
	private String especialidade;
}
