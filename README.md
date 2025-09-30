# Giostri Construções

O projeto é um e-commerce para o Depósito Giostri, um estabelecimento especializado na venda de materiais de construção. A plataforma permitirá a comercialização e gestão de produtos, facilitando o processo de compra para clientes e otimizando o controle de estoque. Além disso, contará com funcionalidades para cadastro, atualização e consulta de produtos, garantindo eficiência na administração do negócio.

## Alunos integrantes da equipe

* Isabella Luiza Dias dos Santos
* Islayder Jackson Ribeiro de Oliveira
* Leandro Alencar Pereira Clemente
* Lucas Valente Alves
* Matheus Gaston Viana Silveira
* Rafael de Faria Neves Alves Franco

## Professores responsáveis

* Eveline Alonso Veloso
* Juliana Amaral Baroni de Carvalho

## Instruções de utilização

Acesse o sistema diretamente pelo link abaixo:

👉 [https://giostri-front.vercel.app/](https://giostri-front.vercel.app/)

Não é necessário instalar nada para utilizar a plataforma, basta acessar o endereço acima em seu navegador.

### Acesso de Administrador
- **E-mail:** admin@gmail.com
- **Senha:** Administrador@123

### Para desenvolvedores (opcional)

Se desejar rodar o sistema localmente, siga as instruções abaixo:

#### Pré-requisitos

- **Java 17** ou superior instalado
- **Maven** instalado
- **Node.js** e **npm** instalados (opcional, caso queira rodar um servidor para o frontend)

#### 1. Clonar o repositório

```bash
git clone https://github.com/ICEI-PUC-Minas-PMGES-TI/pmg-es-2025-1-ti3-9545100-giostri-construcoes.git
```

#### 2. Rodar o Backend

Entre na pasta do backend:

```bash
cd Codigo/backend
```

Compile e execute o projeto:

```bash
./mvnw spring-boot:run
```
Ou, no Windows:
```bash
mvnw.cmd spring-boot:run
```

O backend estará disponível em:  
`http://localhost:8080`

#### 3. Rodar o Frontend

Abra um segundo terminal e navegue até a pasta do frontend:

```bash
cd Codigo/frontend
```

Você pode abrir o arquivo `index.html` diretamente no navegador ou, para uma melhor experiência, rodar um servidor local. Por exemplo, usando o pacote `http-server`:

```bash
npm install -g http-server
http-server .
```

O frontend estará disponível em:  
`http://localhost:8080` (ou outra porta informada pelo terminal)

#### 4. Configurações adicionais

- Certifique-se de que o backend está rodando antes de acessar o frontend.
- Para funcionalidades que envolvem autenticação ou integração com serviços externos (ex: Mercado Pago), consulte a documentação interna do projeto ou arquivos de configuração em `Codigo/backend/src/main/resources/application.properties`.
