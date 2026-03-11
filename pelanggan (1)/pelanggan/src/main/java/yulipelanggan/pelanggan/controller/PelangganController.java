package yulipelanggan.pelanggan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import yulipelanggan.pelanggan.model.Pelanggan;
import yulipelanggan.pelanggan.service.PelangganService;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganController {

    @Autowired
    private PelangganService pelangganService;

    @GetMapping
    public List<Pelanggan> getAll() {
        return pelangganService.getAll();
    }

    @PostMapping
    public Pelanggan create(@RequestBody Pelanggan pelanggan) {
        return pelangganService.save(pelanggan);
    }
}