package com.spring.framework.basics.spring.bean.property;

public class OuterBean {

	InnerBean target;

	public InnerBean getTarget() {
		return target;
	}

	public void setTarget(InnerBean target) {
		this.target = target;
	}
}
