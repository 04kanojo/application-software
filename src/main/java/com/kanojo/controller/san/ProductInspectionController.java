package com.kanojo.controller.san;

import com.kanojo.common.result.Result;
import com.kanojo.domain.san.ProductInspection;
import com.kanojo.domain.san.param.ProductInspectionParam;
import com.kanojo.service.san.ProductInspectionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
