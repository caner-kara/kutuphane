package com.example.SpringCRUDUsingPosgreSQL;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kitapController {
	
	@Autowired
	private kitapRepository kitapRepository;
	
	@GetMapping("/kitap")
	public List<kitap> getKitaplar(){
		return kitapRepository.findAll();				
	}
	
	@GetMapping("/kitap/{kitap_no}")
	public kitap getKitap(@PathVariable Long id){
		return kitapRepository.getOne(id);			
	}
	
	@PostMapping("/kitap")
	public kitap createKitap(@Valid @RequestBody kitap kitap) {
		return kitapRepository.save(kitap);
	}
	
	@PutMapping("/kitap/{id}")
	public kitap updateKitap (@PathVariable Long id,
			@Valid @RequestBody kitap questionRequest) {
		return kitapRepository.findById(id)
			 .map(kitap -> {
				// kitap aQuestion =questionRequest;
                 //kitap.setKatRafNo(questionRequest.getKatRafNo(););
                 kitap.setKitapAdi(questionRequest.getKitapAdi());
                 kitap.setKonuNo(questionRequest.getKonuNo());
                 kitap.setSayfaSayisi(questionRequest.getSayfaSayisi());
                 kitap.setTurNo(questionRequest.getTurNo());
                 kitap.setYayinEviNo(questionRequest.getYayinEviNo());
                 kitap.setKatRafNo(questionRequest.getKatRafNo());
                 //question.setDescription(questionRequest.getDescription());
              
                 return kitapRepository.save(kitap);
             }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));
		
	}
	
	@DeleteMapping("/kitap/{id}")
	public ResponseEntity<?> deleteKitap(@PathVariable Long id){
		return kitapRepository.findById(id)
				.map(kitap->{
					kitapRepository.delete(kitap);
					return ResponseEntity.ok().build();
				}).orElseThrow(()-> new ResourceNotFoundException("Question not found with id"+id));
	}
	
	
	

}
