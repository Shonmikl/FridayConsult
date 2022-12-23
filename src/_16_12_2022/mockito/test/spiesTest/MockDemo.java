//package _16_12_2022.mockito.test.spiesTest;
//
//import java.util.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//@ExtendWith(MockitoExtension.class)
//class MockDemo {
//
//	@Mock
//	List<String> listMock = new ArrayList<>();
//
//	@Test
//	public void testMockReturnsZero() throws Exception {
//		String str = "Mock";
//
//		listMock.add(str);
//
//		verify(listMock).add(str);
//		assertEquals(0, listMock.size());
//	}
//}