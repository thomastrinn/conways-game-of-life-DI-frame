# Conway's Game of Life Dependency Injection Frame

This is a visualizer for Conway's game of life using Java FX Canvas API and [Guice](https://github.com/google/guice) for enabling dependency injection. 

## Write your own implementation

The [Cell](/src/main/java/com/thomas/gameoflife/Cell.java) class represents a cell in the grid (what a surprise).
The [GameOfLife](/src/main/java/com/thomas/gameoflife/GameOfLife.java) class is responsible for evaluating the next generation of cells. The GameOfLife.nextGeneration() method gets a list of living cells and your task is to evaluate which one will die (remove from the list), wich one will live on and which are the new-born cells (add to the list).

## Conway's Game of Life

The "game" is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves or, for advanced players, by creating patterns with particular properties.

### Rules

The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, alive or dead. Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by under-population.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one). The rules continue to be applied repeatedly to create further generations.
