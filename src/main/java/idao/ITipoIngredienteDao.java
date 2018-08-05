package idao;

import java.util.List;

import org.springframework.stereotype.Component;

import entities.TipoIngrediente;

@Component
public interface ITipoIngredienteDao {
	
	public List<TipoIngrediente> getAllTiposIngrediente();

}
