//package _16_12_2022.mockito.test.mockTest;
//
//import _16_12_2022.mockito.mock.*;
//import javaProf.unit.mockito.mock.*;
//import org.mockito.*;
//import static org.mockito.Mockito.*;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//class SimpleAuditServiceTest {
//
//	@Mock  // actually, this is a stub
//    TradeRepository tradeRepository;
//
//	@Mock  // and this one is indeed a mock
//    AuditService auditService;
//
//	@Test
//	public void testAuditLogEntryMadeForNewTrade() throws Exception {
//		Trade trade = new Trade("Ref 1", "Description 1");
//
//		when(tradeRepository.createTrade(trade)).thenReturn(anyLong());
//
//		TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
//		tradingService.createTrade(trade);
//
//		verify(auditService).logNewTrade(trade);
//	}
//}