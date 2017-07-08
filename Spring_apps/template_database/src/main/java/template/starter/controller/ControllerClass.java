package template.starter.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import template.starter.crudrepository.CrudOperation;
import template.starter.domain.EmployeeEntity;
import template.starter.form.employee;
@Controller
public class ControllerClass {
	@Autowired
	private CrudOperation 	crudoperation; 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(employee employee) {
		return "index";
	}
 
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addNewEmployee(@Valid  employee employee, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		crudoperation.save(new EmployeeEntity(employee.getId(), employee.getName(),employee.getTeam(),employee.getNo()));
		model.addAttribute("empList", crudoperation.findAll());
		return "redirect:result";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String showAllEmployees(Model model) {
		model.addAttribute("empList", crudoperation.findAll());
		return "result";
	}

}
