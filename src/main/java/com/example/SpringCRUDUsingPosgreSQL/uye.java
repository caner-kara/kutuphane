package com.example.SpringCRUDUsingPosgreSQL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class uye {
	  @Id
	  
	  private Long tcNo;
	  
	  private Long kisiNo;
	  private String kisiAd;
	  private String kisiSoyad;
	  private Long kisiTel;
	  private String kisiEmail;
	  
	  public uye(){
		  
	  }
	  
	  public uye(Long tcNo) {
		  this.tcNo=tcNo;
	  }
	  
	  
	public uye(Long tcNo, Long kisiNo, String kisiAd, String kisiSoyad, Long kisiTel, String kisiEmail) {
		super();
		this.tcNo = tcNo;
		this.kisiNo = kisiNo;
		this.kisiAd = kisiAd;
		this.kisiSoyad = kisiSoyad;
		this.kisiTel = kisiTel;
		this.kisiEmail = kisiEmail;
	}




	public uye(Long kisiNo, String kisiAd, String kisiSoyad, Long kisiTel, String kisiEmail) {
		super();
		this.kisiNo = kisiNo;
		this.kisiAd = kisiAd;
		this.kisiSoyad = kisiSoyad;
		this.kisiTel = kisiTel;
		this.kisiEmail = kisiEmail;
	}
	
	


	public uye(String kisiAd, String kisiSoyad, Long kisiTel, String kisiEmail) {
		super();
		this.kisiAd = kisiAd;
		this.kisiSoyad = kisiSoyad;
		this.kisiTel = kisiTel;
		this.kisiEmail = kisiEmail;
	}


	public Long getKisiNo() {
		return kisiNo;
	}
	public void setKisiNo(Long kisiNo) {
		this.kisiNo = kisiNo;
	}
	public String getKisiAd() {
		return kisiAd;
	}
	public void setKisiAd(String kisiAd) {
		this.kisiAd = kisiAd;
	}
	public String getKisiSoyad() {
		return kisiSoyad;
	}
	public void setKisiSoyad(String kisiSoyad) {
		this.kisiSoyad = kisiSoyad;
	}
	public Long getKisiTel() {
		return kisiTel;
	}
	public void setKisiTel(Long kisiTel) {
		this.kisiTel = kisiTel;
	}
	public String getKisiEmail() {
		return kisiEmail;
	}
	public void setKisiEmail(String kisiEmail) {
		this.kisiEmail = kisiEmail;
	}


	public Long getTcNo() {
		return tcNo;
	}


	public void setTcNo(Long tcNo) {
		this.tcNo = tcNo;
	}
	
	

	  
}
