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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="plot_mata_kuliah")
public class PlotMataKuliah {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="id_plot_matakuliah")
	private char plotMataKuliah;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_plotmatakkuliah", referencedColumnName = "id")
	private List<Soal> soal = new ArrayList<Soal>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_matakuliah")
	private MataKuliah mataKuliah;
}
