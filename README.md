# BCC3004-SOLID

Atividade da disciplina de Engenharia de Software que tem como objetivo exemplificar quatro princípios da metodologia SOLID: Prefira Composição à Herança, Princípio da Segregação de Interfaces, Princípio da Responsabilidade Única e Princípio Aberto/Fechado.

## Principio de Aberto/Fechado
O Princípio Aberto/Fechado consiste em manter uma classe aberta para extensão, mas fechada para modificação, ainda que isso pareça contraditório à primeira vista. Isso significa que devemos projetar nossas classes de forma que seja possível adicionar novos comportamentos sem precisar alterar o código existente:
, 
## Prefira Composição à Herança
A utilização de composição em vez de herança é algo extremamente recomendada,pois a herança gera  forte acoplamento entre classes. Dificultando a manutenção e evolutiva do codigo fonte,por este motivo algumas linguagens como Go e Rust, não possui este recurso como algo nativo da mesma.

## Princípio da Segregação de Interfaces

O Princípio da Segregação de Interface afirma que nenhum cliente deve ser forçado a depender de métodos que não utiliza. Ou seja, é melhor ter várias interfaces específicas do que uma única interface genérica.

## Princípio da Responsabilidade Única
O Principio da Responsabilidade Única é a propriedade de uma classe possuir somente uma responsabilidade, na estrutura de software. um modulo não pode, de acordo com este princípio, possuir mais de uma obrigação na estruturação do software. A baixa coerência dificulta a manutenção e evolução do codigo fonte, podendo empactar modulos que não deveria ser impactados devido os mesmo possuirem muitas re.    
