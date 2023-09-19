package xclasses;

import java.util.HashMap;
import java.util.Map;

public class teste {
    public static void main(String[] args) {

    Map<String, Integer> scores = new HashMap<>();

    scores.put("Isaac", 90);
    scores.put("Leandro", 100);
    scores.put("Brenda", 95);

    System.out.println("Pontuação de Brenda: " + scores.get(""));
    System.out.println("Tamanho do HashMap: " + scores.size());
    
    for (Map.Entry<String, Integer> entry: scores.entrySet()) {
        String name = entry.getKey();
        int score = entry.getValue();
        System.out.println(name + ": " + score);
    }
  }
}