package br.com.jotape.todolist.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

//passa a entidade e o tipo do ID        <recebe um generation>  
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
