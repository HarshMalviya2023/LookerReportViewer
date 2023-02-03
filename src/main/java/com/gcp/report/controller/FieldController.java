package com.gcp.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.report.entity.Fields;
import com.gcp.report.service.FieldService;

@Controller
public class FieldController {

	
	@Autowired
	private FieldService service;
	
	
	@GetMapping("/showNewForm")
	public String showNewForm(Model model){
		Fields field=new Fields();
		model.addAttribute("field",field);
		return "addReport";
	}
	
	@PostMapping("/addfield")
	public String addFeilds(@ModelAttribute("field") Fields field) {
		this.service.saveFields(field);
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String findAllFields(Model model){
		model.addAttribute("listReports",service.getAllFields());
		return "homePage";
	}
	@GetMapping("/allReports")
	public String findAllField(Model model){
		model.addAttribute("listReports",service.getAllFields());
		return "allReports";
	}

	
//	@GetMapping("/report/{id}")
//	public Fields findFieldById(@PathVariable int id) {
//		return service.getFieldsById(id);
//	}
//	
//	@GetMapping("/update/{id}")
//	public String updateFeilds(@PathVariable (value="id") int id,Model model) {
//		Fields field=new Fields();
//		model.addAttribute("field",field);
//		return "update_form";
//	}

	
	
//	
	@GetMapping("/delete/{id}")
	public String deleteField(@PathVariable (value="id") int id) {
		this.service.deleteField(id);
		return "redirect:/allReports";
	}
	
	
}
