package com.spring.languageapp.service;

import com.spring.languageapp.model.PhotoPost;
import com.spring.languageapp.model.Quote;
import com.spring.languageapp.repository.PhotoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PhotoService {
    private PhotoRepository photoRepository;


    public List<PhotoPost> getAllPhoto(){
        return photoRepository.findAll();
    }

    public PhotoPost findPhoto(Long id) {
        return photoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "photo was not found"));
    }
}
