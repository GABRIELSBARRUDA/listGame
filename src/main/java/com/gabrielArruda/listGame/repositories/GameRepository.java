package com.gabrielArruda.listGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielArruda.listGame.entities.Game;

/* JpaRepository vai fazer  as operações básicas (inserir, consultar e deletar) */

/* Componente da camada de acesso a dados (consulta no banco de dados) */

public interface GameRepository extends JpaRepository<Game, Long> {
  
} 