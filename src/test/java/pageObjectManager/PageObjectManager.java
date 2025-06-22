package pageObjectManager;

import com.pageObjectModel.LoginpageModel;
import com.pageObjectModel.OrderpageModel;
import com.pageObjectModel.ShoppingpageModel;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private LoginpageModel loginpage;
	private OrderpageModel orderpagemodel;
	 private ShoppingpageModel shoppingpage;
	// private OrderJacketModel orderjacket;

	 
	 private FileReaderManager reader;
	
	public LoginpageModel getLoginpagemanager() {
		if(loginpage == null) {
			loginpage = new LoginpageModel();
		}
		return loginpage;
		}
	

	

	
	public OrderpageModel geOrderpageModel() {
		if(orderpagemodel==null) {
			orderpagemodel = new OrderpageModel();
		}
		return orderpagemodel;
	}

  
   public ShoppingpageModel getshoppingpageModel() {
	   if (shoppingpage==null) {
		   shoppingpage = new ShoppingpageModel();
	   }
	   return shoppingpage;
   }
   public FileReaderManager getFileReader() {
	   if (reader== null) {
		   reader = new FileReaderManager();
			   
		   }
	   return reader;
   }
}


		
	



