package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to automatically create a value
    private Long id;
    private String Email;
    private String username;
    private String password;
    private String role = "ROLE_USER";



}
