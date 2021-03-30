package com.team13.product;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BarbequePartService {

    @Autowired
    private BarbequePartRepository barbequePartRepository;

    public List<BarbequePart> getAllParts(){
        List<BarbequePart> returnList = new ArrayList<>();
        for (BarbequePart bbqPart : barbequePartRepository.findAll()) {
            returnList.add(bbqPart);
        }
        return returnList;
    }

    public BarbequePart getProduct(String name){
        return barbequePartRepository.findById(name).orElse(null);
    }

    public void addProduct(BarbequePart barbequePart){
        barbequePartRepository.save(barbequePart);
    }

    public void updateProduct(BarbequePart barbequePart){
        barbequePartRepository.save(barbequePart);
    }

    public void deleteProduct(String id){
        barbequePartRepository.deleteById(id);
    }

    public void deleteProduct(BarbequePart barbequePart){
        barbequePartRepository.delete(barbequePart);
    }
}
