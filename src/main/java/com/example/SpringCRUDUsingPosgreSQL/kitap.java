package com.example.SpringCRUDUsingPosgreSQL;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class kitap {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long kitapNo;
	  
	  private int konuNo;
	  private int yayinEviNo;
	  private int turNo;
	  private int katRafNo;
	  private String kitapAdi;
	  private int sayfaSayisi;
	  
	  public kitap() {
		  
	  }
	  
	  public kitap(Long kitapNo) {
		  this.kitapNo=kitapNo;
	  }
	  
	  
	public kitap(int konuNo, int yayinEviNo, int turNo, int katRafNo, String kitapAdi, int sayfaSayisi) {
		super();
		this.konuNo = konuNo;
		this.yayinEviNo = yayinEviNo;
		this.turNo = turNo;
		this.katRafNo = katRafNo;
		this.kitapAdi = kitapAdi;
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public kitap(Long kitapNo,int konuNo, int yayinEviNo, int turNo, int katRafNo, String kitapAdi, int sayfaSayisi) {
		super();
		this.kitapNo=kitapNo;
		this.konuNo = konuNo;
		this.yayinEviNo = yayinEviNo;
		this.turNo = turNo;
		this.katRafNo = katRafNo;
		this.kitapAdi = kitapAdi;
		this.sayfaSayisi = sayfaSayisi;
	}
	public Long getKitapNo() {
		return kitapNo;
	}
	public void setKitapNo(Long kitapNo) {
		this.kitapNo = kitapNo;
	}
	public int getKonuNo() {
		return konuNo;
	}
	public void setKonuNo(int konuNo) {
		this.konuNo = konuNo;
	}
	public int getYayinEviNo() {
		return yayinEviNo;
	}
	public void setYayinEviNo(int yayinEviNo) {
		this.yayinEviNo = yayinEviNo;
	}
	public int getTurNo() {
		return turNo;
	}
	public void setTurNo(int turNo) {
		this.turNo = turNo;
	}
	public int getKatRafNo() {
		return katRafNo;
	}
	public void setKatRafNo(int katRafNo) {
		this.katRafNo = katRafNo;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	  
	  

}
