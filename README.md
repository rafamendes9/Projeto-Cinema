# Sistema de Gerenciamento de Cinema em Java

Este é um projeto de um sistema de gerenciamento de cinema desenvolvido em Java. O sistema é destinado a cinemas para gerenciar seus filmes, sessões, vendas de ingressos e outras operações relacionadas. Ele utiliza conceitos de programação orientada a objetos e fornece uma interface simples para o usuário interagir.

## Recursos

O sistema oferece as seguintes funcionalidades:

- Cadastro de Filmes: Adicione informações sobre os filmes em exibição, incluindo título, gênero, duração, elenco, diretor, entre outros.

- Gerenciamento de Sessões: Crie sessões de filmes com horários específicos, associando-as a filmes previamente cadastrados.

- Venda de Ingressos: Realize a venda de ingressos para as sessões, permitindo ao cliente escolher o número de ingressos e os lugares disponíveis.

- Relatórios de Vendas: Gere relatórios de vendas e estatísticas para análise de desempenho.

- Integração de Pagamento: Integre um sistema de pagamento para processar as transações de compra de ingressos.

## Estrutura do Projeto

O projeto está organizado em pacotes que refletem sua estrutura:

- `models`: Contém as classes de modelo, como `Filme`, `Sessao`, `Ingresso` etc.

- `controllers`: Mantém as classes controladoras que lidam com a lógica de negócios, como `FilmeController`, `SessaoController`, `VendaController` etc.

- `views`: Contém as interfaces de usuário, como a interface de linha de comando (`ConsoleView`) ou uma interface gráfica, se for o caso.

- `database`: Pode armazenar classes relacionadas ao armazenamento de dados, como acesso a um banco de dados.

- `payments`: Pode conter classes relacionadas ao processamento de pagamentos, como integrações com sistemas de pagamento.
