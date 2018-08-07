package org

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenExample extends Specification  {

	@Unroll('#x plus #y is equals to #z')
	def "Data-Driven Testing"(){
		//expect: "The sum of x and y is equal to z"
		z==x+y
		
		where: "The data table is given below:"
		
		x |y |z
		10|20|30
		2|3|5
		5|1|6
	}
}
