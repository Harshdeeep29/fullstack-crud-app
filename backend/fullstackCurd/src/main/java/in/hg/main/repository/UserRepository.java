package in.hg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hg.main.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
