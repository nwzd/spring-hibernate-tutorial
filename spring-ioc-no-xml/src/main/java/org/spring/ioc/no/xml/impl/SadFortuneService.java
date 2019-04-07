package org.spring.ioc.no.xml.impl;

import org.spring.ioc.no.xml.FortuneService;

public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Sad Fortune";
	}

}
