package com.duoduo.excel;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/excel")
public class ExcelController {
	
	@RequestMapping("/test")
	public String test() {
		return "success";
	}
	
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file) {
		String name = "testExcel";
		if (!file.isEmpty()) {
			try {
				System.out.println(file.getContentType());
				System.out.println(file.getName());
				System.out.println(file.getOriginalFilename());
				System.out.println(file.getSize());
				
				String fileName = file.getOriginalFilename().replaceFirst(file.getName(), "testabc");
				
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				stream.write(bytes);
				stream.close();
				return "You successfully uploaded " + name + " into " + name + "-uploaded !";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name + " because the file was empty.";
		}
	}

}
