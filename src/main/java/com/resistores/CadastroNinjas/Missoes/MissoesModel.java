package com.resistores.CadastroNinjas.Missoes;


import com.resistores.CadastroNinjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeMissao;
    private String dificuldade;


    //pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private ArrayList<NinjaModel> ninjas;
}
