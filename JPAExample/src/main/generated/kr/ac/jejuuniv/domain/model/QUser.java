package kr.ac.jejuuniv.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 650978013;

    public static final QUser user = new QUser("user");

    public final ListPath<Gun, QGun> guns = this.<Gun, QGun>createList("guns", Gun.class, QGun.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QUser(Path<? extends User> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata<?> metadata) {
        super(User.class, metadata);
    }

}

