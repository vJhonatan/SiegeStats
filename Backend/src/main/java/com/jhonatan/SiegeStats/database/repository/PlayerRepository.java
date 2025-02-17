package com.jhonatan.SiegeStats.database.repository;

import com.jhonatan.SiegeStats.database.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
