package io.ionuth.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.ionuth.api.CustomerApi;
import io.ionuth.api.model.Customer;

@RestController
public class CustomerResource implements CustomerApi {
	
	
	@Override
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> custList = createCustomerList();
		return ResponseEntity.status(HttpStatus.OK).body(custList);
	}
	
	/*
	 * it seems we do not need to provide the @PathVariable on the method parameter to match the function signature from the interface
	 * also it "inherits" the @RequestMapping annotation from the interface declaration
	 */
	@Override
	public ResponseEntity<Customer> getCustomerById(Long id) {
		List<Customer> custList = createCustomerList();
		Optional<Customer> optCust = custList.stream().filter( cust -> cust.getId()==id ).findAny();
		if( optCust.isPresent() ) {
			return ResponseEntity.status(HttpStatus.OK).body(optCust.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	
	/*
	@Override
	public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "customer identifier", required=true) @PathVariable("id") Long id) {
		List<Customer> custList = createCustomerList();
		Optional<Customer> optCust = custList.stream().filter( cust -> cust.getId()==id ).findAny();
		if( optCust.isPresent() ) {
			return ResponseEntity.status(HttpStatus.OK).body(optCust.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	*/
	
	
	private List<Customer> createCustomerList() {
		
		List<Customer> custList = new ArrayList<Customer>();
		
		Customer cust = new Customer();
		cust.setId(1L);
		cust.setFirstName("Gigel");
		cust.setLastName("Gigescu");
		cust.setUsername("gigi_gigescu");
		cust.setPassword("****");
		cust.setEmail("ggicescu@yahoo.com");
		cust.setPhone("12345");
		custList.add(cust);
		
		cust = new Customer();
		cust.setId(2L);
		cust.setFirstName("Pop");
		cust.setLastName("Popescu");
		cust.setUsername("pop_popescu");
		cust.setPassword("******");
		cust.setEmail("ppopescu@gmail.com");
		cust.setPhone("8889990");
		custList.add(cust);
		
		return custList;
		
	}
	
}
