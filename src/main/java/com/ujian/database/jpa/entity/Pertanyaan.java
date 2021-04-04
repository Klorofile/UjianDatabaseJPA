package com.ujian.database.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pertanyaan")
public class Pertanyaan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="pertanyaan")
	private String pertanyaan;
	@Column(name="jawaban_1")
	private String jawaban1;
	@Column(name="jawaban_2")
	private String jawaban2;
	@Column(name="jawaban_3")
	private String jawaban3;
	@Column(name="jawaban_4")
	private String jawaban4;
	@Column(name="jawaban_benar")
	private String jawabanBenar;
	@Column(name="status_gambar")
	private int statusGambar;
	
}
