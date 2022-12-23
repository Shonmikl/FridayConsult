package _16_12_2022.mockito.stub;

import java.util.Collection;

public interface PricingService {

	// [... other methods ...]
	
	Price getHighestPricedTrade(Collection<Trade> trades);

}
