package org

import spock.lang.Specification

class Addition extends Specification {
		
		def "Scenario: addition"(){
			given: "An integer with value 10"
			def i= 10
			
			when: "This number is added with 2"
			i = i+2
			
			then: "The final value is 12"
			println i
			assert 20 ==i
		}
	}
