package org.example.mapper;

import org.example.dto.GoodsDTO;
import org.example.entity.Goods;
import org.springframework.stereotype.Component;

@Component
public class GoodsMapper {

    public GoodsDTO toDTO(Goods goods) {
        if (goods == null) {
            return null;
        }

        return new GoodsDTO(goods.getId(), goods.getName(), goods.getCategory(), goods.getSize(), goods.getColor(),
                goods.getCount(), goods.getPrice(), goods.getDescription());
    }

    public Goods fromDTO(GoodsDTO dto) {
        Goods goods = new Goods();
        goods.setId(dto.getId());
        goods.setName(dto.getName());
        goods.setCategory(dto.getCategory());
        goods.setSize(dto.getSize());
        goods.setColor(dto.getColor());
        goods.setCount(dto.getCount());
        goods.setPrice(dto.getPrice());
        goods.setDescription(dto.getDescription());

        return goods;
    }
}
