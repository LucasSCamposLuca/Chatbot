package Controller;

import Model.Mensagem;
import Service.ChatService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/chat")
public class ChatControllers {
    @Autowired
    private ChatService chatService;

    @PostMapping("/mensagem")
    public Mensagem enviarMensagem(@RequestBody Mensagem mensagem){
        return chatService.salvarMensagem(mensagem);
    }

    @GetMapping("/mensagens")
    public List<Mensagem> obterMensagens(){
        return chatService.buscarMensagens();
    }
}
