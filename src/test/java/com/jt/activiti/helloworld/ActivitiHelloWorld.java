/**
 * @author liuze
 *
 * Jan 20, 2014
 */
package com.jt.activiti.helloworld;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;

public class ActivitiHelloWorld {
	
	private ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	private RepositoryService repositoryService = processEngine.getRepositoryService();
	@Test
	public void testRepository() {
		String resource = "bpmn/billing.bpmn";
		repositoryService.createDeployment().
		  addClasspathResource(resource).name("hello")
		  .deploy();
		
	}

}
