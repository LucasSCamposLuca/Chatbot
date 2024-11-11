from flask import Flask, request, jsonify, Response
import requests

app = Flask(__name__)

# Exemplo de chave de autenticação da API do WhatsApp Business
WHATSAPP_API_TOKEN = "seu_token_de_api"

def verifica_autenticacao():
    auth = request.authorization
    if not auth or auth.username != 'user' or auth.password != 'password':
        return Response(
            'Acesso negado', 401,
            {'WWW-Authenticate': 'Basic realm="Login required"'}
        )

@app.route('/enviar_mensagem', methods=['POST'])
def enviar_mensagem():
    dados = request.json
    telefone = dados.get("telefone")
    mensagem = dados.get("mensagem")

    # Exemplo de integração com a API do WhatsApp (aqui, uma simulação)
    resposta = requests.post(
        "https://graph.facebook.com/v12.0/{phone_number_id}/messages",
        headers={"Authorization": f"Bearer {WHATSAPP_API_TOKEN}"},
        json={
            "messaging_product": "whatsapp",
            "to": telefone,
            "text": {"body": mensagem}
        }
    )

    return jsonify({"status": "Mensagem enviada", "detalhes": resposta.json()})

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000)
