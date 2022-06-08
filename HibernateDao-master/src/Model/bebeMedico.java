package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Bebe_Medico")
public class bebeMedico {
	@Id
	@ManyToOne
	@JoinColumn(name = "id_bebe")
	@NotNull
	  private bebe bebe;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "crm_medico")
	@NotNull
	private medico medico;

	
	@Override
	public String toString() {
		return "bebeMedico [bebe=" + bebe + ", medico=" + medico + "]";
	}

	public bebe getBebe() {
		return bebe;
	}

	public void setBebe(bebe bebe) {
		this.bebe = bebe;
	}

	public medico getMedico() {
		return medico;
	}

	public void setMedico(medico medico) {
		this.medico = medico;
	}
	
	
}
