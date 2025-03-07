package com.sist.model;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.*;
import com.sist.vo.*;
import com.sist.dao.*;
@Controller
public class MainModel {
	@RequestMapping("main/main.do")
	  public String main_main(HttpServletRequest request,HttpServletResponse response)
	  {
		CocktailVO vo=CocktailDAO.cocktailMainHouseData();
		List<CocktailVO> cList=CocktailDAO.cocktailMainHouseData8();


		request.setAttribute("cvo", vo);
		request.setAttribute("cList", cList);
		  
		return "../main/main.jsp";
		
	  }

}
