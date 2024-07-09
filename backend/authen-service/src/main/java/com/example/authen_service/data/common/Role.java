package com.example.authen_service.data.common;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Role {
    @Id
    private String role_id;
    private String name;
}
