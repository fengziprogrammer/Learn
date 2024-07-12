package com.itcast;

/*
    Game游戏类
        游戏名称 name
        发行公司 developer
        发行时间 date
        游戏类型 type
        游戏人数 players
        游戏画面 gameScreen
 */
public class Game {
    //成员变量
    private String name;
    private String developer;
    private String date;
    private String type;
    private int players;
    private String gameScreen;

    //构造方法 -> Alt+Insert -> Constr.... -> 空参/带参
    public Game() {
    }

    public Game(String name, String developer, String date, String type, int players, String gameScreen) {
        this.name = name;
        this.developer = developer;
        this.date = date;
        this.type = type;
        this.players = players;
        this.gameScreen = gameScreen;
    }

    //成员方法 -> Alt+Insert -> Getter&Setter -> 全选
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getGameScreen() {
        return gameScreen;
    }

    public void setGameScreen(String gameScreen) {
        this.gameScreen = gameScreen;
    }

    //提供一个show方法,用来展示对象所有属性
    public void show(){
        System.out.println("游戏名称:" + name);
        System.out.println("发行公司:" + developer);
        System.out.println("发行时间:" + date);
        System.out.println("游戏类型:" + type);
        System.out.println("游戏人数:" + players);
        System.out.println("游戏画面:" + gameScreen);
    }
}
