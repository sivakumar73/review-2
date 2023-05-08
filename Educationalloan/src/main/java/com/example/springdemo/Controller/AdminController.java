package com.example.springdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Model.LoanApplicationModel;
import com.example.springdemo.Service.AdminService;

@RestController


	public class AdminController {
		
		@Autowired
		AdminService aserv;
		@GetMapping("/getAdmin")

		public List<LoanApplicationModel> getAdmin()
		{
			List<LoanApplicationModel>  alist=aserv.getAdmin();
			return alist;
		}
		@PostMapping("/postuser")
		public LoanApplicationModel saveDetails(@RequestBody LoanApplicationModel lobj)
		{
			return aserv.saveDetails(lobj);
					
		}
	}

