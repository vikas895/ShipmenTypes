package in.nit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhuserType;
	import in.nit.service.IWhuserTypeService;

	@Controller
	@RequestMapping(name="/whuser")
	public class WhuserTypeController {
		
		@Autowired
		private IWhuserTypeService service;
		
		@RequestMapping("/type")
		public String showWhuserType()
		{
			return"HOMEPAGE";
		}
		
	    @RequestMapping(value="/save", method=RequestMethod.POST)
		public String saveWhuserType(@ModelAttribute WhuserType whusertype, Model model)
		{
	          Integer id = service.saveWhuserType(whusertype);   	
	    	 String message = "WhuserType    '"+id+"', saved";
	    	 model.addAttribute("message",message);
			 return "HOMEPAGE";
			
		}
	   /***questMapping("/view")//GET
		public String getAllWhuserTypes(Model model)
		{
			List<WhuserType> list = service.getAllWhuserType();
			model.addAttribute("list",list);
			return "WhuserTypeTypeData";
			 
		}
		@RequestMapping("/delete")
		public String deleteWhuser(@RequestParam("sid")Integer id, Model model)
		{
			service.deleteWhuserTypeType(id);
			String message = "Whuser  '"+id+"' Deleted";
			model.addAttribute("message",message);
			
			List<WhuserType> list = service.getAllWhuserType();
			model.addAttribute("list",list);
			return "WhuserTypeTypeData";***/
			
		}
	



