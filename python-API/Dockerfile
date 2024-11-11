FROM python:3.11-slim

# Setar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo de requisitos
COPY requirements.txt /app/

# Instalar as dependências
RUN pip install --no-cache-dir -r requirements.txt

# Copiar o código da aplicação
COPY . /app/

# Expor a porta que o serviço vai rodar
EXPOSE 5000

# Comando para rodar a aplicação
CMD ["python", "app.py"]