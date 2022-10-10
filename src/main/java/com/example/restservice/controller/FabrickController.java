package com.example.restservice.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.example.restservice.model.FabrickModel;
import com.example.restservice.response.FabrickSaldoResponse;
import com.example.restservice.FabrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FabrickController {

    @Autowired
    private FabrickService fabrickService;

    @GetMapping("/saldo")
    public FabrickSaldoResponse getSaldo(HttpEntity e) throws ParseException, IOException {
        return fabrickService.getSaldo(e);
    }
    @RequestMapping("/bonifico")
    public Object effettuaBonifico(@RequestParam(value = "accountId") String accountId, HttpEntity e) throws ParseException, IOException {
        return fabrickService.effettuaBonifico(accountId, e);
    }
    @RequestMapping("/listaTransazioni")
    public List<List<FabrickModel>> listaTransazioni(HttpEntity e) throws ParseException, IOException {
        return fabrickService.getListaTransazioni(e);
    }
}