package com.jhonatan.SiegeStats.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "match_history_tb")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class MatchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double kd;
    private String map;
    private LocalDateTime date;

    @ManyToOne
    private Player player;
}
