package com.kanojo.controller.er;

import com.kanojo.common.result.Result;
import com.kanojo.domain.er.Complaint;
import com.kanojo.service.er.ComplaintService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/com")
public class ComplaintController {
    @Resource
    private ComplaintService service;

    @GetMapping("/list")
    public Result list() {
        List<Complaint> list = service.list();
        return Result.success(list);
    }

    @GetMapping("/download/{filename}")
    public void download(@PathVariable String filename, HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("D:/Temp/" + filename);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;fileName=" + filename);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }

        outputStream.close();
        fileInputStream.close();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Complaint complaint) {
        return service.add(complaint) ? Result.success() : Result.failed();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Complaint complaint) {
        return service.update(complaint) ? Result.success() : Result.failed();
    }

    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable Long id) {
        Complaint complaint = service.getById(id);
        return Result.success(complaint);
    }
}
