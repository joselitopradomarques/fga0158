## 1. Classes a Serem Criadas

### 1.1. Cadastro de Professores (`CadastroProfessor`)

- **Atributos**: Lista de professores, contadores.
- **Métodos**:
  - `cadastrarProfessor(Professor p)`: Adiciona um professor.
  - `pesquisarProfessor(String matriculaFUB)`: Encontra um professor pela matrícula.
  - `atualizarProfessor(String matriculaFUB, Professor p)`: Atualiza informações de um professor.
  - `removerProfessor(Professor p)`: Remove um professor.

### 1.2. Cadastro de Disciplinas (`CadastroDisciplina`)

- **Atributos**: Lista de disciplinas, contadores.
- **Métodos**:
  - `cadastrarDisciplina(Disciplina d)`: Adiciona uma disciplina.
  - `pesquisarDisciplina(String codigoDisciplina)`: Encontra uma disciplina pelo código.
  - `atualizarDisciplina(String codigoDisciplina, Disciplina d)`: Atualiza informações de uma disciplina.
  - `removerDisciplina(Disciplina d)`: Remove uma disciplina.

### 1.3. Cadastro de Turmas (`CadastroTurma`)

- **Atributos**: Lista de turmas, contadores.
- **Métodos**:
  - `cadastrarTurma(Turma t)`: Adiciona uma turma.
  - `pesquisarTurma(String codigoTurma)`: Encontra uma turma pelo código.
  - `atualizarTurma(String codigoTurma, Turma t)`: Atualiza informações de uma turma.
  - `removerTurma(Turma t)`: Remove uma turma.
  - `imprimirListaPresenca(String codigoTurma)`: Imprime a lista de presença com o nome da disciplina, nome do professor, código da turma e lista de alunos.

### 1.4. Classes Adicionais

- **Disciplina**: Representa uma disciplina.
- **Turma**: Representa uma turma e associa disciplinas e professores.

## 2. Exceções a Serem Criadas

### 2.1. CampoEmBrancoException

- **Descrição**: Lançada quando um campo obrigatório está em branco.
- **Mensagem**: "O campo 'X' não pode estar em branco."

### 2.2. DisciplinaNaoAtribuidaException

- **Descrição**: Lançada quando uma turma é criada sem uma disciplina associada.
- **Mensagem**: "A disciplina não foi atribuída à turma."

### 2.3. ProfessorNaoAtribuidoException

- **Descrição**: Lançada quando uma turma é criada sem um professor associado.
- **Mensagem**: "O professor não foi atribuído à turma."

## 3. Implementações Necessárias

### 3.1. Implementar as Classes de Cadastro

- **CadastroProfessor**: Implementar métodos para adicionar, pesquisar, atualizar e remover professores.
- **CadastroDisciplina**: Implementar métodos para adicionar, pesquisar, atualizar e remover disciplinas.
- **CadastroTurma**: Implementar métodos para adicionar, pesquisar, atualizar e remover turmas, e para imprimir a lista de presença.

### 3.2. Implementar Classes de Domínio

- **Disciplina**: Implementar a classe para representar uma disciplina, incluindo atributos e métodos.
- **Turma**: Implementar a classe para representar uma turma, incluindo atributos e métodos para associar disciplinas e professores.

### 3.3. Implementar as Exceções

- **CampoEmBrancoException**: Criar a classe para a exceção.
- **DisciplinaNaoAtribuidaException**: Criar a classe para a exceção.
- **ProfessorNaoAtribuidoException**: Criar a classe para a exceção.

### 3.4. Implementar Métodos Específicos

- **Associar Disciplinas e Professores**: Garantir que ao cadastrar uma turma, uma disciplina e um professor sejam associados corretamente.
- **Imprimir Lista de Presença**: Implementar um método para listar a presença de uma turma conforme especificado.

## 4. Atualizações no Menu Principal

### 4.1. Atualizar o MenuPrincipal

- **Opções de Menu**:
  - **1 - Abrir cadastro de alunos**: Já existente.
  - **2 - Abrir cadastro de professores**: Adicionar a implementação para abrir o menu de cadastro de professores.
  - **3 - Abrir cadastro de disciplinas**: Adicionar a implementação para abrir o menu de cadastro de disciplinas.
  - **4 - Abrir cadastro de turmas**: Adicionar a implementação para abrir o menu de cadastro de turmas.

### 4.2. Criar Menus Correspondentes

- **MenuProfessor**: Interface para realizar operações de cadastro, pesquisa, atualização e remoção de professores.
- **MenuDisciplina**: Interface para realizar operações de cadastro, pesquisa, atualização e remoção de disciplinas.
- **MenuTurma**: Interface para realizar operações de cadastro, pesquisa, atualização e remoção de turmas e imprimir a lista de presença.

## 5. Validação e Exceções

### 5.1. Validação de Dados

- **Validação de Campos**: Verificar se campos obrigatórios não estão em branco e se CPF e email têm formatos válidos.

### 5.2. Tratamento de Exceções

- **Tratamento Adequado**: Garantir que as exceções criadas sejam lançadas e tratadas corretamente em todas as operações.

## 6. Testes

### 6.1. Testes Unitários

- **Cobertura de Código**: Escrever testes unitários para verificar o funcionamento correto das classes e métodos.

### 6.2. Testes de Integração

- **Integração de Componentes**: Realizar testes para garantir que a interação entre diferentes componentes do sistema esteja funcionando corretamente.

## 7. Documentação

### 7.1. Comentários e Javadoc

- **Documentação do Código**: Adicionar comentários e documentação Javadoc para garantir clareza no código.

### 7.2. README no GitHub

- **Instruções e Descrição**: Incluir informações detalhadas no README do repositório, como uma descrição do projeto, instruções para executar o programa e exemplos de uso.

## 8. Interface do Usuário

### 8.1. Menus Adicionais

- **Menus Específicos**: Implementar menus específicos para cada tipo de cadastro (alunos, professores, disciplinas, turmas) com opções completas de CRUD (Create, Read, Update, Delete).

### 8.2. Mensagens de Erro e Sucesso

- **Comunicação com o Usuário**: Fornecer mensagens claras e informativas para o usuário em caso de sucesso ou erro nas operações.
