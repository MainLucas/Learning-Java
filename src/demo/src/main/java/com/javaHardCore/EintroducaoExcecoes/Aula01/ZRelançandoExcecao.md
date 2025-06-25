# Exceptions
## Classificadas em 2 categorias;
* __Checked Exception:__ exceções que devem ser tratadas pela pessoa desenvolvedora e que são verificadas pelo compilador. Este tipo de Exceção o tratamento é obrigatório.
* Unchecked Exception: exceções que podem ocorrer durante a execução do programa e não são verificadas pelo compilador. Geralmente estas Exceções são causadas por erros de lógica e o tratamento não é obrigatório.
## Principios Fundamentais
Um bom Sistema de Tratamento de Exceções procura sempre atender a 3 princípios fundamentais:

* Se antecipar aos problemas (uma das tarefas da pessoa desenvolvedora);
* Reverter situações de erro que podem ser revertidas;
* Buscar a Solução ideal para o tratamento de problemas de forma isolada do código principal.

## Estrutura try-catch-finally
### Try
é usada para indicar um bloco de código que possa lançar (throw) uma exceção

### Catch
Serve para manipular as exceções, ou seja, tratar o erro. Esse bloco será executado somente se o bloco try
apresentar alguma exceção.

### Finally
quando precisamos executar algum código independente se ocorrer a exception ou não

### Throws 
É usada na **assinatura de um método** para indicar que ele pode **lançar uma ou mais exceções** durante a execução. Ela serve para **avisar quem for usar o método** de que um erro pode ocorrer,
Ela é inserida na assinatura do Método, depois da lista de parâmetros do método e antes do corpo do método.

