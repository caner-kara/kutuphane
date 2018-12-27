package com.example.SpringCRUDUsingPosgreSQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kitapRepository extends JpaRepository<kitap, Long> {

}
