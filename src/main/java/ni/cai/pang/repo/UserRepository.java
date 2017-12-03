package ni.cai.pang.repo;

import ni.cai.pang.entity.User;

public interface UserRepository extends BaseRepository<User, String> {

    User findByUsername(String username);
}
