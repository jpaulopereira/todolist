package br.com.jotape.todolist.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/*Lembrando de passar a entidade e ID da chave primaria da entidade*/
public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
     List<TaskModel> findByIdUser(UUID idUser);
     TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}
