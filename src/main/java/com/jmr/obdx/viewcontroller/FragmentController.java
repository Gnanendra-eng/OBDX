package com.jmr.obdx.viewcontroller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/fragment")
public class FragmentController {

	@RequestMapping(value = "/{templatename}", method = RequestMethod.GET)
	public String getFragmentTemplate(@PathVariable String templatename, HttpServletResponse response) {
		return templatename;
	}
}
