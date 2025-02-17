package com.jhonatan.SiegeStats.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "player_tb")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private Double KD;
    private Double VD;

    @OneToMany(mappedBy = "player")
    private List<MatchHistory> matchHistory;
}
