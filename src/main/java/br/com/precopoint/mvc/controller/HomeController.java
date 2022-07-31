package br.com.precopoint.mvc.controller;

import br.com.precopoint.mvc.model.Produto;
import br.com.precopoint.mvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public ModelAndView carregaProdutos(){
        List<Produto> produtos = produtoRepository.findAll();
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("produtos",produtos);
        return mv;
    }
}
