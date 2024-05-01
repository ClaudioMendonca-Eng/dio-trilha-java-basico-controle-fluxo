# DIO - Trilha Java Básico - Controle Fluxo


| [![DIO.me](https://github.com/ClaudioMendonca-Eng/dio-trilha-java-basico/blob/main/img/dio.png)](https://dio.me) |
|:--:|
| Trilha de Back-end Java do Santander Bootcamp 2024! Durante este desafio de projeto, explorei vários cenários com fluxos condicionais, repetições e exceções. Ao final, pude exercitar todo o conteúdo ministrado nas aulas implementando um pequeno sistema contador. |
| <a href="https://www.youtube.com/watch?v=wtiaPK_200U" target="_blank"><img style="margin: 10px" height="200" width="200" src="https://github.com/ClaudioMendonca-Eng/dio-trilha-java-basico/blob/main/img/logoba.png" alt="Logo do BootCamp"/></a> |
| ##Apresentação do Desafio: |
| ![Apresentação do Desafio](/img/desafio-apresentacao.gif) |
| Exercío Prático do Curso |
| ![Apresentação do Exercío Prático do Curso ](/img/exercicio-apresentacao.gif) |



#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   


1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema. 

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham `??`

```java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```
