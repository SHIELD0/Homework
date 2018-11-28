package org.westos.poker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.poker
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/26-21:36
 */
public class Poker {
    private static final int POKER_COUNT;
    private static final int COLOR_COUNT;
    private static final int NUM_COUNT;
    private static final Map<Integer, String> pokerMap;
    private static final String[] COLOR;
    private static final String[] NUM;
    private static ArrayList<Integer> pokerArrayList;
    private static ArrayList<Integer> userArrayList;
    private static ArrayList<Integer> user1;
    private static ArrayList<Integer> user2;
    private static ArrayList<Integer> user3;
    private static ArrayList<Integer> userPocket;

    static {
        POKER_COUNT = 54;
        COLOR_COUNT = 4;
        NUM_COUNT = 13;
        pokerMap = new HashMap<>();
        COLOR = new String[]{"♠", "♥", "♣", "♦"};
        NUM = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        userPocket = new ArrayList<>(3);
    }

    {
        pokerArrayList = new ArrayList<>(POKER_COUNT);
        user1 = new ArrayList<>();
        user2 = new ArrayList<>();
        user3 = new ArrayList<>();
    }

    private Poker() {
        initialize();
        show(pokerArrayList);
        shuffle();
        show(user1);
        show(user2);
        show(user3);
        show(userPocket);
    }

    private static final void initialize() {
        for (int i = 0; i < COLOR_COUNT; i++) {
            for (int j = 0; j < NUM_COUNT; j++) {
                pokerArrayList.add(i * NUM_COUNT + j);
                pokerMap.put(i * NUM_COUNT + j, COLOR[i].concat(NUM[j]));
            }
        }
        pokerArrayList.add(POKER_COUNT - 2);
        pokerMap.put(POKER_COUNT - 2, "☀");
        pokerArrayList.add(POKER_COUNT - 1);
        pokerMap.put(POKER_COUNT - 1, "🌙");
        userArrayList = (ArrayList<Integer>) pokerArrayList.clone();
    }

    private static void show(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf(pokerMap.get(arrayList.get(i)) + "\t");
        }
        System.out.println();
    }

    private static void shuffle() {
        Collections.shuffle(userArrayList);
        System.out.println("---");
        System.out.println(userArrayList);
        show(userArrayList);
        System.out.println("---");
        for (int i = 0; i < POKER_COUNT - 3; i++) {
            if (i % 3 == 0) {
                user1.add(userArrayList.get(i));
            } else if (i % 3 == 1) {
                user2.add(userArrayList.get(i));
            } else if (i % 3 == 2) {
                user3.add(userArrayList.get(i));
            }
        }
        for (int i = 0; i < userPocket.size(); i++) {
            userPocket.add(userArrayList.get(i + POKER_COUNT - 3));
        }
    }

    public static void main(String[] args) {
        Poker poker = new Poker();
    }
}
