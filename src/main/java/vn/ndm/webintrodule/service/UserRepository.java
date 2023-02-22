package vn.ndm.webintrodule.service;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ndm.webintrodule.obj.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
