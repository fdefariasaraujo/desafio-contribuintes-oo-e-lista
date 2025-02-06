# DESAFIO: Contribuintes OO e Lista.

## Regras para Cálculo do Imposto de Renda

Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras:

## 1. Imposto sobre Salário
A pessoa paga imposto sobre seu salário conforme a tabela abaixo:
- Salário:
  - Abaixo de 3000 por mês: **Isento**
  - 3000 até 5000 exclusive: **10%**
  - 5000 ou acima: **20%**

## 2. Imposto sobre Renda de Prestação de Serviços
Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de **15%**.

## 3. Imposto sobre Ganho de Capital
Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de **20%**.

## 4. Abatimento de Gastos Médicos e Educacionais
A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e educacionais podem ser abatidos.

# Programa para Cálculo do Imposto de Renda

Você deve fazer um programa para ler os dados de N contribuintes, armazenando os dados desses contribuintes em uma lista. Depois, você deve mostrar, para cada contribuinte, um resumo do imposto conforme exemplo abaixo.

## Classe TaxPayer

Você deve utilizar uma classe `TaxPayer` conforme projeto ao lado para representar cada contribuinte. Repare que sua lista vai ter que ser uma `List<TaxPayer>`. Lembre-se de respeitar os nomes apresentados no projeto ao lado (como foi fornecido o projeto para você executar, você tem que respeitar a especificação do projeto). Sinta-se livre para implementar construtores pra facilitar a instanciação dos objetos.

![Image](https://github.com/user-attachments/assets/55b1ecfe-b33f-40f5-b545-3d10b8b6b9f5)

# Exemplo

```plaintext
Quantos contribuintes você vai digitar? 2 

Digite os dados do 1º contribuinte:
Renda anual com salário: 48000.00 
Renda anual com prestação de serviço: 0.00 
Renda anual com ganho de capital: 800.00 
Gastos médicos: 400.00 
Gastos educacionais: 5400.00 

Digite os dados do 2º contribuinte:
Renda anual com salário: 189000.00 
Renda anual com prestação de serviço: 55184.93 
Renda anual com ganho de capital: 20000.00 
Gastos médicos: 600.00 
Gastos educacionais: 7500.00 

Resumo do 1º contribuinte:
Imposto bruto total: 4960.00 
Abatimento: 1488.00 
Imposto devido: 3472.00 

Resumo do 2º contribuinte:
Imposto bruto total: 50077.74 
Abatimento: 8100.00 
Imposto devido: 41977.74
