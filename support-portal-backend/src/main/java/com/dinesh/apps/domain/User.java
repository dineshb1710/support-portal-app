package com.dinesh.apps.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joiningDate;
    private String[] roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;
}
