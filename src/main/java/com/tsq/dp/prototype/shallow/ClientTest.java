package com.tsq.dp.prototype.shallow;

public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("山羊", 2, "黑色");
        sheep.setFriend(new Sheep("绵羊", 3, "白色"));
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);

        System.out.println(sheep.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheep2.getFriend().hashCode());
    }
}
