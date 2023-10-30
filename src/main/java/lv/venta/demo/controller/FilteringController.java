package lv.venta.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lv.venta.demo.services.IFilteringService;

@Controller
public class FilteringController {

	
	//man pagaidām ir tikai book-page
	@Autowired
	private IFilteringService filtService;
	
	@GetMapping("/book/author/{id}")//localhost:8080/book/author/1
	public String getBooksByAuthorByID(Model model,
			@PathVariable int id)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllBooksByAuthorByID(id));
		return "book-page";//atvers book-page.html
	}
	

	@GetMapping("/book/eksemplars")//localhost:8080/book/eksemplars
	public String getBooksByTheirNumber(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllBooksByTheirNumber());
		return "book-page";//atvers book-page.html
	}
	
	@GetMapping("/book/division/{id}")//localhost:8080/book/division/1
	public String getBooksByTheirDivision(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllBooksByTheirDivision(ID));
		return "book-page";//atvers book-page.html
	}
	
	@GetMapping("/user/book/{id}")//localhost:8080/book/author/1
	public String getBookUsersByID(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllBookUsersByID(ID));
		return "user-page";//atvers user-page.html
	}
	
	@GetMapping("/user/now/author/{id}")//localhost:8080/user/now/author/1
	public String getUserWhoIsUsingTheBookNow(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getUserWhoIsUsingTheBookNow(ID));
		return "one-user-page";//atvers user-page.html
	}
	
	@GetMapping("/book/publisher/{id}")//localhost:8080/book/publisher/1
	public String getBooksByPublisherByID(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllBooksByPublisherByID(ID));
		return "book-page";//atvers user-page.html
	}
	
	@GetMapping("/users")//localhost:8080/users
	public String getLibraryUsers(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllLibraryUsers());
		return "user-page";//atvers user-page.html
	}
	
	@GetMapping("/eksemplarus/book/{id}")//localhost:8080/eksemplarus/book/1
	public String getEksemplarusByID(Model model,
			@PathVariable(name = "ID")int ID)
	{//                                            servisa funk mēs izsaucam
		model.addAttribute("object", filtService.getAllEksemplarusByID(ID));
		return "eksemplaru-page";//atvers user-page.html
	}
	
	
	
	
}
