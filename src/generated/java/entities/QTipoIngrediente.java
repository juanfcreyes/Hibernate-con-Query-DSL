package entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTipoIngrediente is a Querydsl query type for TipoIngrediente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoIngrediente extends EntityPathBase<TipoIngrediente> {

    private static final long serialVersionUID = -991817581L;

    public static final QTipoIngrediente tipoIngrediente = new QTipoIngrediente("tipoIngrediente");

    public final StringPath etiquetaTipoIngrediente = createString("etiquetaTipoIngrediente");

    public final NumberPath<Integer> idTipoIngrediente = createNumber("idTipoIngrediente", Integer.class);

    public QTipoIngrediente(String variable) {
        super(TipoIngrediente.class, forVariable(variable));
    }

    public QTipoIngrediente(Path<? extends TipoIngrediente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoIngrediente(PathMetadata metadata) {
        super(TipoIngrediente.class, metadata);
    }

}

