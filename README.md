# TP_DCC603

## Equipe

- Gleysson Coura: Banco de Dados
- Guilherme Mendonça: Backend
- Rafael Figueiredo: Frontend
- Yasmin Araujo: Frontend 

## Objetivo

Simular exercícios de matemática em interface web.

## Tecnologias
  
- Frontend: HTML e CSS
- Backend: SpringBoot (Java)
- BD: MySQL
- Organização: Trello

## Principais atores do Sistema

- Usuário comum
- Usuário administrador (adm)

## Backlog do Produto

- 1- * Como usuário adm, gostaria de acessar o sistema via login
- 2- * Como usuário adm, gostaria de gerenciar (CRUD) uma página de conteúdo (Seção) sobre um determinado tema em matemática
- 3- * Como usuário adm, gostaria de gerenciar perguntas/respostas (Quiz) para uma determinada Seção
- 4- Como usuário comum, gostaria de acessar o sistema via login
- 5- Como usuário comum, gostaria de pesquisar/filtrar e acessar diferentes Seções para ler seu conteúdo
- 6- Como usuário comum, gostaria de responder ao Quiz e conferir as respostas em cada Seção
- 7- Como usuário adm, gostaria de fazer comentários e correções em respostas dadas por usuários comuns
- 8- Como usuário comum, gostaria de compartilhar meu resultado em um Quiz
- 9- Como usuário comum, gostaria de avaliar um conteúdo e um Quiz
- 10- Como usuário comum, gostaria de rapidamente acessar todos os Quizes já respondidos por meu perfil
- 11- Como usuário comum e adm, gostaria de verificar as estatísticas de acerto globais para um Quiz
- 12- Como sistema, gostaria de conseguir construir um ranking de pontuação com base em acertos e em tempo de resolução do Quiz
- 13- Como usuário comum e adm, gostaria de acessar o ranking de pontuação

- "*" em andamento

## Backlog do Sprint

1:
- a) Construir Tela/interface de Login para Usuários administradores
- b) Construir Tabela 'usuario_adm' no banco para armazenar seus dados de login
- c) Construir funcionalidade de login no Backend
- d) Chamar funcionalidade de login no Frontend para o Backend. Validar logins mal sucedidos

2:
- a) Construir tabela 'secao' no banco
- b) Construir tela que liste todas as seções já cadastradas
- c) Construir tela que permita a inserção de novas seções
- d) Construir tela que permita a edição de seções já 
- e) Permitir que ele delete uma seção
- f) Construir funcionalidade para fazer o CRUD das seções

3:
- a) Construir a tabela pergunta no banco
- b) Construir a tabela alternativas no banco
- c) Construir tela para criar nova pergunta e colocar as respostas
- d) Fazer mapeamento das tabelas pergunta e resposta
- e) Construir funcionalidade para fazer o CRUD das perguntas 
- f) Construir funcionalidade para fazer o CRUD das respostas
- g) Construir tela que permita edição de perguntas e respostas

### Histórias

#### Concluídas

1:
- b) Gleysson
- c) Guilherme

2:
- a) Gleysson

3:
- a) Gleysson
- b) Gleysson

#### Pendentes

1:
- a) Rafael/Yasmin
- d) Rafael/Yasmin

2:
- b) Rafael/Yasmin
- c) Rafael/Yasmin
- d) Rafael/Yasmin
- e) Rafael/Yasmin
- f) Guilherme

3:
- c) Rafael/Yasmin
- d) Guilherme
- e) Guilherme 
- f) Guilherme
- g) Rafael/Yasmin

## Diagrama da Arquitetura

