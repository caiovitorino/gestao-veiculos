# 🚗 TechRent Veículos - Sistema de Gestão de Frota

> Projeto desenvolvido em **Java** para a disciplina/atividade de **Programação Orientada a Objetos (POO)**.

O **TechRent Veículos** é uma aplicação Java de console projetada para resolver a necessidade de controle e gerenciamento de veículos para uma empresa de locação. O sistema substitui o controle manual anterior por um modelo moderno orientado a objetos, permitindo o cadastro, consulta e cálculo de locações de carros e motocicletas.

---

## 🎯 Objetivos do Projeto

- Representar entidades do mundo real em classes Java.
- Garantir a integridade dos dados por meio do encapsulamento.
- Reutilizar código e estruturar hierarquias com herança.
- Aplicar polimorfismo e sobrecarga de métodos para tratar comportamentos específicos de cada veículo.
- Demonstrar a manipulação de objetos filhos através de referências da classe pai.

---

## 🛠️ Conceitos de POO Aplicados

| Conceito | Descrição / Aplicação no Projeto |
| :--- | :--- |
| **Classes e Objetos** | Definição dos modelos `Veiculo`, `Carro`, `Motocicleta` e instanciação na classe `Main`. |
| **Encapsulamento** | Todos os atributos são `private`, acessíveis e alteráveis exclusivamente via **Getters e Setters**. |
| **Herança** | `Carro` e `Motocicleta` estendem a classe base `Veiculo` via `extends`, herdando atributos comuns (`marca`, `modelo`, `ano`, `valorDiaria`). |
| **Polimorfismo** | Uso da lista `List<Veiculo>` armazenando diferentes subtipos (`Carro` e `Motocicleta`), executando comportamentos específicos em tempo de execução. |
| **Sobrescrita (`@Override`)** | Redefinição do método `exibirInformacoes()` e do cálculo de diárias nas classes filhas para exibir detalhes como quantidade de portas ou cilindradas. |
| **Sobrecarga de Métodos** | Múltiplas assinaturas para `calcularValorDiaria()` em `Veiculo` (com e sem desconto percentual). |

---

## 📁 Estrutura do Projeto

```text
src/
├── Veiculo.java      # Classe pai contendo os atributos e métodos genéricos
├── Carro.java        # Subclasse com o atributo específico 'quantidadePortas'
├── Motocicleta.java  # Subclasse com o atributo específico 'cilindrada'
└── Main.java         # Classe principal para demonstração e execução do sistema
