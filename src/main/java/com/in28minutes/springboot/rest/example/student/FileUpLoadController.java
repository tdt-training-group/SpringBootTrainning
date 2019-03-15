package com.in28minutes.springboot.rest.example.student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUpLoadController {
	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";

	@RequestMapping("/")
	public String UploadPage(Model model) {
		return "uploadview";
	}

	@RequestMapping("/upload")
	public String upload(Model model, @RequestParam("file") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for (MultipartFile file : files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename());
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new UploadBoundException();
			}
		}
		model.addAttribute("msg", "Successfully uploaded file" + fileNames.toString());
		return "uploadstatusview";
	}
}
