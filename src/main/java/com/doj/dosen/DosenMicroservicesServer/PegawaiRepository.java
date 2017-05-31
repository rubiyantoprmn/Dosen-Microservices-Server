package com.doj.dosen.DosenMicroservicesServer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PegawaiRepository extends JpaRepository<Pegawai, Long>{
	
	static List<Pegawai> getAllPegawai() {
		// TODO Auto-generated method stub
		return null;
	}
	static Pegawai getPegawai(String nip) {
		// TODO Auto-generated method stub
		return null;
	}
	//List<Kelas> findByName(String name);

}
