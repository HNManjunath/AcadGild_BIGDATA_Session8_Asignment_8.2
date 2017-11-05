package com.bigdata;

import org.apache.hadoop.hive.ql.exec.UDF;

//below class is to implement the Concatenation of string with delimiters 
public class ConcatingString extends UDF {
	public String evaluate(String input) {
		return String.join(",", input.split(" "));
	}
}