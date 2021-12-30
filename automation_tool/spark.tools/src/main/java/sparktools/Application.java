package sparktools;

import sparktools.controllers.AppController;

public class Application {
	public static void main(String[] args) {
		System.out.println("::: APPLICATION START :::");
		AppController.run();
		System.out.println("::: APPLICATION END :::");
	}
}
