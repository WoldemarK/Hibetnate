package com.example.hibetnate.Service;

import com.example.hibetnate.Repository.DetailRepo;
import com.example.hibetnate.model.Detail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetailService {

    private final DetailRepo detailRepo;

    public Detail addDetail(Detail detail) {
        return detailRepo.save(detail);
    }

    public void deleteById(Long id) {
        detailRepo.deleteById(id);
    }

    public List<Detail> getAllDetail() {
        return detailRepo.findAll();
    }

    public Optional<Detail> getByIdDet(Long id){
        return detailRepo.findById(id);
    }
}
