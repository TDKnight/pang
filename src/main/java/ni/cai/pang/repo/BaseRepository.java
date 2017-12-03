package ni.cai.pang.repo;

import ni.cai.pang.entity.BaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity, ID extends Serializable> extends MongoRepository<T, ID> {
}
