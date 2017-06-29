package com.crazybooks.action;

import java.io.ByteArrayInputStream;

import com.crazybooks.etity.RandomValidateCodeUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RandomValidateCodeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ByteArrayInputStream bais;
	
	public ByteArrayInputStream getBais() {
		return bais;
	}

	public void setBais(ByteArrayInputStream bais) {
		this.bais = bais;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		RandomValidateCodeUtil rvcu=RandomValidateCodeUtil.Instance();
		this.setBais(rvcu.getImage());
		ActionContext.getContext().getSession().put("validateCode", rvcu.getStr());
		return SUCCESS;
	}
	
}
