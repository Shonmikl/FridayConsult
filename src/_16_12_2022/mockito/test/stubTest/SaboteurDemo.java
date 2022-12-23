//package _16_12_2022.mockito.test.stubTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import _16_12_2022.mockito.stub.*;
//import org.junit.jupiter.api.Test;
//
//
//class SaboteurDemo {
//
//	@Test
//	public void testInvalidCustomer() {
//	  Customer customer = new Customer();
//	  CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);
//
//	  when(customerRepository.getCustomerById(anyLong()))
//	    					 .thenThrow(new CustomerNotFoundException());
//
//	  CustomerService customerService = new SimpleCustomerService(customerRepository);
//	  assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
//	}
//}