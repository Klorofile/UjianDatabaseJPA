package com.ujian.database.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ujian.database.jpa.entity.Admin;
import com.ujian.database.jpa.entity.Dosen;
import com.ujian.database.jpa.entity.Mahasiswa;
import com.ujian.database.jpa.entity.MataKuliah;
import com.ujian.database.jpa.entity.Nilai;
import com.ujian.database.jpa.entity.Pertanyaan;
import com.ujian.database.jpa.entity.PlotMataKuliah;
import com.ujian.database.jpa.entity.Soal;
import com.ujian.database.jpa.repository.AdminRepository;
import com.ujian.database.jpa.repository.DosenRepository;
import com.ujian.database.jpa.repository.MahasiswaRepository;
import com.ujian.database.jpa.repository.MataKuliahRepository;
import com.ujian.database.jpa.repository.NilaiRepository;
import com.ujian.database.jpa.repository.PlotMataKuliahRepository;
import com.ujian.database.jpa.repository.SoalRepository;

@SpringBootApplication
public class UjianDatabaseJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UjianDatabaseJpaApplication.class, args);
	}
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	DosenRepository dosenRepository;
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	@Autowired
	MataKuliahRepository mataKuliahRepository;
	@Autowired
	PlotMataKuliahRepository plotMatakuliahRepository;
	@Autowired
	SoalRepository soalRepository;
	@Autowired
	NilaiRepository nialiRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	Admin admin = new Admin();
		admin.setUsername("admin");
		admin.setPassword("admin");
		
		this.adminRepository.save(admin);
	*/	
		Dosen dosen = new Dosen();
		dosen.setNamaDosen("Saptaji");
		dosen.setPassword("12345");
		dosen.setUsername("Saptiaji");
		
		PlotMataKuliah plotMatakuliah = new PlotMataKuliah();
		plotMatakuliah.setPlotMataKuliah('1');
		
		PlotMataKuliah plotMatakuliah2 = new PlotMataKuliah();
		plotMatakuliah2.setPlotMataKuliah('2');
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNamaMahasiswa("Dwi Ariyanto");
		mahasiswa.setJenisKelamin("L");
		mahasiswa.setPassword("12345");
		
		List<PlotMataKuliah> lstPlotmatakuliah = new ArrayList<PlotMataKuliah>();
		lstPlotmatakuliah.add(plotMatakuliah);
		lstPlotmatakuliah.add(plotMatakuliah2);
		dosen.setPlotMatakuliah(lstPlotmatakuliah);
		
		List<PlotMataKuliah> lstPlotmatakuliah2 = new ArrayList<PlotMataKuliah>();
		lstPlotmatakuliah2.add(plotMatakuliah);
		lstPlotmatakuliah2.add(plotMatakuliah2);
		mahasiswa.setPlotMataKuliah(lstPlotmatakuliah2);
		
		this.dosenRepository.save(dosen);
		this.mahasiswaRepository.save(mahasiswa);
		
		MataKuliah mataKuliah = new MataKuliah();
		mataKuliah.setNamaMataKuliah("Pemprograman Java");
		
		plotMatakuliah.setMataKuliah(mataKuliah);
		this.plotMatakuliahRepository.save(plotMatakuliah);
		
		Soal soal = new Soal();
		soal.setNamaSoal("ujian");
		soal.setStatus(1);
		
		Pertanyaan pertanyaan = new Pertanyaan();
		pertanyaan.setPertanyaan("dimana rumah lu");
		
		Pertanyaan pertanyaan2 = new Pertanyaan();
		pertanyaan2.setPertanyaan("dimana kamu sekolah");
		
		List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
		lstPertanyaan.add(pertanyaan);
		lstPertanyaan.add(pertanyaan2);
		soal.setPertanyaan(lstPertanyaan);
		
		this.soalRepository.save(soal);
		
		Nilai nilai = new Nilai();
		nilai.setNilai(100);
		
		nilai.setSoal(soal);
		this.nialiRepository.save(nilai);
		


	}

}
