package com.jhonatan.SiegeStats.database.repository;

import com.jhonatan.SiegeStats.database.model.MatchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchHistoryRepository extends JpaRepository<MatchHistory, Long> {
}