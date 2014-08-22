package kr.ac.jejuuniv.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QGun is a Querydsl query type for Gun
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGun extends EntityPathBase<Gun> {

    private static final long serialVersionUID = 2099195886;

    public static final QGun gun = new QGun("gun");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QGun(String variable) {
        super(Gun.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QGun(Path<? extends Gun> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QGun(PathMetadata<?> metadata) {
        super(Gun.class, metadata);
    }

}

