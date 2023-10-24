package br.com.jotape.todolist.user;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data

@Entity(name ="tb_users") //Entity = tabela
public class UserModel {    

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)  // coluna com uma constraint de atributo único
    private String username;
    private String name;
    
    //@Getter
    //@Setter para apenas uma atributo
    private String password;   

    @CreationTimestamp
    private LocalDateTime createdAT;  //define quando o dado no banco foi criado
}
