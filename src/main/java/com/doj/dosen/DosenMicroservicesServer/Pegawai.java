package com.doj.dosen.DosenMicroservicesServer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pegawai")
public class Pegawai implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "nip")
	private char nip;
	
	@Column(name = "nama_pegawai")
	private char nama_pegawai;
	
	@Column(name = "jabatan")
	private char jabatan;
	
	
	protected Pegawai()
	{
		
	}
	
	public Pegawai(char nip, char nama_pegawai, char jabatan)
	{
		this.nip = nip;
		this.nama_pegawai = nama_pegawai;
		this.jabatan = jabatan;
	}
	
	public void setNip(char nip)
	{
		this.nip = nip;
	}
	
	public char getNip()
	{
		return this.nip;
	}
	
	public void setNamaPegawai(char nama_pegawai)
	{
		this.nama_pegawai = nama_pegawai;
	}
	
	public char  getNamaPegawai()
	{
		return this.nama_pegawai;
	}
	
	public void setJabatan(char jabatan)
	{
		this.jabatan = jabatan;
	}
	
	public char  getJabatan()
	{
		return this.jabatan;
	}
	
	@Override
	public String toString()
	{
		return nip + "\t" + nama_pegawai + "\t" + jabatan ;
	}

	
}
