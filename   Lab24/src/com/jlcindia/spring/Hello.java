package com.jlcindia.spring;

public class Hello {
	private A aobj;
	private B bobj;
	public void setAobj(B bobj){
		this.aobj=aobj;
	}
	public void setBobj(B bobj){
		this.bobj=bobj;
	}
	public void show(){
		aobj.showA();
		bobj.showB();
	}
}
