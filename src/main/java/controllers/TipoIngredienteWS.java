package controllers;

import java.util.List;

import idao.ITipoIngredienteDao;
import main.HibernateConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.TipoIngrediente;

@RestController
public class TipoIngredienteWS {
	
	private AnnotationConfigApplicationContext contex;

	@RequestMapping("/greeting") 
	public String greeting() {	 
		contex = new AnnotationConfigApplicationContext(HibernateConf.class);
		List<TipoIngrediente> tiposIngredientes = contex.getBean(ITipoIngredienteDao.class).getAllTiposIngrediente();
		StringBuilder sb = new StringBuilder();
		
		for(TipoIngrediente ti : tiposIngredientes) {
			sb.append(ti.toString()).append("\n");
		}
		
		return sb.toString();
	}
	
}
