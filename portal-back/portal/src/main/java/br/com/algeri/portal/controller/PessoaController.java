package br.com.algeri.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algeri.portal.model.Pessoa;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController extends GenericController<Pessoa, Integer> {

}