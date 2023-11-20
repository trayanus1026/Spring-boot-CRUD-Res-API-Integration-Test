package com.trayanus.crudrest.repository;
import com.trayanus.crudrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.List;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

}
