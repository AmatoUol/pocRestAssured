package modulos.produtos;


import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de Api Rest do modulo de Produto")
public class ProdutoTest {
    @Test
    @DisplayName("Validar os limites proibidos do valor do Produto")
    public void testValidarLimitesProibidosValorProduto() {
        baseURI = "https://sandbox.moip.com.br";
        basePath = "/v2";

        String token = "Basic MFRPTlFTUFI0N0FUVlZKUUcxSEtNTlNVQ0VMVlVJQko6MTYxUUtVTEJKWVNWOE80WFdBU1ZQQjdSMUJVSEg3TkJSTVBaNk5IMA==";

        given()
              .contentType(ContentType.JSON)
              .header("Authorization", token)
              .body("{\n" +
                        "    \"id\": \"MOR-W0DJGQ4HQVG4\",\n" +
                        "    \"ownId\": \"ownId1679939550\",\n" +
                        "    \"status\": \"CREATED\",\n" +
                        "    \"createdAt\": \"2023-03-27T14:52:30.957-03\",\n" +
                        "    \"updatedAt\": \"\",\n" +
                        "    \"amount\": {\n" +
                        "        \"total\": 12000,\n" +
                        "        \"currency\": \"BRL\"\n" +
                        "    },\n" +
                        "    \"orders\": [\n" +
                        "        {\n" +
                        "            \"id\": \"ORD-EC1CPHISOQ2B\",\n" +
                        "            \"ownId\": \"ownId1679939550\",\n" +
                        "            \"status\": \"CREATED\",\n" +
                        "            \"platform\": \"V2\",\n" +
                        "            \"createdAt\": \"2023-03-27T14:52:30.958-03\",\n" +
                        "            \"updatedAt\": \"2023-03-27T14:52:30.958-03\",\n" +
                        "            \"amount\": {\n" +
                        "                \"paid\": 0,\n" +
                        "                \"total\": 4000,\n" +
                        "                \"fees\": 0,\n" +
                        "                \"refunds\": 0,\n" +
                        "                \"liquid\": 0,\n" +
                        "                \"otherReceivers\": 0,\n" +
                        "                \"currency\": \"BRL\",\n" +
                        "                \"subtotals\": {\n" +
                        "                    \"shipping\": 2000,\n" +
                        "                    \"addition\": 0,\n" +
                        "                    \"discount\": 0,\n" +
                        "                    \"items\": 2000\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"items\": [\n" +
                        "                {\n" +
                        "                    \"product\": \"Camisa Verde e Amarelo - Brasil\",\n" +
                        "                    \"price\": 2000,\n" +
                        "                    \"detail\": \"Seleção Brasileira\",\n" +
                        "                    \"quantity\": 1\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"customer\": {\n" +
                        "                \"id\": \"CUS-KJDZ1Z19VYWC\",\n" +
                        "                \"ownId\": \"ownId1679939550\",\n" +
                        "                \"fullname\": \"Joao Sousa\",\n" +
                        "                \"createdAt\": \"2023-03-27T14:52:30.974-03\",\n" +
                        "                \"updatedAt\": \"2023-03-27T14:52:30.977-03\",\n" +
                        "                \"birthDate\": \"1988-12-30\",\n" +
                        "                \"email\": \"joao.sousa@email.com\",\n" +
                        "                \"phone\": {\n" +
                        "                    \"countryCode\": \"55\",\n" +
                        "                    \"areaCode\": \"11\",\n" +
                        "                    \"number\": \"66778899\"\n" +
                        "                },\n" +
                        "                \"taxDocument\": {\n" +
                        "                    \"type\": \"CPF\",\n" +
                        "                    \"number\": \"35883280846\"\n" +
                        "                },\n" +
                        "                \"shippingAddress\": {\n" +
                        "                    \"zipCode\": \"01234000\",\n" +
                        "                    \"street\": \"Avenida hum\",\n" +
                        "                    \"streetNumber\": \"2927\",\n" +
                        "                    \"complement\": \"8\",\n" +
                        "                    \"city\": \"Sao Paulo\",\n" +
                        "                    \"district\": \"Itaim\",\n" +
                        "                    \"state\": \"SP\",\n" +
                        "                    \"country\": \"BRA\"\n" +
                        "                },\n" +
                        "                \"moipAccount\": {\n" +
                        "                    \"id\": \"MPA-860004CC0B93\"\n" +
                        "                },\n" +
                        "                \"_links\": {\n" +
                        "                    \"self\": {\n" +
                        "                        \"href\": \"https://sandbox.moip.com.br/v2/customers/CUS-KJDZ1Z19VYWC\"\n" +
                        "                    },\n" +
                        "                    \"hostedAccount\": {\n" +
                        "                        \"redirectHref\": \"https://hostedaccount-sandbox.moip.com.br?token=83bc74d0-bd55-4a85-b450-9a5422cd981d&id=CUS-KJDZ1Z19VYWC&mpa=MPA-HBKKXIFCY1N3\"\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"payments\": [],\n" +
                        "            \"escrows\": [],\n" +
                        "            \"refunds\": [],\n" +
                        "            \"entries\": [],\n" +
                        "            \"events\": [\n" +
                        "                {\n" +
                        "                    \"type\": \"ORDER.CREATED\",\n" +
                        "                    \"createdAt\": \"2023-03-27T14:52:30.958-03\",\n" +
                        "                    \"description\": \"\"\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"receivers\": [\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-10668B113716\",\n" +
                        "                        \"login\": \"ms2.30.blog@gmail.com\",\n" +
                        "                        \"fullname\": \"Mariana Santana\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"PRIMARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 1800,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-HBKKXIFCY1N3\",\n" +
                        "                        \"login\": \"ken@labs.moip.com.br\",\n" +
                        "                        \"fullname\": \"Teste Empresa\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"SECONDARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 2200,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"shippingAddress\": {\n" +
                        "                \"zipCode\": \"01234000\",\n" +
                        "                \"street\": \"Avenida hum\",\n" +
                        "                \"streetNumber\": \"2927\",\n" +
                        "                \"complement\": \"8\",\n" +
                        "                \"city\": \"Sao Paulo\",\n" +
                        "                \"district\": \"Itaim\",\n" +
                        "                \"state\": \"SP\",\n" +
                        "                \"country\": \"BRA\"\n" +
                        "            },\n" +
                        "            \"_links\": {\n" +
                        "                \"self\": {\n" +
                        "                    \"href\": \"https://sandbox.moip.com.br/v2/orders/ORD-EC1CPHISOQ2B\"\n" +
                        "                }\n" +
                        "            }\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"id\": \"ORD-D8BP7HNQ6U81\",\n" +
                        "            \"ownId\": \"ownId1679939550\",\n" +
                        "            \"status\": \"CREATED\",\n" +
                        "            \"platform\": \"V2\",\n" +
                        "            \"createdAt\": \"2023-03-27T14:52:30.996-03\",\n" +
                        "            \"updatedAt\": \"2023-03-27T14:52:30.996-03\",\n" +
                        "            \"amount\": {\n" +
                        "                \"paid\": 0,\n" +
                        "                \"total\": 4000,\n" +
                        "                \"fees\": 0,\n" +
                        "                \"refunds\": 0,\n" +
                        "                \"liquid\": 0,\n" +
                        "                \"otherReceivers\": 0,\n" +
                        "                \"currency\": \"BRL\",\n" +
                        "                \"subtotals\": {\n" +
                        "                    \"shipping\": 2000,\n" +
                        "                    \"addition\": 0,\n" +
                        "                    \"discount\": 0,\n" +
                        "                    \"items\": 2000\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"items\": [\n" +
                        "                {\n" +
                        "                    \"product\": \"Camisa Verde e Amarelo - Brasil\",\n" +
                        "                    \"price\": 2000,\n" +
                        "                    \"detail\": \"Seleção Brasileira\",\n" +
                        "                    \"quantity\": 1\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"customer\": {\n" +
                        "                \"id\": \"CUS-KJDZ1Z19VYWC\",\n" +
                        "                \"ownId\": \"ownId1679939550\",\n" +
                        "                \"fullname\": \"Joao Sousa\",\n" +
                        "                \"createdAt\": \"2023-03-27T14:52:30.974-03\",\n" +
                        "                \"updatedAt\": \"2023-03-27T14:52:30.999-03\",\n" +
                        "                \"birthDate\": \"1988-12-30\",\n" +
                        "                \"email\": \"joao.sousa@email.com\",\n" +
                        "                \"phone\": {\n" +
                        "                    \"countryCode\": \"55\",\n" +
                        "                    \"areaCode\": \"11\",\n" +
                        "                    \"number\": \"66778899\"\n" +
                        "                },\n" +
                        "                \"taxDocument\": {\n" +
                        "                    \"type\": \"CPF\",\n" +
                        "                    \"number\": \"35883280846\"\n" +
                        "                },\n" +
                        "                \"shippingAddress\": {\n" +
                        "                    \"zipCode\": \"01234000\",\n" +
                        "                    \"street\": \"Avenida hum\",\n" +
                        "                    \"streetNumber\": \"2927\",\n" +
                        "                    \"complement\": \"8\",\n" +
                        "                    \"city\": \"Sao Paulo\",\n" +
                        "                    \"district\": \"Itaim\",\n" +
                        "                    \"state\": \"SP\",\n" +
                        "                    \"country\": \"BRA\"\n" +
                        "                },\n" +
                        "                \"moipAccount\": {\n" +
                        "                    \"id\": \"MPA-860004CC0B93\"\n" +
                        "                },\n" +
                        "                \"_links\": {\n" +
                        "                    \"self\": {\n" +
                        "                        \"href\": \"https://sandbox.moip.com.br/v2/customers/CUS-KJDZ1Z19VYWC\"\n" +
                        "                    },\n" +
                        "                    \"hostedAccount\": {\n" +
                        "                        \"redirectHref\": \"https://hostedaccount-sandbox.moip.com.br?token=83bc74d0-bd55-4a85-b450-9a5422cd981d&id=CUS-KJDZ1Z19VYWC&mpa=MPA-HBKKXIFCY1N3\"\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"payments\": [],\n" +
                        "            \"escrows\": [],\n" +
                        "            \"refunds\": [],\n" +
                        "            \"entries\": [],\n" +
                        "            \"events\": [\n" +
                        "                {\n" +
                        "                    \"type\": \"ORDER.CREATED\",\n" +
                        "                    \"createdAt\": \"2023-03-27T14:52:30.996-03\",\n" +
                        "                    \"description\": \"\"\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"receivers\": [\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-10668B113716\",\n" +
                        "                        \"login\": \"ms2.30.blog@gmail.com\",\n" +
                        "                        \"fullname\": \"Mariana Santana\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"PRIMARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 1800,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-HBKKXIFCY1N3\",\n" +
                        "                        \"login\": \"ken@labs.moip.com.br\",\n" +
                        "                        \"fullname\": \"Teste Empresa\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"SECONDARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 2200,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"shippingAddress\": {\n" +
                        "                \"zipCode\": \"01234000\",\n" +
                        "                \"street\": \"Avenida hum\",\n" +
                        "                \"streetNumber\": \"2927\",\n" +
                        "                \"complement\": \"8\",\n" +
                        "                \"city\": \"Sao Paulo\",\n" +
                        "                \"district\": \"Itaim\",\n" +
                        "                \"state\": \"SP\",\n" +
                        "                \"country\": \"BRA\"\n" +
                        "            },\n" +
                        "            \"_links\": {\n" +
                        "                \"self\": {\n" +
                        "                    \"href\": \"https://sandbox.moip.com.br/v2/orders/ORD-D8BP7HNQ6U81\"\n" +
                        "                }\n" +
                        "            }\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"id\": \"ORD-FKCNK2HJVT82\",\n" +
                        "            \"ownId\": \"ownId1679939550\",\n" +
                        "            \"status\": \"CREATED\",\n" +
                        "            \"platform\": \"V2\",\n" +
                        "            \"createdAt\": \"2023-03-27T14:52:31.009-03\",\n" +
                        "            \"updatedAt\": \"2023-03-27T14:52:31.009-03\",\n" +
                        "            \"amount\": {\n" +
                        "                \"paid\": 0,\n" +
                        "                \"total\": 4000,\n" +
                        "                \"fees\": 0,\n" +
                        "                \"refunds\": 0,\n" +
                        "                \"liquid\": 0,\n" +
                        "                \"otherReceivers\": 0,\n" +
                        "                \"currency\": \"BRL\",\n" +
                        "                \"subtotals\": {\n" +
                        "                    \"shipping\": 3000,\n" +
                        "                    \"addition\": 0,\n" +
                        "                    \"discount\": 0,\n" +
                        "                    \"items\": 1000\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"items\": [\n" +
                        "                {\n" +
                        "                    \"product\": \"Camisa Preta - Alemanha\",\n" +
                        "                    \"price\": 1000,\n" +
                        "                    \"detail\": \"Camiseta da Copa 2014\",\n" +
                        "                    \"quantity\": 1\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"customer\": {\n" +
                        "                \"id\": \"CUS-KJDZ1Z19VYWC\",\n" +
                        "                \"ownId\": \"ownId1679939550\",\n" +
                        "                \"fullname\": \"Jose Silva\",\n" +
                        "                \"createdAt\": \"2023-03-27T14:52:30.974-03\",\n" +
                        "                \"updatedAt\": \"2023-03-27T14:52:31.017-03\",\n" +
                        "                \"birthDate\": \"1988-02-02\",\n" +
                        "                \"email\": \"jose.silva@email.com\",\n" +
                        "                \"phone\": {\n" +
                        "                    \"countryCode\": \"55\",\n" +
                        "                    \"areaCode\": \"11\",\n" +
                        "                    \"number\": \"66778899\"\n" +
                        "                },\n" +
                        "                \"taxDocument\": {\n" +
                        "                    \"type\": \"CPF\",\n" +
                        "                    \"number\": \"35883280846\"\n" +
                        "                },\n" +
                        "                \"shippingAddress\": {\n" +
                        "                    \"zipCode\": \"01234000\",\n" +
                        "                    \"street\": \"Avenida um\",\n" +
                        "                    \"streetNumber\": \"2927\",\n" +
                        "                    \"complement\": \"8\",\n" +
                        "                    \"city\": \"Sao Paulo\",\n" +
                        "                    \"district\": \"Itaim\",\n" +
                        "                    \"state\": \"SP\",\n" +
                        "                    \"country\": \"BRA\"\n" +
                        "                },\n" +
                        "                \"moipAccount\": {\n" +
                        "                    \"id\": \"MPA-860004CC0B93\"\n" +
                        "                },\n" +
                        "                \"_links\": {\n" +
                        "                    \"self\": {\n" +
                        "                        \"href\": \"https://sandbox.moip.com.br/v2/customers/CUS-KJDZ1Z19VYWC\"\n" +
                        "                    },\n" +
                        "                    \"hostedAccount\": {\n" +
                        "                        \"redirectHref\": \"https://hostedaccount-sandbox.moip.com.br?token=83bc74d0-bd55-4a85-b450-9a5422cd981d&id=CUS-KJDZ1Z19VYWC&mpa=MPA-HBKKXIFCY1N3\"\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"payments\": [],\n" +
                        "            \"escrows\": [],\n" +
                        "            \"refunds\": [],\n" +
                        "            \"entries\": [],\n" +
                        "            \"events\": [\n" +
                        "                {\n" +
                        "                    \"type\": \"ORDER.CREATED\",\n" +
                        "                    \"createdAt\": \"2023-03-27T14:52:31.009-03\",\n" +
                        "                    \"description\": \"\"\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"receivers\": [\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-10668B113716\",\n" +
                        "                        \"login\": \"ms2.30.blog@gmail.com\",\n" +
                        "                        \"fullname\": \"Mariana Santana\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"PRIMARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 1800,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"moipAccount\": {\n" +
                        "                        \"id\": \"MPA-B15FD85EFD22\",\n" +
                        "                        \"login\": \"lucasgomesamato@gmail.com\",\n" +
                        "                        \"fullname\": \"Teste Sandbox\"\n" +
                        "                    },\n" +
                        "                    \"type\": \"SECONDARY\",\n" +
                        "                    \"amount\": {\n" +
                        "                        \"total\": 2200,\n" +
                        "                        \"currency\": \"BRL\",\n" +
                        "                        \"fees\": 0,\n" +
                        "                        \"refunds\": 0\n" +
                        "                    },\n" +
                        "                    \"feePayor\": false\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"shippingAddress\": {\n" +
                        "                \"zipCode\": \"01234000\",\n" +
                        "                \"street\": \"Avenida um\",\n" +
                        "                \"streetNumber\": \"2927\",\n" +
                        "                \"complement\": \"8\",\n" +
                        "                \"city\": \"Sao Paulo\",\n" +
                        "                \"district\": \"Itaim\",\n" +
                        "                \"state\": \"SP\",\n" +
                        "                \"country\": \"BRA\"\n" +
                        "            },\n" +
                        "            \"_links\": {\n" +
                        "                \"self\": {\n" +
                        "                    \"href\": \"https://sandbox.moip.com.br/v2/orders/ORD-FKCNK2HJVT82\"\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"_links\": {\n" +
                        "        \"self\": {\n" +
                        "            \"href\": \"https://sandbox.moip.com.br/v2/orders/MOR-W0DJGQ4HQVG4\"\n" +
                        "        },\n" +
                        "        \"checkout\": {\n" +
                        "            \"payCreditCard\": {\n" +
                        "                \"redirectHref\": \"https://checkout-sandbox.moip.com.br/creditcard/MOR-W0DJGQ4HQVG4\"\n" +
                        "            },\n" +
                        "            \"payBoleto\": {\n" +
                        "                \"redirectHref\": \"https://checkout-sandbox.moip.com.br/boleto/MOR-W0DJGQ4HQVG4\"\n" +
                        "            },\n" +
                        "            \"payOnlineBankDebitItau\": {\n" +
                        "                \"redirectHref\": \"https://checkout-sandbox.moip.com.br/debit/itau/MOR-W0DJGQ4HQVG4\"\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("/multiorders")
                .then()
                .assertThat()
                    .body("status", equalTo("CREATED") )
                    .statusCode(201);


    }
}
