package com.example.imagegallery.repository;

import com.example.imagegallery.entity.ImageGallery;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageGallery,Long> {
}
