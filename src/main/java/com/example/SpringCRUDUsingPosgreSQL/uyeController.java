package com.example.SpringCRUDUsingPosgreSQL;

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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class uyeController {
	
	@Autowired
	private uyeRepository uyeRepository;
	
	@GetMapping("/uye")
	public List<uye> getUyeler(){
		return uyeRepository.findAll();				
	}
	
	@GetMapping("/uye/{id}")
	public uye getUye(@PathVariable Long id){
		return uyeRepository.getOne(id);			
	}
	
	@PostMapping("/uye")
	public uye createUye(@Valid @RequestBody uye uye) {
		return uyeRepository.save(uye);
	}
	
	@PutMapping("/uye/{id}")
	public uye updateUye (@PathVariable Long id,
			@Valid @RequestBody uye questionRequest) {
		return uyeRepository.findById(id)
			 .map(uye -> {
				 uye.setKisiAd(questionRequest.getKisiAd());
				 uye.setKisiEmail(questionRequest.getKisiEmail());
				 uye.setKisiNo(questionRequest.getKisiNo());
				 uye.setKisiSoyad(questionRequest.getKisiSoyad());
				 uye.setKisiTel(questionRequest.getKisiTel());				                       
                 return uyeRepository.save(uye);
             }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));
		
	}
	
	
	@DeleteMapping("/uye/{id}")
	public ResponseEntity<?> deleteUye(@PathVariable Long id){
		return uyeRepository.findById(id)
				.map(uye->{
					uyeRepository.delete(uye);
					return ResponseEntity.ok().build();
				}).orElseThrow(()-> new ResourceNotFoundException("Question not found with id"+id));
	}
	
	

}
