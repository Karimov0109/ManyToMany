package com.karimov.manytomany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "region")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long r_id;

    @Column(name = "region_name")
    private String regionName;

//    @ManyToOne
//    @JoinColumn(name = "country_id")
//    private Country country;


    @OneToMany(targetEntity = District.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "region_district", referencedColumnName = "r_id")
    private List<District> districts;

}
