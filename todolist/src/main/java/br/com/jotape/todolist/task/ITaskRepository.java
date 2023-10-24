package br.com.jotape.todolist.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/*Lembrando de passar a entidade e ID da chave primaria da entidade*/
public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
     
}
