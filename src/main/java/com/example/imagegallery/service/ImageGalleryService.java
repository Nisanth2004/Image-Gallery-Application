package com.example.imagegallery.service;

import com.example.imagegallery.entity.ImageGallery;
import com.example.imagegallery.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageGalleryService {

    @Autowired
    private ImageRepository imageGalleryRepository;

    public void saveImage(ImageGallery imageGallery) {
        imageGalleryRepository.save(imageGallery);
    }

    public List<ImageGallery> getAllActiveImages() {
        return imageGalleryRepository.findAll();
    }

    public Optional<ImageGallery> getImageById(Long id) {
        return imageGalleryRepository.findById(id);
    }
}