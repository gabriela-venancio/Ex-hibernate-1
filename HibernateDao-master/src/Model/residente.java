package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Residente")
public class residente extends medico {
	@Column(name = "Instituicao_Ensino", length = 50)
	@NotNull
	  private String instituicao;
		
	@Column(name = "Ano_Ingresso", length = 10)
	@NotNull
	private int ano;
}
