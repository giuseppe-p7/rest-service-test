package com.example.restservice;

import com.example.restservice.model.FabrickModel;
import com.example.restservice.response.FabrickBonificoResponse;
import com.example.restservice.response.FabrickResponse;
import com.example.restservice.response.FabrickSaldoResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FabrickService {
    public FabrickSaldoResponse getSaldo (HttpEntity e) throws ParseException, IOException {
        String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts";
        RestTemplate restTemplate = new RestTemplate();
        FabrickResponse result = restTemplate.exchange(url, HttpMethod.GET, e, FabrickResponse.class).getBody();
        Collection<List<FabrickModel>> b = result.getPayload().values();
        List<List<FabrickModel>> lista = b.stream().collect(Collectors.toList());
        List<FabrickModel> listF = lista.get(0);
        Optional<FabrickModel> trovato = listF.stream().findFirst().filter(trova -> ("14537780").equalsIgnoreCase(trova.getAccountId()));
        if(trovato.isPresent()){
            FabrickSaldoResponse response = new FabrickSaldoResponse();
            response.setStatus("OK");
            response.setError(new ArrayList());
            HashMap<String, String> value = new HashMap<>();
            // simula la visualizziazione di un saldo
            value.put("saldo", "800");
            value.put("params", "");
            response.setPayload(value);
            return response;
        }
        return null;
    }

    public Object effettuaBonifico  (String accountId, HttpEntity e){
        String url = "https://sandbox.platfr.io" + "/api/gbs/banking/v4.0/accounts/" +
                accountId + "/payments/money-transfers";
        RestTemplate restTemplate = new RestTemplate();
        try {
            Object result = restTemplate.postForObject(url, e, Object.class);
        }catch (HttpClientErrorException error){
            FabrickBonificoResponse response = new FabrickBonificoResponse();
            // simula un errore sulla transazione di un bonifico
            response.setStatus("KO");
            HashMap<String, String> value = new HashMap<>();
            value.put("code", "API000");
            value.put("description", "Errore tecnico  La condizione BP049 non e' prevista per il conto id 14537780");
            value.put("params", "");
            response.setError(value);
            return response;
        }
        return null;
    }

    public List<List<FabrickModel>> getListaTransazioni (HttpEntity e) throws ParseException, IOException {
        String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts";
        RestTemplate restTemplate = new RestTemplate();
        FabrickResponse result = restTemplate.exchange(url, HttpMethod.GET, e, FabrickResponse.class).getBody();
        Collection<List<FabrickModel>> b = result.getPayload().values();
        List<List<FabrickModel>> lista = b.stream().collect(Collectors.toList());
        return lista;
    }
}
