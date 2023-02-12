package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.GoodsDTO;
import org.example.entity.Goods;
import org.example.mapper.GoodsMapper;
import org.example.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GoodsService {

    private GoodsRepository repository;
    private GoodsMapper mapper;

    public GoodsDTO getById(Long id) {
        if(Objects.isNull(id)) {
            return null;
        }

        return mapper.toDTO(repository.getReferenceById(id));
    }

    public Long addGoods(GoodsDTO dto) {
        if (Objects.isNull(dto)) {
            throw new ApplicationContextException("You are trying to add an empty product");
        }

        return repository.save(mapper.fromDTO(dto)).getId();
    }

    public void removeById(Long id) {
        if(Objects.isNull(id)) {
            throw new ApplicationContextException("Please provide id");
        }

        repository.deleteById(id);
    }

    public List<GoodsDTO> getAllGoods() {
        return repository.findAll().stream().map(g -> mapper.toDTO(g)).collect(Collectors.toList());
    }
}
