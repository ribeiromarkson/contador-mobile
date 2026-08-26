    # Contador (mobile)

Markson SR:

É um app pra sistema android feito com Kotlin e Jetpack Compose.
A ideia é o número do contador ficar guardado com o `rememberSaveable` e `mutableStateOf`.
Apertando um dos botões (incrementar ou decrementar) o Jetpack faz a recomposição
da interface e altera na interface (da tela) o com o número novo no contador.

## Extras

O app é um trabalho acadêmico (programação mobile), então tinha alguns requisitos a mais
Os que fiz foram:

- D1 — Não deixar o contador ficar negativo.
- D2 — Colocar na interface um botão "Zerar" com `TextButton`.
- D3 — E fazer o número presente no contador continuar aparecendo na tela mesmo que ela seja rotada. E tinha que ser com `rememberSaveable`.