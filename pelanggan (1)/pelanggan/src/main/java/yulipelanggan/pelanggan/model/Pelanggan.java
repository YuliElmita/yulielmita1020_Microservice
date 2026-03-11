package yulipelanggan.pelanggan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity(name = "pelanggan")
@Data
public class Pelanggan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String nama;
    private String email;
    private String alamat;
    private String noHp;

   
}