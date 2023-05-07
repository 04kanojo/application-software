package com.kanojo.controller.yi;

import com.kanojo.common.result.Result;
import com.kanojo.domain.yi.Announcement;
import com.kanojo.service.yi.AnnouncementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/an")
public class AnnouncementController {
    @Resource
    private AnnouncementService announcementService;

    @GetMapping("/list")
    public Result list() {
        List<Announcement> list = announcementService.list();
        return list.size() != 0 ? Result.success(list) : Result.success("暂无数据");
    }

    @GetMapping("/download/picture/{fileName}")
    public void download(@PathVariable String fileName, HttpServletResponse response) {
        //设置文件路径
        File file = new File("D:\\Temp\\" + fileName);
        if (file.exists()) {
            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
//                return Result.failed("下载成功");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
//        return Result.failed("下载失败");
    }
}
