# Desafio 01 - Curso Java Spring - DEVSUPERIOR
trata-se de um estudo sobre inversão de controle e injeção de dependência

## O DESAFIO PROPOSTO: Componentes e injeção de dependência 
Criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. 

## REGRA DO CÁLCULO DO VALOR
Consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete. 

## REGRA DE APLICAÇÃO DO VALOR DO FRETE
Quando o valor básico do pedido (sem desconto), 
01. for inferior a R$ 100.00, o frete será de R$ 20.00
02. estiver entre R$ 100.00 e R$ 200.00 (exclusive), o frete será de R$ 12.00
03. for superior a R$ 200.00 NÂO HAVERÁ cobrança de frete.

## Tabela
![image](https://github.com/user-attachments/assets/83ef9683-ec27-4a83-b467-20c37d4fc6dc)


## PASSOS
1. criação do projeto Spring Boot.
2. criação da entidade domínio e demais componentes (serviços), calculo da nota e aplicação do frete cabível.
3. teste e execução aplicando o método __"construction injection (CDI)"__ - branch : __743979c__ 
4. teste e execução aplicando o método __"field injection"__ - branch : __51fb2fe__
5. teste e execução aplicando o método __"setter injection (SDI)"__ - branch : __aaa28bc__




