package dev.fabiokusaba.security.dto.request;

import dev.fabiokusaba.security.entity.Role;
import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(
        @NotEmpty(message = "Nome é obrigatório")
        String name,
        @NotEmpty(message = "Email é obrigatório")
        String email,
        @NotEmpty(message = "Senha é obrigatória")
        String password,
        Role role
) {
}
