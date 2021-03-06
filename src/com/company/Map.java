package com.company;

import java.util.Arrays;


    public class Map {
        static public int sizeX = 10;
        static public int sizeY = 10;
        static public int maxShips = 3;

    char[][] map;
        boolean[][] ships;
        public int shipCount = 0;

    public Map(){
        map = new char[Map.sizeX][Map.sizeY];
        for(int i=0; i< map.length; i++){
            Arrays.fill(map[i], ' ');
        }

        ships = new boolean[Map.sizeX][Map.sizeY];
    }

    public boolean AddShip(int x, int y){
        if(ships[x][y]){
            return false;
        }

        shipCount++;
        ships[x][y] = true;
        return true;
    }

    public boolean Uncover(int x, int y){
        if(ships[x][y]){
            map[x][y] = '#';
            shipCount--;
            return true;
        } else{
            map[x][y] = '~';
            return false;
        }
    }

    public void Draw(){
        for (int y = -1; y < map.length; y++) {
            for (int x = -1; x < map.length; x++) {
                if(y == -1){
                    if(x == -1) {
                        System.out.print("   ");
                    } else{
                        System.out.print(" " + x + " ");
                    }
                } else if(x == -1){
                    System.out.print(" " + y + " ");
                } else {
                    System.out.print("[" + map[x][y] + "]");
                }
            }
            System.out.println();
        }
    }

}
