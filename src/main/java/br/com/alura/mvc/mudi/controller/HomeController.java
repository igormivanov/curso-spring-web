package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Notebook Inspiron 15");
		pedido.setUrlProduto("https://www.dell.com/pt-br/shop/notebooks/notebook-inspiron-15-5000/spd/inspiron-15-5510-laptop/i5510w7000w?gacd=9657105-15015-5761040-275878141-0&dgc=ST&cid=71700000099538578&gclid=Cj0KCQjwla-hBhD7ARIsAM9tQKshkUPwjNjI03XMB-lTperH9U70uLQOhG5K4DDsPfH-yH-wGMQU280aAncmEALw_wcB&gclsrc=aw.ds&nclid=NiYP_kyEYbEwp3qxY5rGkUBmhYKYTyR5j_znc1XAwvNCm-9YdF2S5od3QfBMOqRs");
		pedido.setUrlImagem("https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/inspiron-notebooks/inspiron-15-5510/media-gallery/notebook-in5510nt-cnb-05000ff090-gy-backlit_fpr.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=402&qlt=100,1&resMode=sharp2&size=402,402&chrss=full");
		pedido.setDescricao("Uma descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		
		return "home";
	}
}