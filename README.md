# Aplicativo com padrão de arquitetura MVC (Model-View-Controller)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white) ![Android Studio](https://img.shields.io/badge/android%20studio-346ac1?style=for-the-badge&logo=android%20studio&logoColor=white)

Este projeto é um exemplo prático de como implementar a arquitetura **MVC (Model-View-Controller)** em um aplicativo Android. A ideia principal é simular a recuperação de usuários de uma API e organizar o código de maneira clara e modular.

## 🛠️ Estrutura do Projeto

### 🟥 **Model**
O **Model** é responsável por:
- Simular chamadas à API para recuperar os dados de usuários.
- Processar e fornecer os dados ao **Controller**.

### 🟩 **View**
A **View** é responsável por:
- Exibir as informações para o usuário.
- Receber interações do usuário e repassá-las para o **Controller**.

No projeto, a **View** é implementada pela `MainActivity`, que:
- Mostra os dados dos usuários na interface.
- Define métodos de exibição que são chamados pelo **Controller**.

### 🟦 **Controller**
O **Controller** é responsável por:
- Fazer a ponte entre o **Model** e a **View**.
- Recuperar os dados do **Model**.
- Passar os dados processados para a **View** exibi-los.

## Fluxo de Funcionamento

1. O usuário clica no botão na interface da `MainActivity`.
2. O **Controller** é acionado pelo clique e solicita os dados ao **Model** (simulando a chamada a uma API).
3. O **Model** retorna os dados para o **Controller**.
4. O **Controller** passa os dados processados para a **View** exibi-los.

## 📂 Organização dos Pacotes

- `model`: Contém classes responsáveis pela lógica de dados, como:
  - Representações de dados (`Usuario`).
  - Funções que simulam chamadas à API.

- `view`: Contém classes responsáveis pela interface com o usuário (UI), como a `MainActivity`.

- `controller`: Contém o `usuarioController`, que conecta o **Model** e a **View**.

## 🚨 Desvantagens

1. **Alto Acoplamento da View com o Controller**: Para que o **Controller** chame o método de exibição na **View**, é necessário passar uma instância da `MainActivity` para o **Controller**, o que cria um acoplamento forte entre essas duas camadas. Isso pode dificultar a manutenção do código e torná-lo menos modular.

2. **Dificuldade para Testes**: Como a **View** é baseada em uma **Activity**, não podemos instanciá-la diretamente nos testes. Isso pode dificultar a realização de testes unitários eficientes para o **Controller**, já que ele depende de uma instância da **MainActivity** para interagir com a interface.

## 🧑‍💻 Contato
Entre em contato! 😁

**Bruno Vivian Carvalho**

[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/bvcarvalho/)](https://www.linkedin.com/in/bvcarvalho/)
