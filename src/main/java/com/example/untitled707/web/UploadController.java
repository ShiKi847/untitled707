package com.example.untitled707.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @GetMapping("/upload")
    public String uploadForm() {
        return "upload";
    }
    @PostMapping("/upload")
    public String upload(MultipartFile[]ups, @Value("${file.upload.dir}")String path) throws IOException {
        for (MultipartFile multipartFile : ups) {
            if(multipartFile.isEmpty()) {continue;}
            multipartFile.transferTo(new File(path,multipartFile.getOriginalFilename()));
        }
        return "redirect:index";
    }
}
