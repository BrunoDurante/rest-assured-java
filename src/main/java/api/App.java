package api;

import api.methods.Get;

/**
 * Bruno Durante
 * 
 */
public class App {
	public static void main(String[] args) {
		
		String logradouro = Get.getApiBuscarCEP("09090150");
		System.out.println(logradouro);

	}
}
