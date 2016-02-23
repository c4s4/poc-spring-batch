package com.sqli;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Retry {

	public static void main(String[] args)
        throws Exception {
		String[] springConfig  = {
			"spring/batch/config/database.xml", 
			"spring/batch/config/context.xml",
			"spring/batch/jobs/job-retry.xml" 
		};
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("retryJob");
		JobExecution execution = jobLauncher.run(job, new JobParameters());
		System.out.println("Exit Status : " + execution.getStatus());
		System.out.println("Done");
	}
}
