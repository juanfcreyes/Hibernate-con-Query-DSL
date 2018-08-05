package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.jpa.hibernate.HibernateQuery;


import entities.QTipoIngrediente;
import entities.TipoIngrediente;
import idao.ITipoIngredienteDao;

@Repository
public class TipoIngredienteDao implements ITipoIngredienteDao {

	@Autowired
    public SessionFactory sessionFactory;

	
	@Override
	@Transactional
	public List<TipoIngrediente> getAllTiposIngrediente() {
		QTipoIngrediente tipoIngrediente = QTipoIngrediente.tipoIngrediente;
		HibernateQuery<TipoIngrediente> queryFactory = new HibernateQuery<TipoIngrediente>(sessionFactory.getCurrentSession());
        return  queryFactory.select(tipoIngrediente).from(tipoIngrediente).where(tipoIngrediente.etiquetaTipoIngrediente.eq("Lacteo")).fetch();
	}

}
