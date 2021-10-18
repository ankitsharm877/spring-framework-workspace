package com.spring.framework.basics.beans;

public class DemoBean{

	DependentBean dependentBean = null;
	
	public DemoBean(DependentBean dependentBean) {
		this.dependentBean = dependentBean;
	}
	 
//	public void setDependentBean(DependentBean dependentBean) {
//	    this.dependentBean = dependentBean;
//	}
	
	public DependentBean getDependency() {
		return dependentBean;
	}

}
