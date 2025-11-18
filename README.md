# ProjetoFacilitador
------

O **ProjetoFacilitador** é um pequeno sistema em linha de comando (CLI) criado para agilizar o lançamento de produtos.  
A ideia é simples: o usuário informa alguns dados básicos, e o sistema cruza essas informações com um arquivo `.csv`, gerando um arquivo de saída já organizado.

## Objetivo

O objetivo é automatizar uma tarefa repetitiva: consultar produtos e registrar informações de forma rápida e padronizada.

## Como funciona

O usuário digita:
- **EAN**
- **Lote**
- **Validade**
- **Quantidade**

O sistema lê um arquivo `.csv` existente e retorna um novo arquivo com:
- EAN informado  
- Código interno do produto 
- Descrição do produto  
- Lote  
- Validade  
- Quantidade digitada  

Tudo pronto para uso posterior ou integração em outros sistemas.

## Status

O projeto está em versão inicial, mas já funcional. A ideia é expandir com novas validações, leitura de múltiplos arquivos e integração com bancos de dados futuramente.