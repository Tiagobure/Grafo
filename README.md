# Grafos
***
Grafos são estruturas matemáticas usadas para representar relações entre objetos. Eles consistem em vértices (ou nós) e arestas (ou arcos) que conectam esses vértices. Grafos são amplamente utilizados em diversas áreas, como computação, matemática, engenharia, biologia, redes sociais, entre outras.
Componentes de um Grafo:

    Vértices (Nós): Representam os objetos ou entidades.

    Arestas: Representam as conexões ou relações entre os vértices.

        Em grafos não direcionados, as arestas não têm direção (exemplo: uma rede de amizades).

        Em grafos direcionados, as arestas têm direção (exemplo: uma rede de seguidores).

## Tipos de Grafos:

  ####  Grafo Simples:

        Não possui laços (arestas que conectam um vértice a ele mesmo) nem arestas múltiplas (mais de uma aresta conectando o mesmo par de vértices).

#### Grafo Direcionado (Digrafo):

        As arestas têm direção, indicando um sentido de relação (exemplo: A → B).

  #### Grafo Ponderado:

        As arestas possuem pesos ou custos associados (exemplo: distâncias entre cidades).

  #### Grafo Ciclo:

        Um grafo onde os vértices formam um único ciclo.

   #### Grafo Completo:

        Todos os vértices estão conectados entre si por arestas.

  #### Grafo Bipartido:

        Os vértices podem ser divididos em dois conjuntos, onde todas as arestas conectam vértices de conjuntos diferentes.

  ####  Árvore:

        Um grafo conexo sem ciclos

![file-PJNp3W5kjY3HfxtwptKqAc](https://github.com/user-attachments/assets/c909700e-2e02-41f7-8d5d-5f53a69d5758)


# Busca em largura( Breadth-First Search (BFS))

A busca em largura, também conhecida como Breadth-First Search (BFS), é um algoritmo utilizado para percorrer ou buscar elementos em estruturas de dados como grafos ou árvores. A ideia principal é explorar todos os vértices ou nós de um grafo nível por nível, começando por um nó inicial e visitando todos os seus vizinhos antes de avançar para os vizinhos dos vizinhos.
Passos do Algoritmo BFS:

   ### Inicialização:

        Escolha um nó inicial (ou vértice) para começar a busca.

        Utilize uma fila (estrutura FIFO - First In, First Out) para armazenar os nós a serem visitados.

        Mantenha uma lista ou conjunto de nós já visitados para evitar repetições.

   ### Processamento:

        Adicione o nó inicial à fila e marque-o como visitado.

        Enquanto a fila não estiver vazia:

            Remova o primeiro nó da fila (nó atual).

            Para cada vizinho do nó atual que ainda não foi visitado:

                Adicione o vizinho à fila.

                Marque o vizinho como visitado.

  ### Finalização:

        O algoritmo termina quando a fila estiver vazia, ou seja, todos os nós alcançáveis a partir do nó inicial foram visitados.
