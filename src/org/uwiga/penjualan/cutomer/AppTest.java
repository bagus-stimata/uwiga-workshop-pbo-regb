package org.uwiga.penjualan.cutomer;

public class AppTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MasterCustomerModel model = new MasterCustomerModel();
		MasterCustomerView view = new MasterCustomerView(model);
		MasterCustomerController controller = new MasterCustomerController(view, model);
		view.setVisible(true);

	}

}
