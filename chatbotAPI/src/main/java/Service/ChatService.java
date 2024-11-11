package Service;

import Model.Mensagem;
import Repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public Mensagem salvarMensagem(Mensagem mensagem){
        return mensagemRepository.save(mensagem);
    }

    public List<Mensagem> buscarMensagens(){
        return mensagemRepository.findAll();
    }
}
