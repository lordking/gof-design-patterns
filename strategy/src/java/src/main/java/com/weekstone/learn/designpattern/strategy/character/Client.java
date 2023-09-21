package com.weekstone.learn.designpattern.strategy.character;


class Client {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();

        System.out.println("--------------------------------\n");

        Character queen = new Queen();
        queen.fight();

        System.out.println("--------------------------------\n");

        Character knight = new Knight();
        knight.fight();

        System.out.println("--------------------------------\n");

        Character troll = new Troll();
        troll.fight();
    }
}