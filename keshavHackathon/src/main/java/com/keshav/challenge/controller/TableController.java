package com.keshav.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;

@RestController
public class TableController {

	@Autowired
	private com.keshav.challenge.services.test test;

	@GetMapping("/get-table")
	public DescribeTableResult table() {
		return test.getTable();
	}

}
