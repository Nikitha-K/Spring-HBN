		package mvchbnemp;
		
		
		import java.util.List;

		
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.stereotype.Controller;
		import org.springframework.web.bind.annotation.ModelAttribute;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RequestMethod;
		import org.springframework.web.servlet.ModelAndView;
		
		@Controller
		public class EmployeeController {
		@Autowired
		EmployeeDao dao;
		
		@RequestMapping(value="/addemp",method = RequestMethod.GET)
		public String ShowAddEmployeeForm(){
		return "AddEmployee";
		}
		
		@RequestMapping(value="/addemp",method = RequestMethod.POST)
		public ModelAndView addEmployee(@ModelAttribute("emp")
		Employee emp){
		ModelAndView mav = new ModelAndView();
		dao.addEmployee(emp);
		mav.setViewName("redirect:viewemp");
		return mav;
		}
		
		@RequestMapping(value="/viewemp")
		public ModelAndView getEmployee(){
		ModelAndView mav = new ModelAndView();
		List<Employee> list = dao.getEmployee();
		mav.addObject("emp",list);
		mav.setViewName("ViewEmployee");
		return mav;
		}
		
		@RequestMapping(value="/updateemp",method = RequestMethod.GET)
		public String ShowUpdateEmployeeForm(){
		return "UpdateEmp";
		}
		
		@RequestMapping(value="/updateemp",method = RequestMethod.POST)
		public ModelAndView updateemp(@ModelAttribute("emp")
		Employee emp){
		ModelAndView mav = new ModelAndView();
		dao.updateemp(emp);
		mav.setViewName("redirect:viewemp");
		return mav;
		}
		
		@RequestMapping(value="/deleteemp",method = RequestMethod.GET)
		public String ShowDeleteEmployeeForm(){
		return "DeleteEmp";
		}
		
		@RequestMapping(value="/deleteemp",method = RequestMethod.POST)
		public ModelAndView deleteemp(@ModelAttribute("emp")
		Employee emp){
		ModelAndView mav = new ModelAndView();
		dao.deleteemp(emp);
		mav.setViewName("redirect:viewemp");
		return mav;
		}
		
		}
