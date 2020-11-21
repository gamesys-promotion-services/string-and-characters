package com.example.demo.enums;

import com.example.demo.enums.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class EnumApplication {

	public static void main(String[] args) {

		System.out.println(EnumJiraType.valueOf("INC").ordinal());

		for (EnumJiraType jiraType: EnumJiraType.values()) {
//			System.out.println(jiraType.ordinal());
			if (jiraType.ordinal()%2==0){
				System.out.println(jiraType.ordinal() + " -  " + jiraType + " - "+jiraType.getValue());
			}
		}
	}
}