package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prefectureSearch")
public class PrefectureSearchController {
	/*	@Autowired
		private PrefectureMapper prefectureMapper;
	*/
	@RequestMapping("/input")
	public String input() {
		return "prefecture/prefectureSearchInput";
	}

	@RequestMapping("/searchById")
	public String searchById(@RequestParam Integer prefectureId, Model model) {
	//	Prefecture prefecture = prefectureMapper.selectByPrimaryKey(prefectureId);
	//	model.addAttribute("prefecture", prefecture);
		return "prefecture/prefectureSearchDetail";
	}
}