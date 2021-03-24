package com.team2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team2.bean.FoodBean;


@WebServlet("/SearchAllFood")
public class SearchAllFood extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Dao method 
		FoodDaoImpl foodDao = new FoodDaoImpl();
		List<FoodBean> foods = foodDao.getAllFoods();
		request.setAttribute("foods", foods);
		request.getRequestDispatcher("/web/AllFood.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
