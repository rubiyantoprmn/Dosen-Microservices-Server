package com.doj.dosen.DosenMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PegawaiController {
	
protected Logger logger = Logger.getLogger(PegawaiController.class.getName());
	
	@Autowired
	PegawaiRepository repository;
	
	@RequestMapping("/pegawai")
	public Pegawai[] All()
	{
		logger.info("pegawai-microservice all() invoked");
		List<Pegawai> pegawai = PegawaiRepository.getAllPegawai();
		logger.info("pegawai-microservice all() found: " + pegawai.size());
		return pegawai.toArray(new Pegawai[pegawai.size()]);
	}
	
	@RequestMapping("/pegawai/{id}")
	public Pegawai ById(@PathVariable("nip") String id)
	{
		logger.info("pegawai-microservice byId() invoked: " + id);
		Pegawai pegawai = PegawaiRepository.getPegawai(id);
		logger.info("pegawai-microservice byId() found: " + pegawai);
		return pegawai;
	}

}
