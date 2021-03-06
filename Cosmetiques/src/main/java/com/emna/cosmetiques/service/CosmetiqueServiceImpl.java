package com.emna.cosmetiques.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emna.cosmetiques.entities.Cosmetique;
import com.emna.cosmetiques.entities.Marque;
import com.emna.cosmetiques.repos.CosmetiqueRepository;

@Service
public class CosmetiqueServiceImpl implements CosmetiqueService {

	@Autowired
	CosmetiqueRepository cosmetiqueRepository;
	
	@Override
	public Cosmetique saveCosmetique(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public Cosmetique updateCosmetique(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public void deleteCosmetique(Cosmetique c) {
		cosmetiqueRepository.delete(c);
		
	}

	@Override
	public void deleteCosmetiqueById(Long id) {
		cosmetiqueRepository.deleteById(id);
	}

	@Override
	public Cosmetique getCosmetique(Long id) {
		return cosmetiqueRepository.findById(id).get();
		
	}

	@Override
	public List<Cosmetique> getAllCosmetiques() {

		return cosmetiqueRepository.findAll() ;
	}

	@Override
	public Page<Cosmetique> getAllCosmetiquesParPage(int page, int size) {
		return cosmetiqueRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Cosmetique> findByNomCosmetique(String nom) {
		return cosmetiqueRepository.findByNomCosmetique(nom);
	}

	

	@Override
	public List<Cosmetique> findByNomPrix(String nom, Double prix) {
		return cosmetiqueRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Cosmetique> findByMarque(Marque marque) {
		return cosmetiqueRepository.findByMarque(marque);
	}

	@Override
	public List<Cosmetique> findByMarqueIdM(Long id) {
		return cosmetiqueRepository.findByMarqueIdM(id);
	}

	@Override
	public List<Cosmetique> findByOrderByNomCosmetiqueAsc() {
		return cosmetiqueRepository.findByOrderByNomCosmetiqueAsc();
	}

	@Override
	public List<Cosmetique> trierCosmetiquesNomsPrix() {
		return cosmetiqueRepository.trierCosmetiquesNomsPrix();
	}

}
