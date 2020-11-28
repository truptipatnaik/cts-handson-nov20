package com.org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
		
	@RequestMapping(value = "/sortByNameAscendingorder", method = RequestMethod.GET)
	public ModelAndView getAllEmployeeNamesinAscendingOrder() {
	ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeNamesinAscendingOrder());
	return mav;
	}
	
	@RequestMapping(value="/sortByIdAscendingorder" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInAscOrder());
		return mav;
	}
	@RequestMapping(value="/sortByIdDescendingorder" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInDescOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryAscendingorder" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInAscOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryDescendeningorder" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInDescOrder());
		return mav;
	}
	
	}


