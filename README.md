# Laboratório 2 - Atividade #1 - Tratamento de exceções
 Este projeto Java implementa uma classe MySet que simula um conjunto (set) de números inteiros (short int). 

## Como usar

1. **Execute a classe Main para iniciar o programa.**

2. **Inserção de Números**:
   - O programa solicitará que você insira números inteiros positivos. Digite cada número e pressione Enter.

3. **Tratamento de Erros**:
   - Se você inserir um número duplicado, inválido (menor ou igual a zero, ou maior que o valor máximo de um short) ou se o conjunto estiver cheio, o programa exibirá a mensagem de erro correspondente e continuará a solicitar novos números.

4. **Finalização**:
   - Para finalizar a inserção de números, digite um número negativo. O programa imprimirá o conteúdo final do conjunto, que conterá apenas os números válidos e não repetidos que você inseriu.

## Fluxograma

O fluxograma abaixo ilustra o funcionamento do código Java que implementa o conjunto personalizado MySet com tratamento de exceções:

![Fluxograma - MySetException - Mermaid.png](Fluxograma%20-%20MySetException%20-%20Mermaid.png)

**Código Mermaid**
```
graph TD
A[Início] --> B[Criar MySet]
B --> C[Ler número]
C --> D{Número < 0?}
D -->|Sim| E[Fim]
D -->|Não| F[Tentar adicionar número ao MySet]
F --> G{Sucesso?}
G -->|Sim| H[Imprimir 'Número adicionado']
H --> C
G -->|Não| I[Imprimir mensagem de erro]
I --> C
E[Fim]
```

**Explicação do Fluxograma:**

1. **Início**: O programa começa.
2. **Criar MySet**: Uma instância da classe MySet é criada para armazenar os números.
3. **Ler número**: O programa lê um número do usuário.
4. **Número < 0?**: Verifica se o número é negativo.
    - **Sim**: O programa termina.
    - **Não**: O programa continua.
5. **Tentar adicionar número ao MySet**: O programa tenta adicionar o número ao conjunto MySet.
6. **Sucesso?**: Verifica se a adição foi bem-sucedida.
    - **Sim**: O programa imprime a mensagem "Número adicionado" e volta para a etapa 3 para ler outro número.
    - **Não**: O programa imprime a mensagem de erro correspondente à exceção lançada (valor duplicado, valor inválido ou conjunto cheio) e volta para a etapa 3 para ler outro número.
7. **Fim**: O programa termina quando o usuário insere um número negativo.

## Diagrama de Classes

O diagrama de classes em Mermaid a seguir representa as classes e suas relações no código Java do conjunto personalizado MySet com tratamento de exceções:

![Diagrama de Classes - MySetException - IntelliJ.png](Diagrama%20de%20Classes%20-%20MySetException%20-%20IntelliJ.png)
Diagrama gerado pelo IntelliJ

![Diagrama de Classes - MySetException - Mermaid.png](Diagrama%20de%20Classes%20-%20MySetException%20-%20Mermaid.png)
Diagrama gerado no Mermaid

**Código Mermaid**
```
classDiagram
    class ValorInvalidoException {
        +ValorInvalidoException(String)
    }

    class ValorDuplicadoException {
        +ValorDuplicadoException(String)
    }

    class ConjuntoCheioException {
        +ConjuntoCheioException(String)
    }

    class MySet {
        +MySet()
        -TAMANHO_MAX: int
        -elemento: int[]
        -tamanho: int
        +add(int): void
        +printSet(): void
    }

    class Main {
        -Main()
        +main(String[]): void
    }

    ValorInvalidoException <|-- MySet: <<create>>
    ValorDuplicadoException <|-- MySet: <<create>>
    ConjuntoCheioException <|-- MySet: <<create>>
    MySet <|-- Main: <<create>>
```

## Explicação:

**ValorInvalidoException, ValorDuplicadoException, ConjuntoCheioException**: São classes de exceção que podem ser lançadas pela classe MySet em caso de erro (valor inválido, valor duplicado ou conjunto cheio). A relação de herança com a classe Exception (implícita em Java) não é mostrada no diagrama para simplificar.

**MySet**: A classe principal que implementa o conjunto personalizado. Possui atributos para armazenar os elementos (`elemento`), o tamanho máximo do conjunto (`TAMANHO_MAX`) e o tamanho atual (`tamanho`). Os métodos `add` e `printSet` são usados para adicionar elementos ao conjunto e imprimir o conteúdo do conjunto, respectivamente.

**Main**: A classe que contém o método `main`, o ponto de entrada do programa. Cria uma instância da classe MySet e interage com ela para adicionar elementos e imprimir o resultado final.

### Relacionamentos:

- As setas tracejadas com a etiqueta `<<create>>` indicam que as classes de exceção são criadas pela classe MySet quando ocorrem os respectivos erros.
- A seta tracejada com a etiqueta `<<create>>` entre MySet e Main indica que a classe Main cria uma instância da classe MySet.

## Resultados

| Número Inserido | Mensagem de Saída                       | Resultado da Operação |
|-----------------|-----------------------------------------|-----------------------|
| 1               | Número adicionado: 1                    | Adição bem-sucedida   |
| 3               | Número adicionado: 3                    | Adição bem-sucedida   |
| 2               | Número adicionado: 2                    | Adição bem-sucedida   |
| 3               | Valor já existente: 3                   | Exceção lançada       |
| 5               | Número adicionado: 5                    | Adição bem-sucedida   |
| 4               | Número adicionado: 4                    | Adição bem-sucedida   |
| 252858988       | Valor inválido: 252858988               | Exceção lançada       |
| 4               | Valor já existente: 4                   | Exceção lançada       |
| 9               | Número adicionado: 9                    | Adição bem-sucedida   |
| -1              | Conteúdo final do conjunto: 1 3 2 5 4 9 | Fim da entrada        |

## Análise:

- Os números 1, 3, 2, 5, 4 e 9 foram adicionados com sucesso ao conjunto, pois eram valores válidos e não repetidos.
- As tentativas de adicionar 3 (repetido), 4 (repetido) e 252858988 (inválido) resultaram em exceções, que foram capturadas e suas mensagens exibidas.
- A inserção de -1 encerrou o loop de entrada e o conteúdo final do conjunto foi impresso.

![Resultado - MySetExceptio - IntelliJ.png](Resultado%20-%20MySetExceptio%20-%20IntelliJ.png)