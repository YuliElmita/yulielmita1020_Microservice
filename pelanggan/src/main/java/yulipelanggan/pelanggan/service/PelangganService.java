package yulipelanggan.pelanggan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yulipelanggan.pelanggan.model.Pelanggan;
import yulipelanggan.pelanggan.repository.PelangganRepository;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository pelangganRepository;

    public List<Pelanggan> getAll() {
        return pelangganRepository.findAll();
    }

    public Pelanggan save(Pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }

    public Pelanggan update(Long id, Pelanggan pelanggan) {
        pelanggan.setId(id);
        return pelangganRepository.save(pelanggan);
    }

    public void delete(Long id) {
        pelangganRepository.deleteById(id);
    }
}