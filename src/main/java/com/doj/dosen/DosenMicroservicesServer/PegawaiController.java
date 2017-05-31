package com.doj.dosen.DosenMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PegawaiController {
	
protected Logger logger = Logger.getLogger(PegawaiController.class.getName());
	
	@Autowired
	PegawaiRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pegawai> findAll()
	{
		//logger.info("mahasiswa-microservice all() invoked");
		List<Pegawai> pegawai = PegawaiRepository.getAllPegawai();
		//logger.info("mahasiswa-microservice all() found: " + mahasiswa.size());
		return pegawai;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Pegawai ById(@PathVariable("nip") String id)
	{
		//logger.info("mahasiswa-microservice byId() invoked: " + id);
		Pegawai pegawai = PegawaiRepository.getPegawai(id);
		//logger.info("mahasiswa-microservice byId() found: " + mahasiswa);
		return pegawai;
	}

}
