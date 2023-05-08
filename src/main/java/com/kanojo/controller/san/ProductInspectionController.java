package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;
import com.kanojo.service.san.ProductInspectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product-inspection")
public class ProductInspectionController {

    @Resource
    private ProductInspectionService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) ProductInspectionParam param) {
        List<ProductInspection> list = service.list(param);
        return Result.success(list);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProductInspection productInspection) {
        return service.update(productInspection) ? Result.success() : Result.failed();
    }

    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable Long id) {
        ProductInspection productInspection = service.getById(id);
        return Result.success(productInspection);
    }

    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        return service.delete(id) ? Result.success() : Result.failed();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ProductInspection productInspection) {
        return service.add(productInspection) ? Result.success() : Result.failed();
    }
}
