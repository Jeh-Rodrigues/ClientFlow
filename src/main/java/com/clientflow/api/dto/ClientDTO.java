package com.clientflow.api.dto;

import com.clientflow.api.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    private String name;

    @NotBlank(message = "Campo requerido")
    private String cpf;

    @NotBlank(message = "Campo requerido")
    @Positive(message = "A renda deve ser positiva")
    private Double income;

    @NotBlank(message = "Campo requerido")
    @Past(message = "A Data de nascimento precisa estar no passado")
    private LocalDate birthDate;

    @NotBlank(message = "Campo requerido")
    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }
}