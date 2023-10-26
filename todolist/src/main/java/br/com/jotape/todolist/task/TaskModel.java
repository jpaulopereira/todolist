package br.com.jotape.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.el.ELException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data /*get and set */
@Entity(name = "Tb_tasks")
public class TaskModel {
     /* User, Id, desc, title, date, priority*/

     @Id
     @GeneratedValue(generator = "UUID")
     private UUID id;

     private String description;

     @Column(length = 50)
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;
     private String priority;


     private UUID idUser;

     @CreationTimestamp /*registra o horario no banco de dados */
     private LocalDateTime createdAt;


     public void setTitle(String title) throws Exception {
          if(title.length() > 50) {
               throw new Exception("O campo deve ter no máximo 50 caracteres");
          }
          this.title = title;
     }
     

}
