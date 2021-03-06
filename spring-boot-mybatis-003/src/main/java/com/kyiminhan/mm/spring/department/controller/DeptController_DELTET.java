package com.kyiminhan.mm.spring.department.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DeptController_DELTET.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_DELTET.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DeptController_DELTET {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @param attributes the attributes
	 * @param session the session
	 * @return String
	 */
	@GetMapping(value = "/delete")
	public String delete(@ModelAttribute("id") final String id, final RedirectAttributes attributes,
			final HttpSession session) {
		@SuppressWarnings({ "unchecked", "unused" })
		final Collection<Department> departments = (Collection<Department>) session.getAttribute("departments");
		// TODO check validation to delete
		this.departmentService.delete(this.departmentService.findById(Integer.valueOf(id)));
		return "redirect:/department/list";
	}
}