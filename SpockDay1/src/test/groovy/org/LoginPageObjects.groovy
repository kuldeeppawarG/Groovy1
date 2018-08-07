package org

import geb.Page

class LoginPageObjects extends Page{

	static content={
		name = {$("input","#userName")}     //here $ is represent driver.webelement
		password = {$("input","#password")}
		loginbutton = {$("login","#login")}
	}
}
