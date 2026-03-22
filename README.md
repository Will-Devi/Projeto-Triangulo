📝 COMANDO COMPLETO PARA CRIAR O README:

Copie este bloco TODINHO e cole no Termux:

```bash
cat > README.md << 'EOF'
# 🔺 Projeto Triângulo

## 📌 Sobre o Projeto

Programa em Java que calcula propriedades de triângulos:
- ✅ Verifica se 3 lados formam um triângulo válido
- 📐 Calcula o perímetro
- 📏 Calcula a área (fórmula de Heron)
- 🏷️ Classifica o tipo (equilátero, isósceles ou escaleno)

## 🧮 Lógica dos Cálculos

### 1. Validação
Um triângulo é válido quando cada lado é menor que a soma dos outros dois:
```

lado1 < lado2 + lado3
lado2 < lado1 + lado3
lado3 < lado1 + lado2

```

### 2. Perímetro
```

perímetro = lado1 + lado2 + lado3

```

### 3. Classificação
| Tipo | Condição |
|------|----------|
| Equilátero | lado1 = lado2 = lado3 |
| Isósceles | dois lados iguais |
| Escaleno | todos lados diferentes |

### 4. Área (Fórmula de Heron)
```

semiperímetro = (lado1 + lado2 + lado3) / 2
área = √[semiperímetro × (semiperímetro - lado1) × (semiperímetro - lado2) × (semiperímetro - lado3)]

```

## 📁 Estrutura do Projeto

```

Projeto-Triangulo/
├── README.md                 ← Você está aqui
├── .gitignore                ← Arquivos ignorados
└── ProjetoTriangulo/
├── src/
│   ├── ds/
│   │   └── Triangulo.java   ← Classe com os cálculos
│   └── ds2/
│       └── Principal.java    ← Classe com a interface
└── bin/                      ← Compilados (ignorados)

```

## 🚀 Como Executar

### Pré-requisito
Ter Java instalado. Verifique com:
```bash
java -version
```

Passo 1: Compilar

```bash
javac -d bin ProjetoTriangulo/src/ds/*.java ProjetoTriangulo/src/ds2/*.java
```

Passo 2: Executar

```bash
java -cp bin ds2.Principal
```

💻 Como Usar

1. O programa abre uma janela pedindo o primeiro lado
2. Digite um número e clique em OK
3. Repita para o segundo lado
4. Repita para o terceiro lado
5. O programa mostra:
   · Perímetro
   · Tipo do triângulo
   · Área

Exemplo prático:

Entrada:

· Lado 1: 3
· Lado 2: 4
· Lado 3: 5

Resultado:

```
perímetro 12.0
Tipo escaleno
area 6.0
```

👨‍💻 Autor

Will-Devil

📅 Data

Março 2026
