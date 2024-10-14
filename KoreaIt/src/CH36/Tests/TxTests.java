package CH36.Tests;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Service.BookServiceImpl;
import CH36.Domain.Common.Service.UserServiceImpl;

class TxTests {

	@Test
	void Tx_1() throws Exception {
		
		BookServiceImpl service = BookServiceImpl.getInstance();
		service.txTests();
	
	}


}
