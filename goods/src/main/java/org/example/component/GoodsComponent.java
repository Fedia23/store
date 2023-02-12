package org.example.component;

import org.example.dto.GoodsDTO;
import org.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsComponent {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    @ResponseStatus(code = HttpStatus.OK)
    public List<GoodsDTO> getAllGoods() {
        return goodsService.getAllGoods();
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long addGoods(@RequestBody GoodsDTO goodsDTO) {
        return goodsService.addGoods(goodsDTO);
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public GoodsDTO getById(@PathVariable("id") Long id) {
        return goodsService.getById(id);
    }

    @DeleteMapping("{id}")
    public void removedGoods(@PathVariable("id") Long id) {
        goodsService.removeById(id);
    }
}
