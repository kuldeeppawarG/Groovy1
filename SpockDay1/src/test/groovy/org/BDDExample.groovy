package org

import spock.lang.Specification

class BDDExample extends Specification{
	
	def "Scenario: multiply"(){
		given: "An integer with value 10"
		def i= 10
		
		when: "This number is multiplied with 2"
		i = i*2
		
		then: "The final value is 20"
		println i
		assert 20 ==i
	}

}
