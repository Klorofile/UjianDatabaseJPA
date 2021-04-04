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
@Table(name="mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="nama_mahasiswa")
	private String namaMahasiswa;
	@Column(name="jenis_kelamin")
	private String jenisKelamin;
	@Column(name="password")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "nim", referencedColumnName = "id")
	List<PlotMataKuliah> plotMataKuliah = new ArrayList<PlotMataKuliah>();
	
}
