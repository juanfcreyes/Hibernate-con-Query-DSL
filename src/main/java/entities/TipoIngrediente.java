package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_ingrediente")
public class TipoIngrediente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_tipo_ingrediente") 
	private Integer idTipoIngrediente; 
	
	@Column(name = "etiqueta_tipo_ingrediente")
	private String etiquetaTipoIngrediente;
	
	public TipoIngrediente() {}
	
	public TipoIngrediente (Integer idTipoIngrediente, String etiquetaTipoIngrediente){
		this.idTipoIngrediente = idTipoIngrediente;
		this.etiquetaTipoIngrediente = etiquetaTipoIngrediente;
	}

	public Integer getIdTipoIngrediente() {
		return idTipoIngrediente;
	}

	public void setIdTipoIngrediente(Integer idTipoIngrediente) {
		this.idTipoIngrediente = idTipoIngrediente;
	}

	public String getEtiquetaTipoIngrediente() {
		return etiquetaTipoIngrediente;
	}

	public void setEtiquetaTipoIngrediente(String etiquetaTipoIngrediente) {
		this.etiquetaTipoIngrediente = etiquetaTipoIngrediente;
	}

	@Override
	public String toString() {
		return "TipoIngrediente [idTipoIngrediente=" + idTipoIngrediente
				+ ", etiquetaTipoIngrediente=" + etiquetaTipoIngrediente + "]";
	}
	
	
	
}
