package com.yuli.produk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuli.produk.model.produk;
import com.yuli.produk.repository.produkRepository;

@Service
public class ProdukService {
    @Autowired
    private produkRepository produkRepository;

    public List<produk> getAllProduks() {
        return produkRepository.findAll();
    }

    public produk getProdukbyId(Long id) {
        return produkRepository.findById(id).orElse(null);
    }

    public produk createProduk(produk produk) {
        return produkRepository.save(produk);
    }

    public void deleteProduk(Long id) {
        produkRepository.deleteById(id);
    }
}