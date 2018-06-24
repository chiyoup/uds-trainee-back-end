package br.com.uds.trainee.personagem;

import java.util.Set;
import java.util.UUID;

public interface PersonagemService {
    Personagem criar(Personagem Personagem);

    Set<Personagem> listar();

    Personagem obter(UUID id);

    void remover(UUID id);

    void editar(UUID id, Personagem personagem);

}