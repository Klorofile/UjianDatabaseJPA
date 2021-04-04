package com.ujian.database.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dosen")
public class Dosen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="nama_dosen")
	private String namaDosen;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_dosen", referencedColumnName = "id")
	List<PlotMataKuliah> plotMatakuliah = new ArrayList<PlotMataKuliah>();
	

}
