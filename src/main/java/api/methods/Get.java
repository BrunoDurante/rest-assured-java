package api.methods;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import setup.SetupRequisitions;

public class Get {
	public static String getApiBuscarCEP(String cep) {
		SetupRequisitions.setup(200);
		ValidatableResponse res = RestAssured.given().when().get("{cep}" + "/json/", cep).then();
		String logradouro = res.extract().body().jsonPath().get("logradouro").toString();
		return logradouro;
	}

}
