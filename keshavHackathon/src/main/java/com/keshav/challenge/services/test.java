package com.keshav.challenge.services;

import org.springframework.stereotype.Service;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

@Service
public class test {

	public DescribeTableResult getTable() {

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
				new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "ap-south-1")).build();
		ListTablesResult table = client.listTables();
		DescribeTableResult response = client.describeTable(table.getTableNames().get(0));
		System.out.println("table " + response.toString());
		return response;
	}
}
