package spring.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	
	//field
	
	//constructor
	
	public TestController() {
		System.out.println(":: TestController default constructor call");
	}
	
	
	@RequestMapping("/testView01.do")
	public ModelAndView testView01(){
		System.out.println("Å×½ºÆ®ºä01 ¤µ¤¼¤¼");
		
		//viewname¸¸ °°´Â ¸ðµ¨¿£ºä°´Ã¼¸®ÅÏ
		return new ModelAndView("/test/testView.jsp");
	}
	
	@RequestMapping("/testView02.do")
	public String testView02(){
		System.out.println("Å×½ºÆ®ºä0 ¤µ¤¼¤¼");
		
		//viewname¸¸ °°´Â ¸ðµ¨¿£ºä°´Ã¼¸®ÅÏ
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView03.do")
	public String testView03(@RequestParam("abc") int no, @RequestParam("def") String name){
		System.out.println("Å×½ºÆ®ºä03 ¤µ¤¼¤¼");
		
		System.out.println("no : "+ no +"=== name : " + name);
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView04.do")
	public String testView04(@RequestParam(value="abc") int no, @RequestParam(value="def", required=false) String name){
		System.out.println("Å×½ºÆ®ºä04 ¤µ¤¼¤¼");
		
		System.out.println("no : "+ no +"=== name : " + name);
		return "/test/testView.jsp";
	}
	
	@RequestMapping("/testView05.do")
	public String testView05(@RequestParam(value="abc", defaultValue="1") int no,
			@RequestParam(value="def", required=false) String name			
			)
	{
		System.out.println("Å×½ºÆ®ºä05 ¤µ¤¼¤¼");
		
		System.out.println("no : "+ no +"=== name : " + name);

		return "/test/testView.jsp";
	}
	
}
