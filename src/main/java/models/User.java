package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to automatically create a value
    private Long id;
    private String Email;
    private String username;
    private String password;
    private String role = "ROLE_USER";



}
