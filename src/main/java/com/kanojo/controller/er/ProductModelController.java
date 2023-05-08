package com.kanojo.controller.er;

import com.kanojo.common.param.PageParam;
import com.kanojo.common.result.Result;
import com.kanojo.domain.er.ProductModel;
import com.kanojo.service.yi.ProductModelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product-model")
public class ProductModelController {
    @Resource
    private ProductModelService service;

    @PostMapping("/list")
    public Result list(@RequestBody(required = false) PageParam param) {
        List<ProductModel> list = service.list(param != null ? param : new PageParam());
        return Result.success(list);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProductModel productModel) {
        return service.update(productModel) ? Result.success() : Result.failed();
    }
}
