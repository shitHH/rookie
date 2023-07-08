package com.property.service.impl;

import com.property.dao.PetDao;
import com.property.po.Pet;
import com.property.service.PetService;
import com.property.vo.PetVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bugger  chengxia
 * @date 2022-09-12 0:26
 */
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    PetDao petDao;

    @Override
    public List<Pet> findAll() {
        return petDao.findAll();
    }

    @Override
    public Pet findById(int pet_id) {
        return petDao.findById(pet_id);
    }

    @Override
    public boolean addPet(Pet pet) {
        return petDao.addPet(pet)>0?true:false;
    }

    @Override
    public boolean deletePet(int pet_id) {
        return petDao.deletePet(pet_id)>0?true:false;
    }

    @Override
    public boolean updatePet(Pet pet) {
        return petDao.updatePet(pet)>0?true:false;
    }

    @Override
    public List<PetVO> findVOByVid(int village_vid) {
        return petDao.findVOByVid(village_vid);
    }

    @Override
    public boolean deleteById(int[] array) {
        return petDao.deleteById(array)>0?true:false;
    }

    @Override
    public List<PetVO> findByOwner_id(int owner_id) {
        return petDao.findByOwner_id(owner_id);
    }

    @Override
    public List<PetVO> findVOAll() {
        return petDao.findVOAll();
    }
}
